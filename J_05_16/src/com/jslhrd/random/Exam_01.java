package com.jslhrd.random;

import java.util.Random;

// 난수 발생
public class Exam_01 {
	public static void main(String[] args) {
		Random r = new Random(2);
		double b = r.nextDouble();
		System.out.println(b);
		int a = r.nextInt();
		System.out.println(a);
		a = r.nextInt(45); // 0 ~ 44
		System.out.println(a);
		a = r.nextInt(45) + 1; // 1 ~ 45
		System.out.println(a);
	}
}
