package com.jslhrd.employee.exam;

import java.util.Scanner;

import com.jslhrd.employee.controller.EmpController;

public class EmployeeExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmpController empController = new EmpController(sc);
		
		
		while(true) {
			System.out.println("====================================================");
			System.out.println("=\t사원&부서관리 프로그램 ver 1.0\t\t=");
			System.out.println("====================================================");
			System.out.println("		[1] 사원 전체 목록");
			System.out.println("		[2] 신규 사원 등록");
			System.out.println("		[3] 사원 검색");
			System.out.println("		[4] 사원 정보 수정");
			System.out.println("		[5] 사원 정보 삭제");
			System.out.println("		[6] 프로그램 종료");
			System.out.println("----------------------------------------------------");
			System.out.print("해당항목을 선택하세요 ? ");
			int cmd = sc.nextInt();
			switch(cmd) {
				case 1 :
					empController.showList();
					break;
				case 2 :
					empController.doRegister();
					break;
				case 3 :
					empController.doSearch();
					break;
				case 4 :
					empController.doModify();
					break;
				case 5 :
					empController.doDelete();
					break;
				case 6 :
					System.exit(1);
					break;
				default :
					System.out.println("존재하지 않는 명령");
					continue;
			}
			System.out.println("====================================================");
		}
		
	}
}
