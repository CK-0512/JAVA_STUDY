package com.jslhrd.bowling;

public class Score {
	private String firstScore;
	private String secondScore;
	private String lastScore;
	private int frameScore;
	
	public Score(String firstScore, String secondScore) {
		this.firstScore = firstScore;
		this.secondScore = secondScore;
	}
	
	public Score(String firstScore, String secondScore, String lastScore) {
		this.firstScore = firstScore;
		this.secondScore = secondScore;
		this.lastScore = lastScore;
	}

	@Override
	public String toString() {
		return "| " + firstScore + " | " + secondScore + " ";
	}

	public String getFirstScore() {
		return firstScore;
	}

	public void setFirstScore(String firstScore) {
		this.firstScore = firstScore;
	}

	public String getSecondScore() {
		return secondScore;
	}

	public void setSecondScore(String secondScore) {
		this.secondScore = secondScore;
	}

	public String getLastScore() {
		return lastScore;
	}
	
	public void setLastScore(String lastScore) {
		this.lastScore = lastScore;
	}

	public int getFrameScore() {
		return frameScore;
	}

	public void setFrameScore(int frameScore) {
		this.frameScore = frameScore;
	}
}
