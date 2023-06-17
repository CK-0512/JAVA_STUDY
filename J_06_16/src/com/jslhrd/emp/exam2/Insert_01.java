package com.jslhrd.emp.exam2;

import java.util.List;
import java.util.Scanner;

import com.jslhrd.emp.dao.EmpDAO;
import com.jslhrd.emp.dto.EmpDTO;

public class Insert_01 {
	public static void main(String[] args) {
		EmpDAO dao = EmpDAO.getInstance();
		
		for (int i = 0; i < 3; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.print("사원 등록 : ");
			String cmd = sc.nextLine();
			String[] cmdBits = cmd.split(",");
			int eno = Integer.parseInt(cmdBits[0]);
			String ename = cmdBits[1];
			String job = cmdBits[2];
			int manager = Integer.parseInt(cmdBits[3]);
			int row = EmpDAO.InsertEmp(eno, ename, job, manager);
			if (row == 0) {
				System.out.println("등록 실패");
			} else {
				System.out.println("등록 성공");
			}
		}
	}
}
