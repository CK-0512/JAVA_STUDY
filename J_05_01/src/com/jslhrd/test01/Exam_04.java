package com.jslhrd.test01;
class C {
	void add() {
		System.out.println("");
	}
}

class CC extends C {
	void add() {
		System.out.println("2 + 3 = 5");
	}
}

class CCC extends C {
	void sub() {
		System.out.println("5 - 2 = 3");
	}
}
public class Exam_04 {
	public static void main(String[] args) {
		C c1 = new C();
		C c2 = new CC();
		C c3 = new CCC();
		
		c1.add();
		c2.add();
		c3.add();
	}
}
