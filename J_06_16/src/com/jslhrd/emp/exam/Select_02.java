package com.jslhrd.emp.exam;

import java.util.List;
import java.util.Scanner;

import com.jslhrd.emp.dao.EmpDAO;
import com.jslhrd.emp.dto.EmpDTO;

public class Select_02 {
	public static void main(String[] args) {
		List<EmpDTO> list;
		Scanner sc = new Scanner(System.in);
		System.out.print("급여입력 : ");
		int salary = sc.nextInt();
		EmpDAO dao = EmpDAO.getInstance();
		
		list = EmpDAO.lowSalEmp(salary);
		for (EmpDTO dto : list) {
			System.out.printf("%d\t%s\t%d\n", dto.getEno(), dto.getEname(), dto.getSalary());
		}
	}
}
