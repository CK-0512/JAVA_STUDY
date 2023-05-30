package com.jslhrd.stringtokenizer;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exam_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String str = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(str, ", ");
		int num = Integer.parseInt(st.nextToken());
		String name = st.nextToken();
		int k = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		System.out.println("번호	이름	국어	영어	수학");
		System.out.printf("%d	%s	%d	%d	%d\n", num, name, k, e, m);
	}
}
