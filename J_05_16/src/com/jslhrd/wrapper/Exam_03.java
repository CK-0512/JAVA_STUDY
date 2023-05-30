package com.jslhrd.wrapper;
// 문자열을 기본타입으로, 기본타입을 문자열로
public class Exam_03 {
	public static void main(String[] args) {
		byte n = Byte.parseByte("12");
		String str = "1234";
		int i = Integer.parseInt(str);
		
		// 기본타입을 문자열로
		int a = 100;
		String sa = String.valueOf(a);
		String s2 = a + "";
	}
}
