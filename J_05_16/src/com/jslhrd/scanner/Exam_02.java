package com.jslhrd.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// 파일로부터 입력 후 출력
public class Exam_02 {
	public static void main(String[] args) throws FileNotFoundException {
		
		//String dir1 = "src/data.txt";
		//String dir2 = "src\\data.txt";		
		Scanner sc = new Scanner(new File("data.txt"));
		//Scanner sc2 = new Scanner(new File(dir1));
		
/*		while(sc.hasNextInt()) {
			int score = sc.nextInt();
			System.out.printf("%d\t", score);
*/		
		while (sc.hasNextLine()) {
			String str = sc.nextLine();
			System.out.println(str);
		}
	}
}
