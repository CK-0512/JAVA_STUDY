package com.jshrd.student;

public class Student {
	private int num;
	private String name;
	private String gender;
	private String str;
	private int score;
	
	public Student() {}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return str;
	}

	public void setGender(String gender) {
		this.gender = gender;
		if (gender.equals("M") || gender.equals("m")) {
			str = "남자";
		} else if (gender.equals("F") || gender.equals("f")) {
			str = "여자";
		}
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
