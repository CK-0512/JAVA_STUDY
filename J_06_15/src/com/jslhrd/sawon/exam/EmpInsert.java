package com.jslhrd.sawon.exam;

import java.util.Scanner;

import com.jslhrd.sawon.dao.EmpDAO;
import com.jslhrd.sawon.dto.EmpDTO;

public class EmpInsert {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		EmpDTO emp = new EmpDTO();
		
		System.out.print("사원번호 : ");
		emp.setEno(sc.nextInt());
		System.out.print("이름 : ");
		emp.setEname(sc.next());
		System.out.print("직책 : ");
		emp.setJob(sc.next());
		System.out.print("상사번호 : ");
		emp.setManager(sc.nextInt());
		System.out.print("입사일 : ");
		emp.setHiredate(sc.next());
		System.out.print("급여 : ");
		emp.setSalary(sc.nextInt());
		System.out.print("커미션 : ");
		emp.setCommission(sc.nextInt());
		System.out.print("부서번호 : ");
		emp.setDno(sc.nextInt());
		
		EmpDAO dao= EmpDAO.getInstance();
		// 등록메소드 호출
		int row = dao.empInsert(emp);
		if(row==1) {
			System.out.println("등록성공");
		} else {
			System.out.println("등록실패");
		}
		
	}
}
