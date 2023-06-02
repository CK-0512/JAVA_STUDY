package com.jslhrd.lambda;

// JDK 1.8 이상에서만 사용가능
@FunctionalInterface // 함수형 인터페이스
interface MyFunc {
	public void test();
	// public void test1();
}

public class Exam_01 {
	public static void main(String[] args) {
		MyFunc fi = null;

		fi = () -> {
			System.out.println("test");
		};
		fi.test();
		
		fi = () -> {
			System.out.println("test2");
		};
		fi.test();
	}
}
