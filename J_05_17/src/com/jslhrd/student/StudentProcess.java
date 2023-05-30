package com.jslhrd.student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentProcess {
	private Student[] students;
	private int totStu;
	private Scanner sc;

	public void studentRegister() throws FileNotFoundException {
		String file = "src/com/jslhrd/student/student.txt";
		sc = new Scanner(new File(file));
		totStu = 0;
		int cntStu = 0;
		StringTokenizer st;
		
		while (sc.hasNextLine()) {
			sc.nextLine();
			totStu++;
		}
		
		students = new Student[totStu];
		
		sc = new Scanner(new File(file));
		while (sc.hasNextLine()) {
			String data = sc.nextLine();
			st = new StringTokenizer(data, ", ");
			int num = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			int[] score = new int[5];
			for (int i = 0; i < score.length; i++) {
				score[i] = Integer.parseInt(st.nextToken());
			}
			
			int max = score[0];
			int min = score[0];
			int tot = 0;
			double avg;
			for (int i = 0; i < score.length; i++) {
				if (score[i] > max) {
					max = score[i];					
				}
				else if (score[i] < min) {
					min = score[i];					
				}
				tot += score[i];
			}
			tot = tot - max - min;
			avg = tot / 3.;
			
			students[cntStu] = new Student(num, name, score, max, min, tot, avg);
			cntStu++;
		}
		
		setStuRank();
	}

	public void printByregister() {
		System.out.println("[출력-입력자료 순]");
		System.out.println("번호	이름	점수1	점수2	점수3	점수4	점수5	최대값	최소값	총점	평균	순위");
		for (int i = 0; i < totStu; i++) {
			System.out.printf("%d	%s	", students[i].num, students[i].name);
			for (int j = 0; j < students[i].score.length; j++) {
				System.out.printf("%d	", students[i].score[j]);
			}
			System.out.printf("%d	%d	%d	%.2f	%d\n", students[i].max, students[i].min, students[i].tot, students[i].avg, students[i].rank);
		}
		
		System.out.print("합계 :		");
		int[] scoreTot = calStuTot();
		for (int i = 0; i < scoreTot.length; i++) {
			System.out.printf("%d	", scoreTot[i]);
		}
		System.out.println();
		
		System.out.print("평균 :		");
		double[] scoreAvg = calStuAvg();
		for (int i = 0; i < scoreAvg.length; i++) {
			System.out.printf("%.2f	", scoreAvg[i]);
		}
		System.out.println();
	}

	public void printBynum() {
		System.out.println("[출력-번호순]");
		sortBynum();
		System.out.println("번호	이름	점수1	점수2	점수3	점수4	점수5	최대값	최소값	총점	평균	순위");
		for (int i = 0; i < totStu; i++) {
			System.out.printf("%d	%s	", students[i].num, students[i].name);
			for (int j = 0; j < students[i].score.length; j++) {
				System.out.printf("%d	", students[i].score[j]);
			}
			System.out.printf("%d	%d	%d	%.2f	%d\n", students[i].max, students[i].min, students[i].tot, students[i].avg, students[i].rank);
		}
		
		System.out.print("합계 :		");
		int[] scoreTot = calStuTot();
		for (int i = 0; i < scoreTot.length; i++) {
			System.out.printf("%d	", scoreTot[i]);
		}
		System.out.println();
		
		System.out.print("평균 :		");
		double[] scoreAvg = calStuAvg();
		for (int i = 0; i < scoreAvg.length; i++) {
			System.out.printf("%.2f	", scoreAvg[i]);
		}
		System.out.println();
	}
	
	private int[] calStuTot() {
		int[] scoreTot = new int[5];
		for (int i = 0; i < students[0].score.length; i++) {
			for (int j = 0; j < totStu; j++) {
				scoreTot[i] += students[j].score[i];
			}
		}
		return scoreTot;
	}
	
	private double[] calStuAvg() {
		int[] scoreTot = new int[5];
		double[] scoreAvg = new double[5];
		for (int i = 0; i < students[0].score.length; i++) {
			for (int j = 0; j < totStu; j++) {
				scoreTot[i] += students[j].score[i];
			}
			scoreAvg[i] = scoreTot[i] / (double)totStu;
		}
		return scoreAvg;
	}
	
	private void setStuRank() {
		int rank;
		for (int i = 0; i < totStu; i++) {
			rank = 1;
			for (int j = 0; j < totStu; j++) {
				if (students[i].avg < students[j].avg) {
					rank++;
				}
			}
			students[i].rank = rank;
		}
	}

	private void sortBynum() {
		for (int i = 0; i < totStu - 1; i++) {
			for (int j = i + 1; j < totStu; j++) {
				if (students[i].num > students[j].num) {
					Student student = students[i];
					students[i] = students[j];
					students[j] = student;
				}
			}
		}
	}
	
}
