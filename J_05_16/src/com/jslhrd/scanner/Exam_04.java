package com.jslhrd.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exam_04 {
	public static void main(String[] args) throws FileNotFoundException {
		String file = "src/com/jslhrd/scanner/student.txt";
		Scanner sc = new Scanner(new File(file));
		int[] stuSum = new int[4];
		int cnt = 0;
		
		System.out.println("번호	이름	국어	영어	수학	총점	평균	등급");
		
		while (sc.hasNextLine()) {
			String stu = sc.nextLine();
			String[] stuBits = stu.split(",");
			
			int sum = 0;
			double avg = 0;
			char grade;
			for (int i = 0; i < stuBits.length; i++) {
				System.out.printf("%s\t", stuBits[i]);
			}
			for (int i = 2; i < stuBits.length; i++) {
				sum += Integer.parseInt(stuBits[i]);
			}
			avg = sum / 3.;
			if (avg >= 90) 
				grade = 'A';
			else if (avg >= 80)
				grade = 'B';
			else if (avg >= 70)
				grade = 'C';
			else if (avg >= 60)
				grade = 'D';
			else
				grade = 'F';
			
			System.out.printf("%d	%.2f	%c\n", sum, avg, grade);
			
			for (int i = 0; i < stuSum.length - 1; i++) {
				stuSum[i] += Integer.parseInt(stuBits[i + 2]); 
			}
			stuSum[3] += sum;
			
			cnt++;
		}
		
		System.out.print("전체총점 :	");
		for (int i = 0; i < stuSum.length; i++) {
			System.out.printf("%d	", stuSum[i]);
		}
		System.out.println();
		System.out.print("전체평균 :	");
		for (int i = 0; i < stuSum.length; i++) {
			System.out.printf("%.2f	", stuSum[i]/(double)cnt);
		}
	}
}
