package com.jslhrd.string;
class AA {
	
}
public class Exam_01 {
	public static void main(String[] args) {
		AA a = new AA();
		String str1 = "ABCD";
		String str2 = "ABCD";
		// 같은 문자열이 이미 있으면 그 주소를 참조
		
		String str3 = new String("ABCD");
		// new는 새 주소 생성
		
		System.out.println("a = " + a);
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		System.out.println("str3 = " + str3);
		System.out.println("str1 == str2 " + (str1 == str2));
		System.out.println("str1 == str3 " + (str1 == str3));
		System.out.println("str1.equals(str2) " + (str1.equals(str2)));
		System.out.println("str1.equals(str3) " + (str1.equals(str3)));
		
		str1 = "ABC";
		// String은 수정이 안되고 새 문자열이 생성됨
	}
}
