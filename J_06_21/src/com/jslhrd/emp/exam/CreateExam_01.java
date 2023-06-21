package com.jslhrd.emp.exam;

import com.jslhrd.emp.dao.EmpDAO;

public class CreateExam_01 {
	public static void main(String[] args) {
		EmpDAO dao = EmpDAO.getInstance();
		
		int row = dao.createTable();
		System.out.println("row = " + row);
	}
}
