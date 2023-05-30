package com.jslhrd.student;

public class StdScore {
	int stdNum;
	String stdName;
	int kor;
	int eng;
	int mat;
	int tot;
	double avg;
	int rank;
	String haveNotScore;
	
	public StdScore() {}
	
	public StdScore(int stdNum, String stdName) {
		this.stdNum = stdNum;
		this.stdName = stdName;
		this.haveNotScore = "시험성적정보가 없습니다.";
	}
	
	public StdScore(int stdNum, String stdName, int kor, int eng, int mat) {
		this.stdNum = stdNum;
		this.stdName = stdName;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		tot = kor + eng + mat;
		avg = (int)(tot / 3. * 10 + 0.5) / 10.;
	}
	
	@Override
	public String toString() {
		if (haveNotScore != null) 
			return stdNum + "\t" + stdName + "\t" + haveNotScore;
		return stdNum + "\t" + stdName + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + tot + "\t" + avg + "\t" + rank;
	}
}
