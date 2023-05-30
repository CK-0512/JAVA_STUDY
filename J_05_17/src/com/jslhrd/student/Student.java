package com.jslhrd.student;

public class Student {
	int num;
	String name;
	int score[];
	int max;
	int min;
	int tot;
	double avg;
	int rank;
	
	Student () {}
	Student (int num, String name, int score[], int max, int min, int tot, double avg) {
		this.num = num;
		this.name = name;
		this.score = score;
		this.max = max;
		this.min = min;
		this.tot = tot;
		this.avg = avg;
	}
}
