package com.jslhrd.stringtokenizer;

import java.util.StringTokenizer;

//문자열 분리
public class Exam_01 {
	public static void main(String[] args) {
		String str = "1111-2222-3333,4444-5555,6666-7777";
		//문자열.split()
		String arr[] = str.split("-");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		StringTokenizer st = new StringTokenizer(str, "-,");
		int count = st.countTokens();
		System.out.println("토큰수 : " + count);
/*		String s1 = st.nextToken();
		String s2 = st.nextToken();
		System.out.println("1번 토큰 값 : " + s1);
		System.out.println("2번 토큰 값 : " + s2);
	*/	
		for (int i = 0; i < count; i++) {
			System.out.printf("%d번 토큰 값 : %s\n", i, st.nextToken());
		}
		
		st = new StringTokenizer(str, "-,");
		while (st.hasMoreTokens()) {
			System.out.printf("토큰 값 : %s\n", st.nextToken());
		}
	}
}
