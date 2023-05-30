package com.jshld.exam01;
//문자열 처리
public class Exma_01 {
	public static void main(String[] args) {
		String str = "Korea-Daejen-2023-jslhrd";
		//문자열 길이
		int strLength = str.length();//"Korea".length();
		System.out.printf("문자열 길이 : %d\n", strLength);
		//문자열 분리 : substring(시작위치, 전위치)
		String s1 = str.substring(0, 5);
		String s2 = str.substring(17);// 17번부터 끝까지
		System.out.println(s1);
		System.out.println(s2);
		
		//조건으로 문자열 분리(split)
		String[] cmdBits = str.split("-");
		for (String cmd : cmdBits) {
			System.out.println(cmd);
		}
		

		//특정위치 문자 추출
		char c1 = str.charAt(0);
		System.out.println(c1);
		
		//문자열을 대, 소문자로 변환
		String str2 = str.toUpperCase();// 대문자로
		String str3 = str.toLowerCase();// 소문자로
		System.out.println(str2);
		System.out.println(str3);
	}
}
