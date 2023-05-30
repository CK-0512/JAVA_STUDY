package com.jslhrd.student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SchoolProcess {
	private Student[] students;
	private StdScore[] stdScores;
	private Scanner sc;
	private int stdCnt;
	private int scoreCnt;

	public void stdRegister() throws FileNotFoundException {
		String file = "src/com/jslhrd/student/student.txt";
		sc = new Scanner(new File(file));

		while (sc.hasNextLine()) {
			sc.nextLine();
			stdCnt++;
		}
		students = new Student[stdCnt];

		sc = new Scanner(new File(file));

		for (int i = 0; i < stdCnt; i++) {
			StringTokenizer st = new StringTokenizer(sc.nextLine(), ", ");
			int num = Integer.valueOf(st.nextToken());
			String name = st.nextToken();
			String gender = st.nextToken();
			String phoneNumber = st.nextToken();
			students[i] = new Student(num, name, gender, phoneNumber);
		}
		Arrays.sort(students);
	}

	public void scoreRegister() {
		stdScores = new StdScore[stdCnt];
		sc = new Scanner(System.in);

		while (true) {
			System.out.print("성적정보 등록 : ");
			String inform = sc.nextLine();
			String[] informBits = inform.split(" ");
			Student stdCheck = null;
			StdScore scoreCheck = null;
			int stdNum = Integer.valueOf(informBits[0]);
			if (stdNum == 0000)
				break;
			for (Student std : students) {
				if (stdNum == std.num) {
					stdCheck = std;
					break;
				}
			}
			for (int i = 0; i < scoreCnt; i++) {
				if (stdNum == stdScores[i].stdNum) {
					scoreCheck = stdScores[i];
					break;
				}
			}

			if (stdCheck == null) {
				System.out.println("등록된 학생이 없습니다.");
				continue;
			}
			if (scoreCheck != null) {
				System.out.println("이미 등록된 학생입니다.");
				continue;
			}

			int kor = Integer.valueOf(informBits[1]);
			int eng = Integer.valueOf(informBits[2]);
			int mat = Integer.valueOf(informBits[3]);

			stdScores[scoreCnt] = new StdScore(stdNum, stdCheck.name, kor, eng, mat);
			scoreCnt++;
			if (scoreCnt == stdCnt) {
				System.out.println("모든 학생정보가 등록되었습니다.");
				break;
			}
		}
		setRank();
		
		if (scoreCnt < stdCnt) {
			for (int i = 0; i < stdCnt; i++) {
				boolean flag = true;
				for (int j = 0; j < scoreCnt; j++) {
					if (students[i].num == stdScores[j].stdNum) {
						flag = false;
						break;
					}
				}
				if (flag) {
					if (scoreCnt > stdCnt)
						break;
					stdScores[scoreCnt] = new StdScore(students[i].num, students[i].name);
					scoreCnt++;
				}
			}
		}
	}

	public void stdPrint() {
		System.out.println("학생 정보");
		System.out.println("번호	이름	성별	전화번호");
		for (Student std : students) {
			System.out.println(std);
		}
	}

	public void scorePrint() {
		System.out.println("성적 정보");
		System.out.println("번호	이름	국어	영어	수학	총점	평균	석차");
		for (StdScore stdSc : stdScores) {
			System.out.println(stdSc);
		}
	}
	
	private void setRank() {
		int rank;
		for (int i = 0; i < scoreCnt; i++) {
			rank = 1;
			for (int j = 0; j < scoreCnt; j++) {
				if (stdScores[i].tot < stdScores[j].tot) 
					rank++;		
			}
			stdScores[i].rank = rank;
		}
	}

}
