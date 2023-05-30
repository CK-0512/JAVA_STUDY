package com.jslhrd.stringtokenizer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;


class Student {
	int num;
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double avg;
	
	Student () {}
	
	Student (int num, String name, int kor, int eng, int mat, int tot, double avg) {
		this.num = num;
		this.name = name;
		this.mat = mat;
		this.eng = eng;
		this.kor = kor;
		this.tot = tot;
		this.avg = avg;
	}
	
	@Override
	public String toString() {
		return num + "\t" + name + "\t" + mat + "\t" + eng + "\t" + kor + "\t" + tot + "\t" + avg; 
	}
}

public class Exam_03 {
	public static void main(String[] args) throws FileNotFoundException {
		String data = "src/com/jslhrd/stringtokenizer/data.txt";
		Scanner sc = new Scanner(new File(data));
		int cnt = 0;
		while (sc.hasNextLine()) {
			sc.nextLine();
			cnt++;
		}
		System.out.println("학생수 : " + cnt);
		
		Student[] stu = new Student[cnt];
		StringTokenizer st;
		sc = new Scanner(new File(data));
		for (int i = 0; i < cnt; i++) {
			String str = sc.nextLine();
			st = new StringTokenizer(str, ", ");
			int num = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			int mat = Integer.parseInt(st.nextToken());
			int eng = Integer.parseInt(st.nextToken());
			int kor = Integer.parseInt(st.nextToken());
			int tot = mat + eng + kor;
			double avg = (int)(tot / 3. * 100 + 0.5) / 100.;
			stu[i] = new Student(num, name, kor, eng, mat, tot, avg);
		}
		System.out.println("번호	이름	국어	영어	수학	총점	평균");
		for (int i = 0; i < cnt; i++) {
			System.out.println(stu[i]);
		}
		
		System.out.println("번호	이름	국어	영어	수학	총점	평균");
		for (int i = 0; i < cnt - 1; i++) {
			for (int j = i + 1; j < cnt; j++) {
				if (stu[i].num > stu[j].num) {
					Student std = stu[i];
					stu[i] = stu[j];
					stu[j] = std;
				}
			}
		}
		
		for (int i = 0; i < cnt; i++) {
			System.out.println(stu[i]);
		}
	}
}
