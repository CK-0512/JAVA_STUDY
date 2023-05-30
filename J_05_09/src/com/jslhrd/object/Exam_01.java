package com.jslhrd.object;
//equals(), ==
class A {
	int a;
}

public class Exam_01 {
	public static void main(String[] args) {
		
		
		A a1 = new A();	
		A a2 = new A();	
		
		System.out.println("a1 = " + a1);
		System.out.println("a2 = " + a2);

		System.out.println("a1 == a2 : " + (a1 == a2));
		System.out.println("a1.equals(a2) : " + (a1.equals(a2)));
		
		System.out.println("a1.a == a2.a : " + (a1.a == a2.a));
		
		String str = "aaa";
		System.out.println("str == 'aaa' : " + (str == "aaa"));
		System.out.println("str.equlas('aaa') : " + str.equals("aaa"));
	}
}
