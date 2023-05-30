package com.jshrd.school;

public class Score {
	private int studentNum;
	private String studentName;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double avg;
	private int rank;

	public Score() {};
	
	public Score(int studentNum, int kor, int eng, int mat) {
		this.studentNum = studentNum;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public int getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMat() {
		return mat;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
}
