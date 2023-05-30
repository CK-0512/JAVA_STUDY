package com.jlshard.exam02;

public class Exam_05 {
	public static void main(String[] args) {
		MathExam mt = new MathTest();
		int m1 = mt.max(10, 20);
		int m2 = mt.min(10, 20);
		int m3 = mt.max(10, 20, 30, 40, 50);
		int m4 = mt.min(10, 20, 30, 40, 50);
		
		System.out.printf("m1 = %d\n", m1);
		System.out.printf("m2 = %d\n", m2);
		System.out.printf("m3 = %d\n", m3);
		System.out.printf("m4 = %d\n", m4);
	}
}
