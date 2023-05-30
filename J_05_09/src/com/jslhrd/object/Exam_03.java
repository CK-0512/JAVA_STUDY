package com.jslhrd.object;
//toString() : 
class B {
	int num;
	String name;
	B (int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "B [num=" + num + ", name=" + name + "]";
	}
	
}
public class Exam_03 {
	public static void main(String[] args) {
		B b1 = new B (1, "홍길동");
		System.out.println(b1);
		
		String str = new String("홍길동");
		System.out.println(str);
		
	}
}
