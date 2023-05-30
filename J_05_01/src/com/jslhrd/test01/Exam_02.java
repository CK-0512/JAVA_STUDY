package com.jslhrd.test01;
class A {
	int a = 10;
	A(int a) {
		System.out.println("A()생성자 호출됨");
	}
}
class AA extends A {
	int b = 20;
	AA(int b) {
		super(10);
		System.out.println("AA()생성자 호출됨");
	}
	void test() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
public class Exam_02 {
	public static void main(String[] args) {
	//	A a = new A();
		AA aa = new AA(10);
		aa.test();
	}
}
