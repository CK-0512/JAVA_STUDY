package com.jslhrd.shophingMall.exam;

import java.util.Scanner;

import com.jslhrd.shophingMall.controller.ShoppingMallController;

public class ShoppingMallExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ShoppingMallController shoppingMallController = new ShoppingMallController(sc);

		while(true) {
			System.out.println("=========================================================");
			System.out.println("=\t\t쇼핑몰 관리 프로그램\t\t=");
			System.out.println("=========================================================");
			System.out.println("		[1] 회원등록");
			System.out.println("		[2] 회원매출정보등록");
			System.out.println("		[3] 회원목록조회");
			System.out.println("		[4] 회원매출정보 목록조회");
			System.out.println("		[5] 회원정보 검색");
			System.out.println("		[6] 회원목록조회");
			System.out.println("		[7] 회원매출조회");
			System.out.println("		[8] 프로그램 종료");
			System.out.println("---------------------------------------------------------");
			System.out.print("해당항목을 선택하세요 ? ");
			int cmd = sc.nextInt();
			switch(cmd) {
				case 1 :
					shoppingMallController.memberRegist();
					break;
				case 2 :
					shoppingMallController.moneyRegist();
					break;
				case 3 :
					shoppingMallController.showMembers();
					break;
				case 4 :
					shoppingMallController.showMoneys();
					break;
				case 5 :
					shoppingMallController.searchMemberDetail();
					break;
				case 6 :
					shoppingMallController.showMembers2();
					break;
				case 7 :
					shoppingMallController.showMembersMoneys();
					break;
				case 8 :
					System.exit(1);
					break;
				default :
					System.out.println("존재하지 않는 명령");
					continue;
			}
			System.out.println("=========================================================");
		}
		
	}
}
