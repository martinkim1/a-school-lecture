package univ;

import java.sql.*; 
import java.util.ArrayList; 

// 테이블 student를 위한 데이터베이스 연동 자바빈즈 프로그램
public class StudentDatabase {

	// 데이터베이스 연결 관련 상수 선언
	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/univdb";
	private static final String USER = "root";
	private static final String PASSWD = "1234";

	// 데이터베이스 연결 관련 변수 선언
	private Connection con = null;
	private Statement stmt = null;

	// JDBC 드라이버를 로드하는 생성자
	public StudentDatabase() {
		// JDBC 드라이버 로드
		try {
			Class.forName(JDBC_DRIVER);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	// 데이터베이스 연결 메소드
	public void connect() {
		try {
			// 데이터베이스에 연결, Connection 객체 저장 
			con = DriverManager.getConnection(JDBC_URL, USER, PASSWD);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 데이터베이스 연결 해제 메소드 
	public void disconnect() {
		if(stmt != null) {
			try {
				stmt.close();
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
		// 질의 결과를 저장할 ArrayList를 선언
		// ArrayList 내부에는 학생정보를 저장한 StudentEntity가 삽입
		ArrayList<StudentEntity> list = new ArrayList<StudentEntity>();

		String SQL = "select * from student";
		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(SQL);

			//ResultSet의 결과에서 모든 행을 각각의 StudentEntity 객체에 저장  
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
				//ArrayList에 학생정보 StudentEntity 객체를 추가
				list.add(stu);
			}
			rs.close();			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		finally {
			disconnect();
		}
		//완성된 ArrayList 객체를 반환
		return list;
	}

}
