package com.jslhrd.student;

import java.util.Comparator;

public class Student implements Comparable<Student>{
	int num;
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double avg;
	char grade;
	
	Student() {}
	Student(int num, String name, int kor, int eng, int mat, int tot, double avg, char grade) {
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
		return num + "\t" + name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + tot + "\t" + avg + "\t" + grade;
	}
	
	@Override
	public int compareTo(Student o) {
		return Integer.compare(o.tot, tot);
	}
	
	
}