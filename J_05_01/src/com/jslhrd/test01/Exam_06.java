package com.jslhrd.test01;

class E {
	void print() {
		System.out.println("abc");
	}
}

class EE extends E {
	void method() {
		System.out.println("123");
	}
}

public class Exam_06 {
	public static void main(String[] args) {
		E e1 = new E();
		
		E e2 = new EE(); // 업캐스팅
		
		//EE ee1 = new E();
		//EE ee1 = (EE)new E(); // 컴파일 O, 실행시 X
		
		EE ee2 = new EE();
		E e3 = ee2; // 업캐스팅
		//EE ee3 = e3;
		EE ee3 = (EE)e3; // 다운캐스팅
	}
}
