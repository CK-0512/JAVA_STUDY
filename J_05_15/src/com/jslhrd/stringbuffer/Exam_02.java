package com.jslhrd.stringbuffer;

import java.util.Scanner;

//10진수를 2진수로 변환
public class Exam_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("10진수 : ");
		int dec = sc.nextInt();
		String bin = "";
		while (dec != 0) {
			int mok = dec / 2;
			int na = dec % 2;
			bin = na + bin;
			dec = mok;
		}
		System.out.println("2진수 : " + bin);
	}
}
