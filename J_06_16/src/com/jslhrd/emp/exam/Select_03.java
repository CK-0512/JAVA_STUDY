package com.jslhrd.emp.exam;

import java.util.List;
import java.util.Scanner;

import com.jslhrd.emp.dao.EmpDAO;
import com.jslhrd.emp.dto.EmpDTO;

public class Select_03 {
	public static void main(String[] args) {
		List<EmpDTO> list;
		Scanner sc = new Scanner(System.in);
		System.out.print("최소 급여 : ");
		int salary1 = sc.nextInt();
		System.out.print("최대 급여 : ");
		int salary2 = sc.nextInt();
		EmpDAO dao = EmpDAO.getInstance();
		
		list = EmpDAO.betweenSalEmp(salary1, salary2);
		for (EmpDTO dto : list) {
			System.out.printf("%d\t%s\t%d\n", dto.getEno(), dto.getEname(), dto.getSalary());
		}
	}
}
