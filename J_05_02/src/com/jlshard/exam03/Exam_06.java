package com.jlshard.exam03;

import java.util.Scanner;

public class Exam_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		int cnt = 0;

		System.out.print("Data : ");

		while (cnt < 10) {
			num[cnt] = sc.nextInt();
			if (num[cnt] == 0) {
				break;
			}
			cnt++;
		}

		NumberProcess numbers = new Number(num, cnt);

		while (true) {
			System.out.println("[1] 오름차순 ");
			System.out.println("[2] 내림차순");
			System.out.println("[3] 합계(최대, 최소 제외)");
			System.out.print("출력 방법 : ");
			int cmd = sc.nextInt();
			switch (cmd) {
			case 1:
				numbers.dataPrint();
				System.out.print("오름차순 : ");
				numbers.ascSort();
				break;
			case 2:
				numbers.dataPrint();
				System.out.print("내림차순 : ");
				numbers.descSort();
				break;
			case 3:
				numbers.dataPrint();
				System.out.print("합계(최대, 최소 제외) : ");
				System.out.printf("%d\n", numbers.maxMinTotal());
				break;
			default:
				System.out.println("프로그램 종료");
				sc.close();
				System.exit(1);
			}
		}
	}
}
