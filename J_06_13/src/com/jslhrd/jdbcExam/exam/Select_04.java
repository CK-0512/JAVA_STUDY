package com.jslhrd.jdbcExam.exam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.jslhrd.jdbcExam.dto.EmpDTO;
import com.jslhrd.jdbcExam.util.DBManger;

public class Select_04 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<EmpDTO> list = new ArrayList<>();
		try {
			String query = "select * from emp where salary = 800 or salary = 1500 or salary = 3000";
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			EmpDTO dto = null;
			
			while(rs.next()) {
				dto = new EmpDTO();
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
			//출력
			System.out.println("사번	이름	etc...");
			for (EmpDTO emp : list) {
				System.out.printf("%d\t",emp.getEno());
				System.out.printf("%s\t",emp.getEname());
				System.out.printf("%s   \t",emp.getJob());
				System.out.printf("%d\t",emp.getManager());
				System.out.printf("%s\t",emp.getHiredate());
				System.out.printf("%d\t",emp.getSalary());
				System.out.printf("%d\t",emp.getCommission());
				System.out.printf("%d\n", emp.getDno());
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt, rs);
		}
	}
}
