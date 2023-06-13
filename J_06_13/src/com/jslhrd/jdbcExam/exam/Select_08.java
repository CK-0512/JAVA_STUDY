package com.jslhrd.jdbcExam.exam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.jslhrd.jdbcExam.dto.EmpDTO;
import com.jslhrd.jdbcExam.util.DBManger;

public class Select_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입사날짜 : ");
		String hiredate = sc.next();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			String query = "select * from emp where hiredate > ?";
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, hiredate);
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
				
				System.out.printf("%d\t",dto.getEno());
				System.out.printf("%s\t",dto.getEname());
				System.out.printf("%s   \t",dto.getJob());
				System.out.printf("%d\t",dto.getManager());
				System.out.printf("%s\t",dto.getHiredate());
				System.out.printf("%d\t",dto.getSalary());
				System.out.printf("%d\t",dto.getCommission());
				System.out.printf("%d\n", dto.getDno());
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
