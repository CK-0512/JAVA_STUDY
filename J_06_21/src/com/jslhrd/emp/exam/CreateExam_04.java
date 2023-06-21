package com.jslhrd.emp.exam;

import com.jslhrd.emp.dao.EmpDAO;

public class CreateExam_04 {
	public static void main(String[] args) {
		EmpDAO dao = EmpDAO.getInstance();
		
		int row = dao.insertTable();
		System.out.println("row = " + row);
	}
}
