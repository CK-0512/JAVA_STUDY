package com.jslhrd.emp.exam2;

import java.util.List;
import java.util.Scanner;

import com.jslhrd.emp.dao.EmpDAO;
import com.jslhrd.emp.dto.EmpDTO;

public class Delect_01 {
	public static void main(String[] args) {
		EmpDAO dao = EmpDAO.getInstance();
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 입사일 : ");
		String hiredate = sc.next();
		int row = EmpDAO.deleteEmpByHiredate(hiredate);
		if (row == 0) {
			System.out.println("삭제 실패");
		} else {
			System.out.println("삭제 성공");
		}
	}
}
