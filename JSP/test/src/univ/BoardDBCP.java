package univ;

import java.sql.*; 
import java.util.*; 
import javax.sql.*; 
import javax.naming.*; 

//DBCP를 이용한 테이블 board 처리 데이터베이스 연동 자바빈즈 프로그램
public class BoardDBCP {

	// 데이터베이스 연결관련 변수 선언
	private Connection con = null;
	private PreparedStatement pstmt = null;
	private DataSource ds = null;

	// JDBC 드라이버 로드 메소드
	public BoardDBCP() {
		try {
			InitialContext ctx = new InitialContext();
		    ds = (DataSource) ctx.lookup("java:comp/env/jdbc/mysql");
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	// 데이터베이스 연결 메소드 
	public void connect() {
		try {
		    con = ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 데이터베이스 연결 헤제 메소드 
	public void disconnect() {
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

	// 게시판의 모든 레코드를 반환 메서드
	public ArrayList<BoardEntity> getBoardList() {	
		connect();
		ArrayList<BoardEntity> list = new ArrayList<BoardEntity>();
		
		String SQL = "select * from board";
		try {
			pstmt = con.prepareStatement(SQL);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				BoardEntity brd = new BoardEntity();
				brd.setId ( rs.getInt("id") );
				brd.setName ( rs.getString("name") );
				brd.setPasswd ( rs.getString("passwd") );
				brd.setTitle ( rs.getString("title") );
				brd.setEmail ( rs.getString("email") );
				brd.setRegdate ( rs.getTimestamp("regdate") );
				brd.setContent ( rs.getString("content") );
				//리스트에 추가
				list.add(brd);
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

	// 주 키 id의 레코드를 반환하는 메서드
	public BoardEntity getBoard(int id) {	
		connect();
		String SQL = "select * from board where id = ?";
		BoardEntity brd = new BoardEntity();
		
		try {
			pstmt = con.prepareStatement(SQL);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();			
			rs.next();
			brd.setId ( rs.getInt("id") );
			brd.setName ( rs.getString("name") );
			brd.setPasswd ( rs.getString("passwd") );
			brd.setTitle ( rs.getString("title") );
			brd.setEmail ( rs.getString("email") );
			brd.setRegdate ( rs.getTimestamp("regdate") );
			brd.setContent ( rs.getString("content") );
			rs.close();			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		finally {
			disconnect();
		}
		return brd;
	}

	// 게시물 등록 메서드
	public boolean insertDB(BoardEntity board) {
		boolean success = false; 
		connect();
		String sql ="insert into board values(0, ?, ?, ?, ?, sysdate(), ?)";		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, board.getName());
			pstmt.setString(2, board.getPasswd());
			pstmt.setString(3, board.getTitle());
			pstmt.setString(4, board.getEmail());
			pstmt.setString(5, board.getContent());
			pstmt.executeUpdate();
			success = true; 
		} catch (SQLException e) {
			e.printStackTrace();
			return success;
		}
		finally {
			disconnect();
		}
		return success;
	}
	
	// 데이터 갱신을 위한 메서드
	public boolean updateDB(BoardEntity board) {
		boolean success = false; 
		connect();		
		String sql ="update board set name=?, title=?, email=?, content=? where id=?";	
		try {
			pstmt = con.prepareStatement(sql);
			// 인자로 받은 GuestBook 객체를 이용해 사용자가 수정한 값을 가져와 SQL문 완성
			pstmt.setString(1, board.getName());
			pstmt.setString(2, board.getTitle());
			pstmt.setString(3, board.getEmail());
			pstmt.setString(4, board.getContent());
			pstmt.setInt(5, board.getId());
			int rowUdt = pstmt.executeUpdate();
			//System.out.println(rowUdt);
			if (rowUdt == 1) success = true;
		} catch (SQLException e) {
			e.printStackTrace();
			return success;
		}
		finally {
			disconnect();
		}
		return success;
	}
	
	// 게시물 삭제를 위한 메서드
	public boolean deleteDB(int id) {
		boolean success = false; 
		connect();		
		String sql ="delete from board where id=?";
		try {
			pstmt = con.prepareStatement(sql);
			// 인자로 받은 주 키인 id 값을 이용해 삭제
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
			success = true;
		} catch (SQLException e) {
			e.printStackTrace();
			return success;
		}
		finally {
			disconnect();
		}
		return success;
	}

	// 데이터베이스에서 인자인 id와 passwd가 일치하는지 검사하는  메서드
	public boolean isPasswd(int id, String passwd) {
		boolean success = false;
		connect();		
		String sql ="select passwd from board where id=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			String orgPasswd = rs.getString(1);
			if ( passwd.equals(orgPasswd) ) success = true; 
			System.out.println(success);
			rs.close();			
		} catch (SQLException e) {
			e.printStackTrace();
			return success;
		}
		finally {
			disconnect();
		}
		return success;
	}
}