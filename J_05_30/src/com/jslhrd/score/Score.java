package com.jslhrd.score;

public class Score implements Comparable<Score>{

	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double avg;
	
	public Score() {}
	public Score(int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	@Override
	public String toString() {
		return kor + "\t" + eng + "\t" + mat + "\t" + tot + "\t" + avg;
	}
	
	@Override
	public int compareTo(Score o) {
		return Integer.compare(tot, o.tot);
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
}