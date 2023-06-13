package com.jslhrd.jdbcExam.exam;
// 키보드로 부서번호를 입력 해당부서번호에 사원 출력
// select eno, ename, job, hiredate, salary from emp where not dno = ?;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.jslhrd.jdbcExam.dto.EmpDTO;
import com.jslhrd.jdbcExam.util.DBManger;

public class Select_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("부서번호 : ");
		int dno = sc.nextInt();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			String query = "select eno, ename, job, hiredate, salary from emp where not dno = ?";
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, dno);
			rs = pstmt.executeQuery();
			EmpDTO dto = null;
			
			while(rs.next()) {
				dto = new EmpDTO();
				dto.setEno(rs.getInt("eno"));
				dto.setEname(rs.getString("ename"));
				dto.setJob(rs.getString("job"));
				dto.setHiredate(rs.getString("hiredate"));
				dto.setSalary(rs.getInt("salary"));
				
				System.out.printf("%d\t",dto.getEno());
				System.out.printf("%s\t",dto.getEname());
				System.out.printf("%s   \t",dto.getJob());
				System.out.printf("%s\t",dto.getHiredate().substring(0, 10));
				System.out.printf("%d\n",dto.getSalary());
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
