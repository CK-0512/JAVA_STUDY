package com.jslhrd.test01;

public class Exam_01 {
	public static void main(String[] args) {
		Super s = new Super();
		
		Child c = new Child();
		
		s.test();
		s.a = 100;
		c.test();
		c.method();
		c.a = 300;
		c.b = 200;
	}
}
