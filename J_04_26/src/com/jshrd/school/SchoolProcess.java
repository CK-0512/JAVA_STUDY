package com.jshrd.school;

import java.util.Scanner;

public class SchoolProcess {
	Student[] students = new Student[10];
	Score[] scores = new Score[10];
	private int cnt = 0;
	private int cntScore = 0;

	public void studentRegister(Scanner sc) {

		while (cnt < 10) {
			System.out.print("등록 : ");
			int num = sc.nextInt();
			if (num == 0000) {
				break;
			}

			Student studentAlready = null;
			for (int i = 0; i < cnt; i++) {
				if (num == students[i].getNum()) {
					studentAlready = students[i];
				}
			}
			if (studentAlready != null) {
				System.out.println("이미 등록된 학생입니다.");
				continue;
			}

			String name = sc.next();
			String gender = sc.next();
			if (gender.equals("F") || gender.equals("f")) {
				gender = "여자";
			} else if (gender.equals("M") || gender.equals("m")) {
				gender = "남자";
			} else {
				System.out.println("올바른 성별을 입력해 주십시오.");
				continue;
			}
			String phoneNumber = sc.next();

			Student newStudent = new Student(num, name, gender, phoneNumber);
			students[cnt] = newStudent;
			cnt++;
		}
	}

	public void scoreRegister(Scanner sc) {

		while (cntScore < cnt) {
			System.out.print("등록 : ");
			int studentNum = sc.nextInt();
			if (studentNum == 0000) {
				break;
			}

			Student registeredStudent = null;
			for (int i = 0; i < cnt; i++) {
				if (studentNum == students[i].getNum()) {
					registeredStudent = students[i];
				}
			}
			if (registeredStudent == null) {
				System.out.println("존재하지 않는 학생입니다.");
				continue;
			}

			Score scoreAlready = null;
			for (int i = 0; i < cntScore; i++) {
				if (studentNum == scores[i].getStudentNum()) {
					scoreAlready = scores[i];
				}
			}
			if (scoreAlready != null) {
				System.out.println("이미 등록된 성적 정보입니다.");
				continue;
			}

			int kor = sc.nextInt();
			int eng = sc.nextInt();
			int mat = sc.nextInt();
			int sum = kor + eng + mat;
			double avg = sum / 3.;

			Score newScore = new Score(studentNum, kor, eng, mat);
			newScore.setStudentName(registeredStudent.getName());
			newScore.setTot(sum);
			newScore.setAvg(avg);
			scores[cntScore] = newScore;

			cntScore++;
			if (cnt == cntScore) {
				System.out.println("모든 학생의 성적 정보가 등록되었습니다.");
			}
		}
		scoreRanked();
	}

	private void scoreRanked() {
		for (int i = 0; i < cntScore; i++) {
			scores[i].setRank(1);
			int rank = scores[i].getRank();
			for (int j = 0; j < cntScore; j++) {
				if (scores[i].getAvg() < scores[j].getAvg()) {
					rank++;
				}
			}
			scores[i].setRank(rank);
		}
	}

	public void studentPrint() {
		if (cnt == 0) {
			System.out.println("등록된 학생 정보가 없습니다.");
			return;
		}

		System.out.println("학번	이름	성별	전화번호");
		for (int i = 0; i < cnt; i++) {
			System.out.printf("%d	%s	%s	%s\n", students[i].getNum(), students[i].getName(), students[i].getGender(),
					students[i].getPhoneNumber());
		}
	}

	public void scorePrint() {
		if (cntScore == 0) {
			System.out.println("등록된 성적 정보가 없습니다.");
			return;
		}

		System.out.println("학번	이름	국어	영어	수학	총점	평균	석차");
		for (int i = 0; i < cntScore; i++) {
			System.out.printf("%d	%s	", scores[i].getStudentNum(), scores[i].getStudentName());
			System.out.printf("%d	%d	%d	", scores[i].getKor(), scores[i].getEng(), scores[i].getMat());
			System.out.printf("%d	%.2f	%d\n", scores[i].getTot(), scores[i].getAvg(), scores[i].getRank());
		}
	}

}
