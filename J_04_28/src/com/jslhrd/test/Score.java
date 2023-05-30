package com.jslhrd.test;

public class Score {
	private Student student;
	private int kor;
	private int eng;
	private int mat;
	
	public Score() {}
	public Score(Student student, int kor, int eng, int mat) {
		this.student = student;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	//자신출력 메소드
	public void scorePrint() {
		System.out.printf("%s\t", student.getNum());
		System.out.printf("%s\t", student.getName());
		System.out.printf("%d\t", student.getAge());
		System.out.printf("%d\t", kor);
		System.out.printf("%d\t", eng);
		System.out.printf("%d\n", mat);
	}
}
