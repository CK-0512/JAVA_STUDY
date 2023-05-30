package com.jslhrd.stringbuffer;

import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();

		while (true) {
			System.out.print("10진수 : ");
			int dec = sc.nextInt();
			if (dec == -99)
				break;
			while (dec != 0) {
				int mok = dec / 2;
				int na = dec % 2;
				sb.insert(0, na);
				dec = mok;
			}
			System.out.println("2진수 : " + sb);
			sb.delete(0, sb.length());
		}
	}
}
