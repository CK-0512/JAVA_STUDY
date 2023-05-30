package com.jslhrd.object;
class C {
	int x;
	String name = "123";
	@Override
	public int hashCode() {
		return name.hashCode();
	}
}
public class Exam_04 {
	public static void main(String[] args) {
		C c1 = new C();
		C c2 = new C();
		
		String str1 = "AAA";
		String str2 = new String("AAA");
		
		System.out.println("c1 : " + c1.hashCode());
		System.out.println("c2 : " + c2.hashCode());
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println("c1 == c2 : " + (c1 == c2));
		System.out.println("c1.equals(c2) : " + (c1.equals(c2)));
		System.out.println("str1 : " + str1.hashCode());
		System.out.println("str2 : " + str2.hashCode());
		
		
	}
}
