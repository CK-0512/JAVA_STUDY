package com.jslhrd.test02;

// 추상클래스 : 실체가 없는 클래스 -> 메소드 내용이 없는 클래스
abstract class E {
	int a;
	void  test() {
		System.out.println("a = " + a);
	}
	abstract void sum(int a);//추상메소드
}

class EE extends E {
	void sum(int a) {
		
	}
}

public class Exam_08 {
	public static void main(String[] args) {
		//E e1 = new E();
		E e2 = new EE();
		e2.sum(10);
	}
}
