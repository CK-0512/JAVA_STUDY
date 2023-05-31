package com.jslhrd.list;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class StudentExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Student> students = new ArrayList<>();
		
		String s = "##.#";
		DecimalFormat df = new DecimalFormat(s);
		
		while(true) {
			System.out.print("입력 : ");
			String reg = sc.nextLine();
			String[] regBits = reg.split(",");
			int num = Integer.valueOf(regBits[0]);
			if (num == 0000) 
				break;
			if (!Pattern.matches("\\d{4}", regBits[0])) {
				System.out.println("학번입력오류");
				continue;
			}
			String name = regBits[1];
			int kor = Integer.valueOf(regBits[2]);
			int eng = Integer.valueOf(regBits[3]);
			int mat = Integer.valueOf(regBits[4]);
			int tot = kor + eng + mat;
			double avg = tot / 3.;
			char grade = ' ';
			if (avg >= 90)
				grade = '수';
			else if (avg >= 80)
				grade = '우';
			else if (avg >= 70)
				grade = '미';
			else if (avg >= 60)
				grade = '양';
			else
				grade = '가';
			
			Student student = new Student(num, name, kor, eng, mat, tot, avg, grade);
			if (students.contains(student)) {
				System.out.println("이미 등록된 학생입니다.");
				continue;
			}
			students.add(student);
		}
		
		for (int i = 0; i < students.size(); i++) {
			int rank = 1;
			for (int j = 0; j < students.size(); j++) {
				if (students.get(i).avg < students.get(j).avg)
					rank++;
			}
			students.get(i).rank = rank;
		}
		
		int[] stdTot = new int[4];
		double[] stdAvg = new double[4];
		for (int i = 0; i < students.size(); i++) {
			stdTot[0] += students.get(i).kor;
			stdTot[1] += students.get(i).eng;
			stdTot[2] += students.get(i).mat;
			stdTot[3] += students.get(i).tot;
		}
		for (int i = 0; i < stdTot.length; i++) {
			stdAvg[i] = stdTot[i] / (double)students.size();
		}
		
		System.out.println("입력자료 순 출력");
		System.out.println("학번	이름	국어	영어	수학	총점	평균	판정	순위");
		for (Student std : students) {
			System.out.println(std);
		}
		
		System.out.print("합계		");
		for (int i = 0; i < stdTot.length; i++) {
			System.out.printf("%d	", stdTot[i]);
		}
		System.out.println();
		
		System.out.print("평균		"); 
		for (int i = 0; i < stdAvg.length; i++) {
			System.out.printf("%s	", df.format(stdAvg[i]));
		}
		System.out.println();
		
		Collections.sort(students);
		
		System.out.println("학번순 출력");
		System.out.println("학번	이름	국어	영어	수학	총점	평균	판정	순위");
		for (Student std : students) {
			System.out.println(std);
		}
		System.out.print("합계		");
		for (int i = 0; i < stdTot.length; i++) {
			System.out.printf("%d	", stdTot[i]);
		}
		System.out.println();
		
		System.out.print("평균		"); 
		for (int i = 0; i < stdAvg.length; i++) {
			System.out.printf("%s	", df.format(stdAvg[i]));
		}
		System.out.println();
		
		sc.close();
	}
}