package com.jslhrd.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) throws FileNotFoundException {
		String file = "src/com/jslhrd/scanner/student.txt";
		Scanner sc = new Scanner(new File(file));
		
		int cnt = 0;
		int sum = 0;
		while (sc.hasNextInt()) {
			int score = sc.nextInt();
			System.out.println(score);
			sum += score;
			cnt++;
		}
		System.out.printf("합계 : %d\n", sum);
		System.out.printf("평균 : %d\n", sum / cnt);
		
	}
}
