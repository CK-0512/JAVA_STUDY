package exam;

import java.sql.Connection;
import java.sql.PreparedStatement;

import util.DBManger;

public class DBTest {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBManger.getConnection();
			System.out.println("conn :" + conn);
			pstmt = conn.prepareStatement("select * from tab");
			System.out.println("pstmt :" + pstmt);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt);
		}
	}
}
