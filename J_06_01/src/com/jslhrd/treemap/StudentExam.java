package com.jslhrd.treemap;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class StudentExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Student, Score> map = new TreeMap<>();
		Student student;
		Score score;
		
		while(true) {
			System.out.print("입력 : ");
			String reg = sc.nextLine();
			String[] regBits = reg.split(",");
			if(regBits[0].equals("0"))
				break;
			int studentNum = Integer.parseInt(regBits[0]);
			String name = regBits[1];
			int kor = Integer.parseInt(regBits[2]);
			int eng = Integer.parseInt(regBits[3]);
			int mat = Integer.parseInt(regBits[4]);
			int sic = Integer.parseInt(regBits[5]);
			int tot = kor + eng + mat + sic;
			int[] scores = {kor, eng, mat, sic, tot};
			double avg = tot / 4.;
			
			student = new Student(studentNum, name);
			score = new Score(scores, avg);
			if(map.containsKey(student)) {
				System.out.println("이미 등록된 학생입니다.");
				continue;
			}
			map.put(student, score);
		}
		
		Set<Student> set = map.keySet();
		System.out.println("번호	이름	국어	영어	수학	과학	총점	평균");
		for(Student std : set) {
			System.out.print(std);
			for(int i = 0; i < map.get(std).getScores().length; i++) {
				System.out.printf("\t%d", map.get(std).getScores()[i]);
			}
			System.out.printf("\t%.2f\n", map.get(std).getAvg());
		}
	}
}
