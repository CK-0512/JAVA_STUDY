package com.jslhrd.math;

public class Exam_01 {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
		System.out.println("Math.abs() : " + Math.abs(1 - 3));
		System.out.println("Math.pow() : " + Math.pow(2, 3));
		System.out.println("Math.sqrt() : " + Math.sqrt(2));
		System.out.println("Math.ceil() : " + Math.ceil(7/2.));
		System.out.println("Math.floar() : " + Math.floor(7/2.));
		System.out.println("Math.round() : " + Math.round(7/2.));
		System.out.println("Math.random() : " + Math.random());
		// start ~ n 사이 정수
		//int num = (int)(Math.random() * n) + start;
		int num = (int)(Math.random() * 10) + 1;
		System.out.println("난수 : " + num);
	}
}
