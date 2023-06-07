package com.jslhrd.bowling;

public class Score {
	private String firstScore;
	private String secondScore;
	private String lastScore;
	private int frameScore;
	private boolean strike;
	private boolean spare;
	
	public Score(String firstScore, String secondScore) {
		this.firstScore = firstScore;
		this.secondScore = secondScore;
	}
	
	public Score(String firstScore, String secondScore, String lastScore) {
		this.firstScore = firstScore;
		this.secondScore = secondScore;
		this.lastScore = lastScore;
	}
	
	public boolean isStrike() {
		return strike;
	}

	public void setStrike(boolean strike) {
		this.strike = strike;
	}

	public boolean isSpare() {
		return spare;
	}

	public void setSpare(boolean spare) {
		this.spare = spare;
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
