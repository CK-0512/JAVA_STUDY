package com.jslhrd.contest;

import java.util.Scanner;

public class ContestExam {
	public static void main(String[] args) {
		ContestProcess contestProcess = new ContestProcess();
		Scanner sc = new Scanner(System.in);

		while (true) 
		{
			System.out.println("[1]참가자 등록");
			System.out.println("[2]채점 등록");
			System.out.println("[3]참가자 정보 출력");
			System.out.println("[4]채점정보 출력");
			System.out.println("[5]프로그램 종료");
			System.out.print("메뉴 선택?");
			int cmd = sc.nextInt();

			switch (cmd) {
			case 1:
				contestProcess.memberRegister(sc);
				break;
			case 2:
				contestProcess.scoreRegister(sc);
				break;
			case 3:
				contestProcess.memberPrint();
				break;
			case 4:
				contestProcess.scorePrint();
				break;
			case 5:
				sc.close();
				System.exit(1);
			}
		}
	}
}

