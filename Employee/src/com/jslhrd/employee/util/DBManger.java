package com.jslhrd.employee.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// DB 연결 전용 클래스
public class DBManger {
	public static Connection getConnection() {
		String myDriver = "oracle.jdbc.driver.OracleDriver";
		String myURL = "jdbc:oracle:thin:@localhost:1521/xe";
//		String myDriver = "com.mysql.jc.jdbc.Driver";
//		String myURL = "jdbc:mysql://localhost:3307/track2_12";
		String myID = "track2_12";
		String myPW = "1234";

		Connection conn = null;

		try {
			Class.forName(myDriver);
			conn = DriverManager.getConnection(myURL, myID, myPW);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static void close(Connection conn, PreparedStatement pstmt) {
		try {
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public static void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		try {
			rs.close();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
