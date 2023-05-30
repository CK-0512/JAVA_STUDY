package com.jslhrd.test01;
class B {
	int a = 10;
	int b = 20;
}

class BB extends B {
	int a = 20;
	void print() {
		System.out.println("a = " + super.a);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
public class Exam_03 {
	public static void main(String[] args) {
		BB bb= new BB();
		bb.print();
		
		B b = new BB();
		b.a = 100;
	}
}
