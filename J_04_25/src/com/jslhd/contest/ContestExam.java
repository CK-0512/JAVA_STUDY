package com.jslhd.contest;

import java.util.Scanner;
//sc.close()는 프로그램내에 모든 스캐너가 공유한다 = 한 프로그램에 하나만

public class ContestExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ContestProcess contestProcess = new ContestProcess();
		
		while (true) {
			System.out.println("[1] 참가자 등록");
			System.out.println("[2] 입력자료순 출력");
			System.out.println("[3] 순위(성적)순 출력");
			System.out.println("[4] 프로그램 종료");
			System.out.print("메뉴 선택 ? ");
			int cmd = sc.nextInt();
			switch (cmd) {
				case 1 : 
					contestProcess.contestRegister(sc);
					break;
				case 2 : 
					contestProcess.contestPrintByRegister();
					break;
				case 3 : 
					contestProcess.contestPrintByRank();
					break;
				case 4 : 
					sc.close();
					System.exit(1);
			}
		}
	}
}
