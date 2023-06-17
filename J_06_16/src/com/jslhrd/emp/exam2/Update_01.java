package com.jslhrd.emp.exam2;

import java.util.List;
import java.util.Scanner;

import com.jslhrd.emp.dao.EmpDAO;
import com.jslhrd.emp.dto.EmpDTO;

public class Update_01 {
	public static void main(String[] args) {
		EmpDAO dao = EmpDAO.getInstance();
		Scanner sc = new Scanner(System.in);
		System.out.print("급여 인상 % : ");
		int upSal = sc.nextInt();
		int row = EmpDAO.UpSal(upSal);
		if (row == 0) {
			System.out.println("인상 실패");
		} else {
			System.out.println("인상 성공");
		}
	}
}
