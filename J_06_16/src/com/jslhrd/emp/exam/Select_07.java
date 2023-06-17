package com.jslhrd.emp.exam;

import java.util.List;
import java.util.Scanner;

import com.jslhrd.emp.dao.EmpDAO;
import com.jslhrd.emp.dto.EmpDTO;

public class Select_07 {
	public static void main(String[] args) {
		List<EmpDTO> list;
		EmpDAO dao = EmpDAO.getInstance();
		
		list = EmpDAO.nameStartAEmpSortBySalary();
		if (list == null) {
			System.out.println("해당하는 사원이 존재하지 않습니다.");
			return;
		}
		for (EmpDTO dto : list) {
			System.out.printf("%d\t%s\t%s\t", dto.getEno(), dto.getEname(), dto.getHiredate());
			System.out.printf("%d\t%d\n", dto.getSalary(), dto.getDno());
		}
	}
}
