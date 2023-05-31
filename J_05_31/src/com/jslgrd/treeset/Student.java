package com.jslgrd.treeset;

public class Student implements Comparable<Student> {
	private int studentNum;
	private String name;
	private int[] score;
	private double avg;
	private String rank;
	
	public Student() {}
	public Student(int studentNum, String name, int[] score, double avg) {
		this.studentNum = studentNum;
		this.name = name;
		this.score = score;
		this.avg = avg;
	}
	
	@Override
	public int compareTo(Student o) {
		return Integer.compare(studentNum, o.studentNum);
	}
	
	public int getStudentNum() {
		return studentNum;
	}
	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getScore() {
		return score;
	}
	public void setScore(int[] score) {
		this.score = score;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	
}
