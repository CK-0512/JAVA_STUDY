package com.jslhrd.treemap;

public class Student implements Comparable<Student>{
	private int studentNum;
	private String name;
	
	public Student() {}
	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	
	@Override
	public int compareTo(Student o) {
		return Integer.compare(studentNum, o.studentNum);
	}
	
	@Override
	public String toString() {
		return studentNum + "\t" + name;
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
}
