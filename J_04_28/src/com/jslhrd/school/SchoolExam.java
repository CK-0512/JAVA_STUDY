package com.jslhrd.school;

import java.util.Scanner;

public class SchoolExam {
	public static void main(String[] args) {
		SchoolProcess schoolProcess = new SchoolProcess();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("[1] 학생등록");
			System.out.println("[2] 성적등록");
			System.out.println("[3] 학생정보 출력");
			System.out.println("[4] 성적정보 출력");
			System.out.println("[5] 프로그램 종료");
			System.out.print("메뉴선택 ? ");
			int cmd = sc.nextInt();

			switch (cmd) {
			case 1:
				schoolProcess.studentRegister(sc);
				break;
			case 2: 
				schoolProcess.scoreRegister(sc);
				break;
			case 3 :
				schoolProcess.studentPrint();
				break;
			case 4 :
				schoolProcess.scorePrint();
				break;
			case 5 :
				sc.close();
				System.exit(1);
			}
		}
	}
}
