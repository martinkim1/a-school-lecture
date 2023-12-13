package univ;

import java.sql.*; 
import javax.sql.DataSource; 
import java.util.ArrayList; 
import javax.naming.InitialContext; 

//DBCP�� �̿��� ���̺� student ó�� �����ͺ��̽� ���� �ڹٺ��� ���α׷�
public class StudentDatabaseCP {

	// �����ͺ��̽� ������� ���� ����
	private Connection con = null;
	private PreparedStatement pstmt = null;
	private DataSource ds = null;

	// ����� DBCP �����ͼҽ� ã�� �����ϴ� ������
	public StudentDatabaseCP() {
		try {
			InitialContext ctx = new InitialContext();
		    ds = (DataSource) ctx.lookup("java:comp/env/jdbc/mysql");
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
// �����ͼҽ��� ���� �����ͺ��̽��� ����, Connection ��ü�� �����ϴ� �޼ҵ� 
void connect() {
	try {
	    con = ds.getConnection();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
	
	// �����ͺ��̽� ���� ���� �޼ҵ� 
	void disconnect() {
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} 
		if(con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// �Խ����� ��� ���ڵ带 ��ȯ�ϴ� �޼ҵ�
	public ArrayList<StudentEntity> getStudentList() {	
		connect();
		ArrayList<StudentEntity> list = new ArrayList<StudentEntity>();
		
	String SQL = "select * from student";
	try {
		pstmt = con.prepareStatement(SQL);
		ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				//�� ���� �л������� ������ �л��� ���� ���� ��ü ����  
				StudentEntity stu = new StudentEntity();
				//�� ���� �л������� �ڹ� ���� ��ü�� ����  				
				stu.setId ( rs.getString("id") );
				stu.setPasswd ( rs.getString("passwd") );
				stu.setName ( rs.getString("name") );
				stu.setYear ( rs.getInt("year") );
				stu.setSnum ( rs.getString("snum") );
				stu.setDepart ( rs.getString("depart") );
				stu.setMobile1 ( rs.getString("mobile1") );
				stu.setMobile2 ( rs.getString("mobile2") );
				stu.setAddress ( rs.getString("address") );
				stu.setEmail ( rs.getString("email") );
				//����Ʈ�� �߰�
				list.add(stu);
			}
			rs.close();			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		finally {
			disconnect();
		}
		return list;
	}

}
