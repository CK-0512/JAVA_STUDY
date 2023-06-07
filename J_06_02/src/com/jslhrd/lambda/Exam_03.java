package com.jslhrd.lambda;

import java.util.Scanner;

@FunctionalInterface
interface MySum {
	public int add(int x, int y);
}

public class Exam_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 (x,y) : ");
		String cmd = sc.nextLine();
		String[] cmdBits = cmd.split(",");
		int m = Integer.parseInt(cmdBits[0]);
		int n = Integer.parseInt(cmdBits[1]);
		
		MySum mySum = (x, y) -> {
			int cnt = 0;
			if (x == 2 || y == 2)
				cnt++;
			for (int i = x; i <= y/2; i++) {
				boolean flag = true;
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						flag = false;
					}
				}
				if (flag) {
					cnt++;
				}
			}
			return cnt;
		};
		
		System.out.printf("%d~%d 까지의 소수 개수 : %d", m, n, mySum.add(m, n));
	}
}
