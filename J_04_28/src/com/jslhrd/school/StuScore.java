package com.jslhrd.school;

public class StuScore {
	private Student student;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double avg;
	private int rank;

	public StuScore() {};
	
	public StuScore(Student student, int kor, int eng, int mat) {
		this.student = student;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
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
