package com.jslhrd.emp.exam;

import com.jslhrd.emp.dao.EmpDAO;

public class CreateExam_02 {
	public static void main(String[] args) {
		EmpDAO dao = EmpDAO.getInstance();
		
		String tbname = "test";
		String item1 = "hak";//학번
		String item2 = "name";//이름
		String item3 = "bir";//생일
		String item4 = "gen";//성별
		String item5 = "join";//등록일
		int row = dao.createTableByCmd(tbname, item1, item2, item3, item4, item5);
		System.out.println("row = " + row);
	}
}
