package com.jslhrd.emp.exam;

import java.util.List;
import java.util.Scanner;

import com.jslhrd.emp.dao.EmpDAO;
import com.jslhrd.emp.dto.EmpDTO;

public class Select_04 {
	public static void main(String[] args) {
		List<EmpDTO> list;
		Scanner sc = new Scanner(System.in);
		System.out.print("커미션 3개 입력 : ");
		String cmd = sc.nextLine();
		String[] cmdBits = cmd.split(",");
		int com1 = Integer.parseInt(cmdBits[0]);
		int com2 = Integer.parseInt(cmdBits[1]);
		int com3 = Integer.parseInt(cmdBits[2]);
		EmpDAO dao = EmpDAO.getInstance();
		
		list = EmpDAO.searchCommissionEmp(com1, com2, com3);
		if (list == null) {
			System.out.println("해당하는 사원이 존재하지 않습니다.");
			return;
		}
		for (EmpDTO dto : list) {
			System.out.printf("%d\t%s\t%d\n", dto.getEno(), dto.getEname(), dto.getCommission());
		}
	}
}
