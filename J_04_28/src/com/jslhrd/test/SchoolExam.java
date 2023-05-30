package com.jslhrd.test;

public class SchoolExam {
	public static void main(String[] args) {
		Student stu = new Student("1101", "홍길동", 30);
		Score score = new Score(stu, 90, 80, 90);
		score.scorePrint();
	}
}
