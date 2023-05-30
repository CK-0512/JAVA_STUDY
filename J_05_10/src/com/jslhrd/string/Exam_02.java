package com.jslhrd.string;

public class Exam_02 {
	public static void main(String[] args) {
		String str = "Korea-Seoul-JSLHRD";
		char ch = str.charAt(1);//'o'
		System.out.println(ch);
		int a = str.indexOf("S");//6
		System.out.println(a);
		int b = str.lastIndexOf("J");//12
		System.out.println(b);
		int cnt = str.length();//18
		System.out.println(cnt);
		System.out.println("-------------문자열 결합---------------");
		String reStr = "";
		for (int i = 0; i < str.length(); i++) {
			char s = str.charAt(i);
			reStr = s + reStr;
		}
		System.out.println(reStr);
		String str1 ="";
		for (int i = 1; i < 10; i++) {
			//str1 = str1.concat(i+"");
			// 기본 자료형에 공백더하면 문자열
			str1 = str1.concat(String.valueOf(i));
		}
		System.out.println(str1);
		
		int i = Integer.parseInt(str1);
		System.out.println(i);
		
		boolean f = str.contains("Seoul");
		System.out.println(f);
		
		String ss = "Korea".replace('K', 'k');
		System.out.println(ss);
		
		String sss = "    Korea     Seoul   ";
		sss = sss.trim();
		System.out.println(sss);
	}
}
