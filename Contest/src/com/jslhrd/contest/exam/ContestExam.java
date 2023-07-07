package com.jslhrd.contest.exam;

import java.util.Scanner;

import com.jslhrd.contest.controller.ContestController;

public class ContestExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ContestController contestController = new ContestController(sc);

		while(true) {
			System.out.println("====================================================");
			System.out.println("=\t콘테스트 관리 프로그램 ver 1.0\t\t=");
			System.out.println("====================================================");
			System.out.println("		[1] 참가자 정보 등록");
			System.out.println("		[2] 경연 점수 등록");
			System.out.println("		[3] 경연결과 조회");
			System.out.println("		[4] 최종등수 조회");
			System.out.println("		[5] 프로그램 종료");
			System.out.println("----------------------------------------------------");
			System.out.print("해당항목을 선택하세요 ? ");
			int cmd = sc.nextInt();
			switch(cmd) {
				case 1 :
					contestController.entryRegister();
					break;
				case 2 :
					contestController.scoreRegister();
					break;
				case 3 :
					contestController.scoreSearch();
					break;
				case 4 :
					contestController.showResult();
					break;
				case 5 :
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
