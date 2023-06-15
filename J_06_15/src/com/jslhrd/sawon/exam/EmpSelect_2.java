package com.jslhrd.sawon.exam;

import java.util.Scanner;

import com.jslhrd.sawon.dao.EmpDAO;
import com.jslhrd.sawon.dto.EmpDTO;

public class EmpSelect_2 {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		System.out.print("사원번호 : ");
		int eno = sc.nextInt();
		EmpDAO dao= EmpDAO.getInstance();
		
		EmpDTO dto = dao.empSelect2(eno);
		if (dto == null) {
			System.out.println("해당하는 사원이 존재하지 않습니다.");
			return;
		}
		
		System.out.println("사번\t이름\tetc...");
		System.out.printf("%d\t%s\t", dto.getEno(), dto.getEname());
		System.out.println(dto.getDno());
	}
}
