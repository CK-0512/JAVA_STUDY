import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlConn {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");//jdbc 드라이버 로딩
			System.out.println("드라이버 로딩 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
		//db 연결
		try {
			String myURL = "jdbc:mysql://localhost:3306/track2_12";
			String myID = "track2_12";
			String myPass = "Ckdrl!004";
			Connection conn = DriverManager.getConnection(myURL, myID, myPass);
			System.out.println("커넥션 : " + conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
