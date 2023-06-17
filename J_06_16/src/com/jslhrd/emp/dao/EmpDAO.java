package com.jslhrd.emp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.jslhrd.emp.dto.EmpDTO;
import com.jslhrd.emp.util.DBManger;

public class EmpDAO {
	private EmpDAO() {}
	
	private static EmpDAO instance = new EmpDAO();
	
	public static EmpDAO getInstance() {
		return instance;
	}

	public static List<EmpDTO> empList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<EmpDTO> list = new ArrayList<>();
		String query = "select ename, distinct dno from emp desc dno";
		
		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EmpDTO dto = new EmpDTO();
				dto.setEname(rs.getString("ename"));
				dto.setDno(rs.getInt("dno"));
				list.add(dto);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt, rs);
		}
		
		return list;
	}

	public static List<EmpDTO> lowSalEmp(int salary) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<EmpDTO> list = new ArrayList<>();
		String query = "select eno, ename, salary from emp where salary < ?";
		
		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, salary);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EmpDTO dto = new EmpDTO();
				dto.setEno(rs.getInt("eno"));
				dto.setEname(rs.getString("ename"));
				dto.setSalary(rs.getInt("salary"));
				list.add(dto);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt, rs);
		}
		
		return list;
	}

	public static List<EmpDTO> betweenSalEmp(int salary1, int salary2) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<EmpDTO> list = new ArrayList<>();
		String query = "select eno, ename, salary from emp where salary between ? and ?";
		
		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, salary1);
			pstmt.setInt(2, salary2);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EmpDTO dto = new EmpDTO();
				dto.setEno(rs.getInt("eno"));
				dto.setEname(rs.getString("ename"));
				dto.setSalary(rs.getInt("salary"));
				list.add(dto);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt, rs);
		}
		
		return list;
	}

	public static List<EmpDTO> searchCommissionEmp(int com1, int com2, int com3) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<EmpDTO> list = null;
		String query = "select eno, ename, commission from emp where commission = ? or commission = ? or commission = ? ";
		
		try {
			list = new ArrayList<>();
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, com1);
			pstmt.setInt(2, com2);
			pstmt.setInt(3, com3);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EmpDTO dto = new EmpDTO();
				dto.setEno(rs.getInt("eno"));
				dto.setEname(rs.getString("ename"));
				dto.setCommission(rs.getInt("commission"));
				list.add(dto);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt, rs);
		}
		
		return list;
	}

	public static List<EmpDTO> sortHiredateEmp() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<EmpDTO> list = null;
		String query = "select eno, ename, hiredate from emp order by hiredate desc";
		
		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			list = new ArrayList<>();
			while(rs.next()) {
				EmpDTO dto = new EmpDTO();
				dto.setEno(rs.getInt("eno"));
				dto.setEname(rs.getString("ename"));
				dto.setHiredate(rs.getString("hiredate"));
				list.add(dto);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt, rs);
		}
		
		return list;
	}

	public static List<EmpDTO> highSalEmpSortByHiredate() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<EmpDTO> list = null;
		String query = "select eno, ename, hiredate, salary, dno from emp where salary >= 2000 order by hiredate desc";
		
		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			list = new ArrayList<>();
			while(rs.next()) {
				EmpDTO dto = new EmpDTO();
				dto.setEno(rs.getInt("eno"));
				dto.setEname(rs.getString("ename"));
				dto.setHiredate(rs.getString("hiredate"));
				dto.setSalary(rs.getInt("salary"));
				dto.setDno(rs.getInt("dno"));
				list.add(dto);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt, rs);
		}
		
		return list;
	}

	public static List<EmpDTO> nameStartAEmpSortBySalary() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<EmpDTO> list = null;
		String query = "select * from emp where ename like 'A%' order by salary desc";
		
		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			list = new ArrayList<>();
			while(rs.next()) {
				EmpDTO dto = new EmpDTO();
				dto.setEno(rs.getInt("eno"));
				dto.setEname(rs.getString("ename"));
				dto.setHiredate(rs.getString("hiredate"));
				dto.setSalary(rs.getInt("salary"));
				dto.setDno(rs.getInt("dno"));
				list.add(dto);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt, rs);
		}
		
		return list;
	}

	public static List<EmpDTO> nameHaveNotAEmp() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<EmpDTO> list = null;
		String query = "select * from emp where ename not like '%A%'";
		
		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			list = new ArrayList<>();
			while(rs.next()) {
				EmpDTO dto = new EmpDTO();
				dto.setEno(rs.getInt("eno"));
				dto.setEname(rs.getString("ename"));
				dto.setHiredate(rs.getString("hiredate"));
				dto.setSalary(rs.getInt("salary"));
				dto.setDno(rs.getInt("dno"));
				list.add(dto);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt, rs);
		}
		
		return list;
	}

	public static int createEmp1() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int row = 0;
		String query = "create table emp1 as select * from emp where 1 = 2";
		
		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			row = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt);
		}
		
		return row;
	}

	public static int InsertEmp(int eno, String ename, String job, int manager) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int row = 0;
		String query = "insert into emp1(eno, ename, job, manager) values (?, ?, ?, ?)";
		
		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, eno);
			pstmt.setString(2, ename);
			pstmt.setString(3, job);
			pstmt.setInt(4, manager);
			row = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt);
		}
		
		return row;
	}

	public static int UpSal(int upSal) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int row = 0;
		String query = "Update emp set salary = salary * ?";
		
		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setDouble(1, (100+upSal)/100.);
			row = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt);
		}
		
		return row;
	}

	public static int updateHiredate(String ename) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int row = 0;
		String query = "Update emp set hiredate = sysdate where ename = ?";
		
		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, ename);
			row = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt);
		}
		
		return row;
	}

	public static int deleteEmpByHiredate(String hiredate) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int row = 0;
		String query = "delete from emp where hiredate > ?";
		
		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, hiredate);
			row = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt);
		}
		
		return row;
	}

	public static int deleteEmpHaveNotCommission() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int row = 0;
		String query = "delete from emp where commission is null";
		
		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			row = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt);
		}
		
		return row;
	}
	
	
}
