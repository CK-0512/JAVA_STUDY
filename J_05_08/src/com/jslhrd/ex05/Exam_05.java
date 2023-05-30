package com.jslhrd.ex05;
//지역중첩
class Outer {
	private int x = 100;
	
	void disp () {
		class Inner {
			private int a = 10;
			void disp_in() {
				System.out.printf("x = %d\n", x);
				System.out.printf("a = %d\n", a);
			}
		}
		
		Inner in = new Inner();
		in.disp_in();
	}
}
public class Exam_05 {
	public static void main(String[] args) {
		Outer ot = new Outer();
		ot.disp();
		//내부객체 생성 불가
		//Outer.Inner oi = ot.new Inner();
	}
}
