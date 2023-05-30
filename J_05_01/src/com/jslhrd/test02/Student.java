package com.jslhrd.test02;

public class Student extends Hak {
	int kor;
	int eng;
	int mat;
	int tot;
	double avg;
	int rank;
	
	public Student() {}

	public Student(String hakbun, String name, int kor, int eng, int mat) {
		super(hakbun, name);
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.tot = kor + mat + eng;
		this.avg = tot / 3.;
	}
	
	public void titlePrint() {
		super.titlePrint();
		
		System.out.println("국어\t영어\t수학\t총점\t평균\t석차");
	}
	
	public void dataPrint() {
		super.dataPrint();
		
		System.out.printf("%d	%d	%d	%d	%.2f	%d\n", kor, eng, mat, tot, avg, rank);
	}
	
}
