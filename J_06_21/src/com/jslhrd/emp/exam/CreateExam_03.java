package com.jslhrd.emp.exam;

import com.jslhrd.emp.dao.EmpDAO;

public class CreateExam_03 {
	public static void main(String[] args) {
		EmpDAO dao = EmpDAO.getInstance();
		
		boolean row = dao.createTable2();
		System.out.println("row = " + row);
	}
}
