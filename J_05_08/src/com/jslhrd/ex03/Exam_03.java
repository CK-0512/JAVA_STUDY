package com.jslhrd.ex03;
//중첩클래스(중첩, 정적중첩, 지역중첩, 익명중첩)
class Outer {
	int x = 100;//공유
	private int a = 10;
	
	void test() {
		System.out.printf("x = %d\n", x);
		System.out.printf("a = %d\n", a);
	}
	
	class Inner {
		private int b = 20;
		void exam() {
			System.out.printf("x = %d\n", x);
			System.out.printf("a = %d\n", a);
			System.out.printf("b = %d\n", b);
		}
	}

}
public class Exam_03 {
	
	public static void main(String[] args) {
		Outer ot = new Outer();
		
		Outer.Inner oi = ot.new Inner();
		
		Outer.Inner oi2 = new Outer().new Inner();
		
		ot.x = 1000;
		ot.test();
		oi.exam();
	}
}
