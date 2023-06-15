package com.jslhrd.sawon.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.jslhrd.sawon.dto.EmpDTO;
import com.jslhrd.sawon.util.DBManger;

public class EmpDAO {
	private EmpDAO() {
	}

	private static EmpDAO instance = new EmpDAO();

	public static EmpDAO getInstance() {
		return instance;
	}

	// 등록메소드
	public int empInsert(EmpDTO emp) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		// 리턴타입
		int row = 0;
		// query문장
		String sql = "insert into emp values(?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emp.getEno());
			pstmt.setString(2, emp.getEname());
			pstmt.setString(3, emp.getJob());
			pstmt.setInt(4, emp.getManager());
			pstmt.setString(5, emp.getHiredate());
			pstmt.setInt(6, emp.getSalary());
			pstmt.setInt(7, emp.getCommission());
			pstmt.setInt(8, emp.getDno());
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt);
		}
		return row;
	}

	// 수정메소드
	public int empUpdate(EmpDTO emp) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int row = 0;
		String query = "update emp set hiredate = ?, salary = ?, dno = ? where eno = ?";
		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, emp.getHiredate());
			pstmt.setInt(2, emp.getSalary());
			pstmt.setInt(3, emp.getDno());
			pstmt.setInt(4, emp.getEno());
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt);
		}
		return row;
	}

	// 삭제메소드
	public int empDelete(EmpDTO emp) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int row = 0;
		String query = "delete emp where eno = ?";
		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, emp.getEno());
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt);
		}
		return row;
	}

	// 검색 (다중 레코드)
	public List<EmpDTO> empSelect() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		// 리턴타입
		List<EmpDTO> list = new ArrayList<>();
		String query = "select * from emp";
		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				EmpDTO dto = new EmpDTO();
				dto.setEno(rs.getInt("eno"));
				dto.setEname(rs.getString("ename"));
				dto.setJob(rs.getString("job"));
				dto.setManager(rs.getInt("manager"));
				dto.setHiredate(rs.getString("hiredate"));
				dto.setSalary(rs.getInt("salary"));
				dto.setCommission(rs.getInt("commission"));
				dto.setDno(rs.getInt("dno"));

				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt, rs);
		}
		return list;
	}

	public EmpDTO empSelect2(int eno) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		// 리턴타입
		EmpDTO dto = null;
		String query = "select * from emp where eno = ?";
		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, eno);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				dto = new EmpDTO();
				dto.setEno(rs.getInt("eno"));
				dto.setEname(rs.getString("ename"));
				dto.setJob(rs.getString("job"));
				dto.setManager(rs.getInt("manager"));
				dto.setHiredate(rs.getString("hiredate"));
				dto.setSalary(rs.getInt("salary"));
				dto.setCommission(rs.getInt("commission"));
				dto.setDno(rs.getInt("dno"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt, rs);
		}
		return dto;
	}

	public List<EmpDTO> empSelect3(int dno) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		// 리턴타입
		List<EmpDTO> list = new ArrayList<>();
		String query = "select * from emp where dno = ?";
		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, dno);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				EmpDTO dto = new EmpDTO();
				dto.setEno(rs.getInt("eno"));
				dto.setEname(rs.getString("ename"));
				dto.setJob(rs.getString("job"));
				dto.setManager(rs.getInt("manager"));
				dto.setHiredate(rs.getString("hiredate"));
				dto.setSalary(rs.getInt("salary"));
				dto.setCommission(rs.getInt("commission"));
				dto.setDno(rs.getInt("dno"));

				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt, rs);
		}
		return list;
	}
}
