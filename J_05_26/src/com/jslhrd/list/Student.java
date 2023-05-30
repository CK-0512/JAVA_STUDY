package com.jslhrd.list;

import java.text.DecimalFormat;

public class Student implements Comparable<Student> {
	int num;
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double avg;
	char grade;
	int rank;
	
	Student(){}
	Student (int num, String name, int kor, int eng, int mat, int tot, double avg, char grade) {
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.tot = tot;
		this.avg = avg;
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		String s = "##.#";
		DecimalFormat df = new DecimalFormat(s);
		return num + "\t" + name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + tot + "\t" + Double.valueOf(df.format(avg)) + "\t" + grade + "\t" + rank;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			return ((Student) obj).num == num;
		}
		return false;
	}
	@Override
	public int compareTo(Student o) {
		return Integer.compare(num, o.num);
	}
}
