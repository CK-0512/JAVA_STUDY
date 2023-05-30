package com.jslhrd.scanner;

import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int cnt = 0;
		while (sc.hasNextInt()) {
			System.out.println(sc.nextInt());
			cnt++;
		}
		System.out.printf("입력된 정수: %d", cnt);
	}
}
