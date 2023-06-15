package com.jslhrd.sawon.exam;

import java.util.List;

import com.jslhrd.sawon.dao.EmpDAO;
import com.jslhrd.sawon.dto.EmpDTO;

public class EmpSelect {
	public static void main(String[] args) {		
		EmpDAO dao= EmpDAO.getInstance();
		
		List<EmpDTO> list = dao.empSelect();
		
		System.out.println("사번\t이름\tetc...");
		for (EmpDTO emp : list) {
			System.out.printf("%d\t%s\t", emp.getEno(), emp.getEname());
			System.out.println(emp.getDno());
		}
		
		System.out.println("---------------------------------------------");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%d\t%s\t", list.get(i).getEno(), list.get(i).getEname());
			System.out.println(list.get(i).getDno());
		}
	}
}
