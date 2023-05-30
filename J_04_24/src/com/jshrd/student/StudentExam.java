package com.jshrd.student;

import java.util.Scanner;

public class StudentExam {
	private StudentProcess studentProcess;
	
	public static void main(String[] args) {
		StudentProcess studentProcess = new StudentProcess();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("[1] 학생등록");
			System.out.println("[2] 입력자료순 출력");
			System.out.println("[3] 성적순 출력");
			System.out.println("[4] 프로그램 종료");
			System.out.println("메뉴 선택 ?");
			int cmd = sc.nextInt();
			switch (cmd) {
			case 1 :
				studentProcess.studentRegister();
				break;
			case 2 :
				studentProcess.studentPrintByScan();
				break;
			case 3 :
				studentProcess.studentPrintByScore();
				break;
			case 4 :
				sc.close();
				System.exit(1);
			}
		}
	}
}
