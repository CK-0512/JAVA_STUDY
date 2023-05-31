package com.jslgrd.treeset;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class StudentMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<Student> sSet = new TreeSet<>();
		Student student = null;
		
		while(true) {
			System.out.print("입력 : ");
			String reg = sc.nextLine();
			String[] regBits = reg.split(",");
			if(regBits[0].equals("0000"))
				break;
			if(!Pattern.matches("\\d{4}", regBits[0])) {
				System.out.println("학번 입력오류");
				continue;
			}
			
			int studentNum = Integer.parseInt(regBits[0]);
			String name = regBits[1];
			int kor = Integer.parseInt(regBits[2]);
			int eng = Integer.parseInt(regBits[3]);
			int mat = Integer.parseInt(regBits[4]);
			int tot = kor + eng + mat;
			int[] score = {kor, eng, mat, tot};
			double avg = tot / 3.;
			
			student = new Student(studentNum, name, score, avg);
			if(!sSet.add(student)) {
				System.out.println("이미등록된 학생입니다.");
				continue;
			}
		}
		
		for(Student s : sSet) {
			int rank = 1;
			for(Student s2 : sSet) {
				if (s.getAvg() < s2.getAvg())
					rank++;
			}
			s.setRank(String.valueOf(rank));
		}
		
		System.out.println("학번 오름차순");
		System.out.print("학번	이름	국어	영어	수학	");
		System.out.println("총점	평균	석차");
		for(Student s : sSet) {
			System.out.printf("%d	%s	", s.getStudentNum(), s.getName());
			for(int i = 0; i < s.getScore().length; i++) {
				System.out.printf("%d	", s.getScore()[i]);
			}
			System.out.printf("%.1f	%s\n", s.getAvg(), s.getRank());
		}
		
		List<Student> list = new ArrayList<>(sSet);
		for(int i = 0; i < list.size() - 1; i++) {
			for(int j = i; j < list.size(); j++) {
				if(Integer.parseInt(list.get(i).getRank()) < Integer.parseInt(list.get(j).getRank())) {
					Student s = list.get(i);
					list.set(i, list.get(j));
					list.set(j, s);
				}
			}
		}
		
		System.out.println("석차 내림차순");
		System.out.print("학번	이름	국어	영어	수학");
		System.out.println("총점	평균	석차");
		for(Student s : list) {
			System.out.printf("%d	%s	", s.getStudentNum(), s.getName());
			for(int i = 0; i < s.getScore().length; i++) {
				System.out.printf("%d	", s.getScore()[i]);
			}
			System.out.printf("%.1f	%s\n", s.getAvg(), s.getRank());
		}
	}
}
