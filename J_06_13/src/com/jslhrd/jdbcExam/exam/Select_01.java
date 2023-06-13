package com.jslhrd.jdbcExam.exam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.jslhrd.jdbcExam.util.DBManger;

public class Select_01 {
	public static void main(String[] args) {
		Connection conn = null;
		//Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		conn = DBManger.getConnection();
		try {			
			String sql = "";
			pstmt = conn.prepareStatement("select * from emp");
			rs = pstmt.executeQuery();
			// 출력테스트
			System.out.println("사번	이름");
			while(rs.next()) {//검색된 자료가 존재하면
				System.out.print(rs.getInt("eno") + "\t");
				//System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString("ename") + "\n");
				//System.out.print(rs.getString(2) + "\t");
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt, rs);
		}
	}
}
