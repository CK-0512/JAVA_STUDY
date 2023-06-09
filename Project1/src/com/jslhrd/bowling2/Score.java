package com.jslhrd.bowling2;

public class Score {
	private int firstScore;
	private int secondScore;
	private int lastScore;
	private int frameScore;
	private int strike;
	private boolean spare;
	
	public Score(int firstScore) {
		this.firstScore = firstScore;
	}
	
	public Score(int firstScore, int secondScore, int strike) {
		this.firstScore = firstScore;
		this.secondScore = secondScore;
		this.strike = strike;
	}
	
	public Score(int firstScore, int secondScore, boolean spare) {
		this.firstScore = firstScore;
		this.secondScore = secondScore;
		this.spare = spare;
	}
	
	public Score(int firstScore, int secondScore, int lastScore, int strike, boolean spare) {
		this.firstScore = firstScore;
		this.secondScore = secondScore;
		this.lastScore = lastScore;
		this.strike = strike;
		this.spare = spare;
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

	public int getLastScore() {
		return lastScore;
	}
	
	public void setLastScore(int lastScore) {
		this.lastScore = lastScore;
	}

	public int getFrameScore() {
		return frameScore;
	}

	public void setFrameScore(int frameScore) {
		this.frameScore = frameScore;
	}
}
