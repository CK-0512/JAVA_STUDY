package com.jslhrd.student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentData {
	private Student[] student;
	private Student[] studentSortByScore;
	private int cnt;

	public void stdRegister() throws FileNotFoundException {
		String file = "src/com/jslhrd/student/student.txt";
		Scanner sc = new Scanner(new File(file));
		while (sc.hasNextLine()) {
			sc.nextLine();
			cnt++;
		}
		
		student = new Student[cnt];
		sc = new Scanner(new File(file));
		for (int i = 0; i < cnt; i++) {
			StringTokenizer st = new StringTokenizer(sc.nextLine(), ", ");
			int num = Integer.valueOf(st.nextToken());
			String name = st.nextToken();
			int kor = Integer.valueOf(st.nextToken());
			int eng = Integer.valueOf(st.nextToken());
			int mat = Integer.valueOf(st.nextToken());
			int tot = kor + eng + mat;
			double avg = (int)(tot / 3. * 10 + 0.5) / 10.;
			char grade;
			if (avg > 90)
				grade = 'A';
			else if (avg > 80)
				grade = 'B';
			else if (avg > 70)
				grade = 'C';
			else if (avg > 60)
				grade = 'D';
			else
				grade = 'F';
			student[i] = new Student(num, name, kor, eng, mat, tot, avg, grade);
		}
		studentSortByScore = student.clone();
		Arrays.sort(studentSortByScore);
	}
	
	public void stdPrintByRegister() {
		System.out.println("입력자료순");
		System.out.println("번호	이름	국어	영어	수학	총점	평균	등급");
		for (Student std : student) {
			System.out.println(std);
		}
		System.out.printf("전체평균 : %.1f\n", calStdAvg());
		System.out.printf("전체평균이상인 학생 %d명\n", calUpNumStdAvg());
	}

	public void stdPrintByTot() {
		System.out.println("성적순");
		System.out.println("번호	이름	국어	영어	수학	총점	평균	등급");
		for (Student std : studentSortByScore) {
			System.out.println(std4);
		}
		System.out.printf("전체평균 : %.1f\n", calStdAvg());
		System.out.printf("전체평균이상인 학생 %d명\n", calUpNumStdAvg());

	}
	
	private double calStdAvg() {
		double stdAvgTot = 0;
		double stdAvg = 0;
		for (Student std : student) {
			stdAvgTot += std.avg;
		}
		stdAvg = stdAvgTot / cnt;
		return stdAvg;
	}
	
	private int calUpNumStdAvg() {
		int UpNum = 0;
		double stdAvg = calStdAvg();
		for (Student std : student) {
			if (std.avg > stdAvg) 
				UpNum++;
		}
		return UpNum;
	}

}
