package com.jslhrd.bowling2;

public class Score {
	private int firstScore;
	private int secondScore;
	private String lastScore;
	private int frameScore;
	private int strike;
	private boolean spare;
	
	public Score(int firstScore) {
		this.firstScore = firstScore;
	}
	
	public Score(int firstScore, int secondScore) {
		this.firstScore = firstScore;
		this.secondScore = secondScore;
	}
	
	public Score(int firstScore, int secondScore, String lastScore) {
		this.firstScore = firstScore;
		this.secondScore = secondScore;
		this.lastScore = lastScore;
	}

	public int getStrike() {
		return strike;
	}

	public void setStrike(int strike) {
		this.strike = strike;
	}

	public boolean getSpare() {
		return spare;
	}

	public void setSpare(boolean spare) {
		this.spare = spare;
	}

	public int getFirstScore() {
		return firstScore;
	}

	public void setFirstScore(int firstScore) {
		this.firstScore = firstScore;
	}

	public int getSecondScore() {
		return secondScore;
	}

	public void setSecondScore(int secondScore) {
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
