package com.jslhrd.employee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.jslhrd.employee.dto.EmpDTO;
import com.jslhrd.employee.util.DBManger;

public class EmpDAO {
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	String query;
	
	public EmpDAO() {
		this.conn = null;
		this.pstmt = null;
		this.rs = null;
		this.query = "";
	}
	
	public List<EmpDTO> getEmployees() {
		conn = null;
		pstmt = null;
		rs = null;
		List<EmpDTO> list = new ArrayList<>();
		query = "select e.*, d.dname from employee e, department d where e.dno = d.dno order by eno asc";
		
		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EmpDTO empDTO = new EmpDTO();
				empDTO.setEno(rs.getInt("eno"));
				empDTO.setEname(rs.getString("ename"));
				empDTO.setJob(rs.getString("job"));
				empDTO.setManager(rs.getInt("manager"));
				empDTO.setHiredate(rs.getString("hiredate"));
				empDTO.setSalary(rs.getInt("salary"));
				empDTO.setCommission(rs.getInt("commission"));
				empDTO.setDname(rs.getString("dname"));
				list.add(empDTO);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt, rs);
		}
		return list;
	}

	public void doRegister(EmpDTO empDTO) {
		conn = null;
		pstmt = null;
		String query = "insert into employee values(?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, empDTO.getEno());
			pstmt.setString(2, empDTO.getEname());
			pstmt.setString(3, empDTO.getJob());
			pstmt.setInt(4, empDTO.getManager());
			pstmt.setString(5, empDTO.getHiredate());
			pstmt.setInt(6, empDTO.getSalary());
			pstmt.setInt(7, empDTO.getCommission());
			pstmt.setInt(8, empDTO.getDno());
			pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt);
		}
	}

	public EmpDTO doSearch(int eno) {
		conn = null;
		pstmt = null;
		rs = null;
		EmpDTO searchedEmp = null;
		query = "select e.*, ee.ename managername, d.dname from employee e, employee ee, department d where e.dno = d.dno and e.manager = ee.eno and e.eno = ?";
		
		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, eno);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				searchedEmp = new EmpDTO();
				searchedEmp.setEno(rs.getInt("eno"));
				searchedEmp.setEname(rs.getString("ename"));
				searchedEmp.setJob(rs.getString("job"));
				searchedEmp.setManager(rs.getInt("manager"));
				searchedEmp.setHiredate(rs.getString("hiredate"));
				searchedEmp.setSalary(rs.getInt("salary"));
				searchedEmp.setCommission(rs.getInt("commission"));
				searchedEmp.setDno(rs.getInt("dno"));
				searchedEmp.setManagerName(rs.getString("managername"));
				searchedEmp.setDname(rs.getString("dname"));
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt, rs);
		}
		return searchedEmp;
	}

	public void doModify(EmpDTO searchedEmp) {
		conn = null;
		pstmt = null;
		String query = "update employee set ename = ?, job = ?, manager = ?, hiredate = ?, salary = ?, commission = ?, dno = ? where eno = ?";
		
		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, searchedEmp.getEname());
			pstmt.setString(2, searchedEmp.getJob());
			pstmt.setInt(3, searchedEmp.getManager());
			pstmt.setString(4, searchedEmp.getHiredate());
			pstmt.setInt(5, searchedEmp.getSalary());
			pstmt.setInt(6, searchedEmp.getCommission());
			pstmt.setInt(7, searchedEmp.getDno());
			pstmt.setInt(8, searchedEmp.getEno());
			pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt);
		}
	}

	public void doDelete(int eno) {
		conn = null;
		pstmt = null;
		String query = "delete employee where eno = ?";
		
		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, eno);
			pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt);
		}
	}
	
	public int getLastEno() {
		conn = null;
		pstmt = null;
		rs = null;
		int lastEno = 0;
		query = "select * from (select * from employee order by eno desc) where rownum = 1";
		
		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				lastEno = rs.getInt("eno");
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt, rs);
		}
		return lastEno;
	}
}
