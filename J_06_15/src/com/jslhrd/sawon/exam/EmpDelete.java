package com.jslhrd.sawon.exam;

import java.util.Scanner;

import com.jslhrd.sawon.dao.EmpDAO;
import com.jslhrd.sawon.dto.EmpDTO;

public class EmpDelete {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		EmpDTO emp = new EmpDTO();
		
		System.out.print("사원번호 : ");
		emp.setEno(sc.nextInt());

		EmpDAO dao= EmpDAO.getInstance();
		// 등록메소드 호출
		int row = dao.empDelete(emp);
		if(row==1) {
			System.out.println("삭제성공");
		} else {
			System.out.println("해당하는 사원이 존재하지 않습니다");
		}
		
	}
}
