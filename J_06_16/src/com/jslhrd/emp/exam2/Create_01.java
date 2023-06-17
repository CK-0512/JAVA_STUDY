package com.jslhrd.emp.exam2;

import com.jslhrd.emp.dao.EmpDAO;

public class Create_01 {
	public static void main(String[] args) {
		int row = EmpDAO.createEmp1();
		if (row == 0) {
			System.out.println("생성실패");
		} else {
			System.out.println("생성성공");
		}
	}
}
