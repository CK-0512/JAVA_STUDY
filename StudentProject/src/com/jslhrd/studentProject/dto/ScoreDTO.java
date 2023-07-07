package com.jslhrd.studentProject.dto;

public class ScoreDTO {
	private String syear;
	private String sclass;
	private String sno;
	private int kor;
	private int eng;
	private int mat;
	private int sum;
	private double avg;
	
	public ScoreDTO() {};
	public ScoreDTO(String syear, String sclass, String sno, int kor, int eng, int mat) {
		this.syear = syear;
		this.sclass = sclass;
		this.sno = sno;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	public String getSyear() {
		return syear;
	}
	public void setSyear(String syear) {
		this.syear = syear;
	}
	public String getSclass() {
		return sclass;
	}
	public void setSclass(String sclass) {
		this.sclass = sclass;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
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
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
}
