import java.sql.*;
public class DBTest {
	public static void main(String[] args) {
		Connection conn = null;
		
		//JDBC 드라이버 로딩 및 커넥션 테스트
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "track2_12", "1234");
			System.out.println("conn : " + conn);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
