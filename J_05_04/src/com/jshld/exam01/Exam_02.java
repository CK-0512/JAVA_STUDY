package com.jshld.exam01;

public class Exam_02 {
	public static void main(String[] args) {
		JSLProcess jsl1 = new ExamProcess();
		int m = jsl1.max(10, 20);
		System.out.printf("max = %d\n", m);
		System.out.printf("min = %d\n", jsl1.min(30, 90));
		
		m = jsl1.max(1, 43, 45, 65, 65, 67, 87, 36);
		System.out.printf("max = %d\n", m);
		System.out.printf("min = %d\n", jsl1.min(42, 45, 56, 48, 23 ,76));
		
		int s = jsl1.sum(1, 24, 54, 65, 87, 1 ,54 ,34);
		System.out.printf("sum = %d\n", s);
		
		JSLProcess jsl2 = new TestProcess();
		m = jsl2.max(10, 20);
		System.out.printf("max = %d\n", m);
		System.out.printf("min = %d\n", jsl2.min(30, 90));
		
		m = jsl2.max(1, 43, 45, 65, 65, 67, 87, 36);
		System.out.printf("max = %d\n", m);
		System.out.printf("min = %d\n", jsl2.min(42, 45, 56, 48, 23 ,76));
		
		s = jsl2.sum(1, 24, 54, 65, 87, 1 ,54 ,34);
		System.out.printf("sum = %d\n", s);
		
	}
}
