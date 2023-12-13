package univ;

import java.sql.*; 
import javax.sql.DataSource; 
import java.util.ArrayList; 
import javax.naming.InitialContext; 

//DBCP를 이용한 테이블 student 처리 데이터베이스 연동 자바빈즈 프로그램
public class StudentDatabaseCP {

	// 데이터베이스 연결관련 변수 선언
	private Connection con = null;
	private PreparedStatement pstmt = null;
	private DataSource ds = null;

	// 등록한 DBCP 데이터소스 찾아 저장하는 생성자
	public StudentDatabaseCP() {
		try {
			InitialContext ctx = new InitialContext();
		    ds = (DataSource) ctx.lookup("java:comp/env/jdbc/mysql");
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
// 데이터소스를 통해 데이터베이스에 연결, Connection 객체에 저장하는 메소드 
void connect() {
	try {
	    con = ds.getConnection();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
	
	// 데이터베이스 연결 해제 메소드 
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

	// 게시판의 모든 레코드를 반환하는 메소드
	public ArrayList<StudentEntity> getStudentList() {	
		connect();
		ArrayList<StudentEntity> list = new ArrayList<StudentEntity>();
		
	String SQL = "select * from student";
	try {
		pstmt = con.prepareStatement(SQL);
		ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				//한 행의 학생정보를 저장할 학생을 위한 빈즈 객체 생성  
				StudentEntity stu = new StudentEntity();
				//한 행의 학생정보를 자바 빈즈 객체에 저장  				
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
				//리스트에 추가
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
