package com.jslhrd.score;

public class Student {
	private int stdNum;
	private String name;
	
	public Student() {}
	public Student(int stdNum, String name) {
		this.stdNum = stdNum;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return stdNum + "\t" + name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student)
			return ((Student) obj).stdNum == stdNum;
		return false;
	}
	
	@Override
	public int hashCode() {
		return stdNum;
	}
	
	public int getStdNum() {
		return stdNum;
	}
	public void setStdNum(int stdNum) {
		this.stdNum = stdNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
