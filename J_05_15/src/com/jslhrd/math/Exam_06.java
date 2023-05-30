package com.jslhrd.math;

import java.util.Arrays;
import java.util.Scanner;

public class Exam_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("수치입력(1 ~ ?) : ");
			int cmd = sc.nextInt();
			int num = 100;
			int[] cnt = new int[cmd];
			
			for (int i = 0; i < cmd; i++) {
				System.out.printf("%d : ", i);
				int random = (int)(Math.random() * 100) + 1;
				if (random > num) {
					random = num;
				}
				if (i == cmd - 1) {
					random = num;
				}
				cnt[i] = random;
				for (int j = 0; j < random; j++) {
					System.out.print("*");
				}
				num = num - random;
				System.out.printf("(%d)\n", random);
			}
			
			System.out.printf("발생 빈도수가 가장 많은 수 : %d\n", cnt[0]);
			System.out.printf("발생 빈도수가 가장 적은 수 : %d\n", cnt[cmd - 1]);
		}
	}
}
