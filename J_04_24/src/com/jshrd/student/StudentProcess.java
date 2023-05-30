package com.jshrd.student;

import java.util.Scanner;

public class StudentProcess {
	private Student[] students = new Student[10];
	private int cnt = 0;
	
	public void studentRegister() {
		Scanner sc = new Scanner(System.in);
		while (cnt < 10) {
			System.out.print("등록 : ");
			int num = sc.nextInt();
			
			if (num == 0000) {
				break;
			}
			
			Student alreadyStudent = null;
			
			for (int i = 0; i < cnt; i++) {
				if (num == students[i].getNum()) {
					alreadyStudent = students[i];
				}
			}
			
			if (alreadyStudent != null) {
				System.out.println("이미 등록된 학생입니다.");
				continue;
			}
			
			String name = sc.next();
			String gender = sc.next();
			int score = sc.nextInt();
			
			Student student = new Student();
			
			student.setNum(num);
			student.setName(name);
			student.setGender(gender);
			student.setScore(score);
			
			students[cnt] = student;
			cnt++;
		}
		sc.close();
	}

	public void studentPrintByScan() {
		System.out.println("등록순 출력");
		System.out.println("학번	이름	성별	점수");
		for (int i = 0; i < cnt; i++) {
			System.out.println(students[i].getNum() + "\t" + students[i].getName() + "\t" + students[i].getGender() + "\t" + students[i].getScore());
		}
	}

	public void studentPrintByScore() {
		System.out.println("성적순 출력");
		System.out.println("학번	이름	성별	점수");
		Student[] studentsByScore = students.clone();
		for (int i = 0; i < cnt; i++) {
			for (int j = i + 1; j < cnt - 1; j++) {
				if (students[i].getScore() < students[j].getScore()) {
					Student student = studentsByScore[i];
					studentsByScore[i] = studentsByScore[j];
					studentsByScore[j] = student;
				}
			}
			System.out.println(studentsByScore[i].getNum() + "\t" + studentsByScore[i].getName() + "\t" + studentsByScore[i].getGender() + "\t" + studentsByScore[i].getScore());
		}
	}
}
