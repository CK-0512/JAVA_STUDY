package com.jslhrd.test01;

public class Super {
	int a = 10;
	void test() {
		System.out.println("a = " + a);
	}
}

class Child extends Super{
	int b = 20;
	void method() {
		System.out.println("b = " + b);
	}
}