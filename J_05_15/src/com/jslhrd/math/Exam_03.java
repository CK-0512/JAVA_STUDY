package com.jslhrd.math;

import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("== 암산연습 ==");
			System.out.print("10진수 자리수 : ");
			int input = sc.nextInt();
			int sum = 0;
			for (int i = 0; i < 5; i++) {
				int num = (int)(Math.random() * Math.pow(10, input));
				System.out.println(num);
				sum += num;
			}
			System.out.println("정답 입력 : ");
			int answer = sc.nextInt();
			if (answer == sum)
				System.out.println("정답입니다.");
			else
				System.out.printf("정답은 : %d\n", sum);
		}
	}
}
