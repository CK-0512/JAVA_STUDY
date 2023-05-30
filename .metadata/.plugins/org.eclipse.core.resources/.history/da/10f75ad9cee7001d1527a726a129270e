package com.jslhrd.test02;

import java.util.Scanner;

public class StudentExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] students = new Student[10];
		int cnt = 0;
		
		while(cnt < 10) {
			System.out.print("학생등록 : ");
			String hakbun = sc.next();
			if (hakbun.equals("0000")) 
				break;
			String name = sc.next();
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			int mat = sc.nextInt();
			
			students[cnt] = new Student(hakbun, name, kor, eng, mat);
			cnt++;
		}
		
		students[0].titlePrint();
		
		for (int i = 0; i < cnt; i++) {
			students[i].dataPrint();
		}
		System.out.println("-----------------------------------------------------------------------------------------------------");
	}
}
