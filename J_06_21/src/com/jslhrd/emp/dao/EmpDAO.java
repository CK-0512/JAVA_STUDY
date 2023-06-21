package com.jslhrd.emp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.jslhrd.emp.util.DBManger;

public class EmpDAO {
	private EmpDAO() {}
	
	private static EmpDAO instance = new EmpDAO();
	
	public static EmpDAO getInstance() {
		return instance;
	}
	//테이블 생성
	public int createTable() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int row = 0;
		String sql = "create table student2 (\r\n"
				+ "    studentNum number(5),\r\n"
				+ "    studentName varchar2(10),\r\n"
				+ "    birth char(8),\r\n"
				+ "    gender char(1),\r\n"
				+ "    regdate date\r\n"
				+ ")";
		
		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
			row = 1;
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt);
		}
		
		return row;
	}
	public int createTableByCmd(String tbname, String item1, String item2, String item3, String item4, String item5) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int row = 0;
		String sql = "create table " + tbname + " (\r\n"
				+ item1 + " number(5),\r\n"
				+ item2 + " varchar2(10),\r\n"
				+ item3 + " char(8),\r\n"
				+ item4 + " char(1),\r\n"
				+ item5 + " date\r\n"
				+ ")";
		
		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
			row = 1;
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt);
		}
		
		return row;
	}
	
	public boolean createTable2() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		boolean row = true;
		String sql = "create table dept_02 as select * from dept";
		
		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(sql);
			row = pstmt.execute();//모든 sql(결과값이 집합 true/false)
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt);
		}
		
		return row;
	}
	
	public int insertTable() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int row = 0;
		String sql = "insert into dept_02 select * from dept";
		
		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(sql);
			row = pstmt.executeUpdate();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt);
		}
		
		return row;
	}
}