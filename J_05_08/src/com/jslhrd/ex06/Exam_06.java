package com.jslhrd.ex06;
//익명중첩
class Inner {
	void aaa() {
		System.out.println("AAAA");
	}
	void bbb() {
		System.out.println("BBBB");
	}
}
public class Exam_06 {
	public static void main(String[] args) {
		Inner in = new Inner();
		in.aaa();
		in.bbb();
		
		Inner in2 = new Inner() {
			@Override
			void aaa() {
				System.out.println("Hello World");
			}
		};
		in2.aaa();
	}
}
