package com.jslhrd.smartProduct.exam;

import java.util.Scanner;

import com.jslhrd.smartProduct.controller.SmartProductController;

public class SmartProductExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SmartProductController smartProductController = new SmartProductController(sc);

		while(true) {
			System.out.println("=========================================================");
			System.out.println("=\t\t스마트공장 공정 관리 프로그램\t\t=");
			System.out.println("=========================================================");
			System.out.println("		[1] 제품 등록 및 조회");
			System.out.println("		[2] 작업지시 등록 및 조회 화면");
			System.out.println("		[3] 작업공정등록 화면");
			System.out.println("		[4] 작업공정조회 화면");
			System.out.println("		[5] 프로그램 종료");
			System.out.println("---------------------------------------------------------");
			System.out.print("해당항목을 선택하세요 ? ");
			int cmd = sc.nextInt();
			switch(cmd) {
				case 1 :
					smartProductController.productRegister();
					break;
				case 2 :
					smartProductController.workListRegister();
					break;
				case 3 :
					smartProductController.processRegister();
					break;
				case 4 :
					smartProductController.showResult();
					break;
				case 5 :
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
