package com.jslhrd.pattern;

import java.util.regex.Pattern;

// 정규식 : 패턴
public class Exam_01 {
	public static void main(String[] args) {
		// boolean bool = Pattern.matches("정규표현식", "검증할 문자열");
		String[] str = {"123", "12a", "34", "a123"};
		for (int i = 0; i < str.length; i++) {
			boolean bool = Pattern.matches("\\d+", str[i]);
			System.out.println(str[i] + " : " + bool);
		}
		// 전화번호 유효성
		// (02||010)-\d{3, 4}-\d{4}
		
		String regStr = "(02||010)-\\d{3, 4}-\\d{4}";
		String tel = "010-1234-1234";
		boolean bool = Pattern.matches(regStr, tel);
	}
}
