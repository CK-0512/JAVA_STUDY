package com.jslhrd.emp.exam;

import java.util.ArrayList;
import java.util.List;

import com.jslhrd.emp.dao.EmpDAO;
import com.jslhrd.emp.dto.EmpDTO;

public class Select_01 {
	public static void main(String[] args) {
		List<EmpDTO> list;
		EmpDAO dao = EmpDAO.getInstance();
		
		list = EmpDAO.empList();
		for (EmpDTO dto : list) {
			System.out.printf("%s\t%d\n", dto.getEname(), dto.getDno());
		}
	}
}
