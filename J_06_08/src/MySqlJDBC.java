import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class MySqlJDBC {
	public static void main(String[] args) {
		String myDriver = "com.mysql.cj.jdbc.Driver";
		// String myURL = "jdbc:mysql://localhost:3307/track2_12"; // 5.1
		String myURL = "jdbc:mysql://localhost:3307/track2_12?serverTimezone=UTC"; // 8.0
		String myID = "track2_12"; 
		String myPass = "Ckdrl!004";
		// 1. JDBC 드라이버 로딩
		try {
			Class.forName(myDriver);
			// Class.forName("com.mysql.jdbc.Driver"); // 5.1
			System.out.println("MySQL JDBC 드라이버 로딩");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		// 2. Connection 객체 생성
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(myURL, myID, myPass);
			System.out.println("커넥션 연결 : " + conn);
		} catch(Exception e) {
			e.printStackTrace();
		}
		// 3. sql 작업
		Statement stmt = null;
		PreparedStatement pstmt = null;
		try {
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		// 4. 커넥션 닫기
		try {
			if (pstmt != null)
				pstmt.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		try {
			if (stmt != null)
				stmt.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		try {
			if (conn != null)
				conn.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
