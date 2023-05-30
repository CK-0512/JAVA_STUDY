package com.jslhrd.ex04;

import com.jslhrd.ex04.Outer.Inner;

//정적중첩클래스
class Outer {
		private int a = 10;
		private static int b = 100;
	static class Inner {
		private int c = 100;
		void test() {
			//System.out.printf("a = %d\n", a); 정적 변수만 사용가능
			System.out.printf("b = %d\n", b);
			System.out.printf("c = %d\n", c);
		}
	}
}
public class Exam_04 {
	public static void main(String[] args) {
		Outer ot = new Outer();
		Outer.Inner oi = new Outer.Inner();
		oi.test();
	}
}
