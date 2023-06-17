package com.jslhrd.emp.exam2;

import java.util.List;
import java.util.Scanner;

import com.jslhrd.emp.dao.EmpDAO;
import com.jslhrd.emp.dto.EmpDTO;

public class Update_02 {
	public static void main(String[] args) {
		EmpDAO dao = EmpDAO.getInstance();
		Scanner sc = new Scanner(System.in);
		System.out.print("수정할 직원 : ");
		String ename = sc.next();
		int row = EmpDAO.updateHiredate(ename);
		if (row == 0) {
			System.out.println("수정 실패");
		} else {
			System.out.println("수정 성공");
		}
	}
}
