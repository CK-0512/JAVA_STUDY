package com.jslhrd.treemap;

public class Score {
	private int[] scores;
	private double avg;
	
	public Score() {}
	public Score(int[] scores, double avg) {
		this.scores = scores;
		this.avg = avg;
	}
	public int[] getScores() {
		return scores;
	}
	public void setScores(int[] scores) {
		this.scores = scores;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
}
