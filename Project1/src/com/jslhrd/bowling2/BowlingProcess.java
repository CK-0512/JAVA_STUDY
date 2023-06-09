package com.jslhrd.bowling2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BowlingProcess {
	List<Score> scores = new ArrayList<>();
	Score score;
	Scanner sc;

	public void scoreRegister() {
		sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		String reg = sc.nextLine();
		String[] regBits = reg.split(" ");
		int firstScore;
		int secondScore;
		int lastScore;
		int strike = 0;
		boolean spare = false;
		
		for (int i = 0; i < regBits.length; i++) {
			if (Integer.parseInt(regBits[i]) > 10 || Integer.parseInt(regBits[i]) < 0) {
				registerError();
			}
		}

		for (int i = 0; i < regBits.length; i = i + 2) {
			firstScore = Integer.parseInt(regBits[i]);
			secondScore = Integer.parseInt(regBits[i + 1]);
			
			if (scores.size() == 9) {
				if (regBits.length - i != 3) {
					if (firstScore == 10 || secondScore == 10 || firstScore + secondScore >= 10) {
						registerError();
					}
					score = new Score(firstScore, secondScore, strike);
				} else {
					lastScore = Integer.parseInt(regBits[i + 2]);
					
					if (secondScore != 10 && secondScore + lastScore > 10)
						registerError();
					
					if (firstScore != 10) {
						spare = true;
				    } else if (secondScore != 10 && secondScore + lastScore == 10) {
						strike++;
						spare = true;
					} else if (secondScore == 10) {
						strike += 2;
						if (lastScore == 10)
							strike++;
					}
					
					score = new Score(firstScore, secondScore, lastScore, strike, spare);
					scores.add(score);
					break;
				}
			} else {
				
					if (firstScore + secondScore > 10) {
						registerError();
					
					if (firstScore == 10) {
						secondScore = 0;
						strike++;
						score = new Score(firstScore, secondScore, strike);
						i--;
					}
					else if (firstScore + secondScore == 10) {
						spare = true;
						score = new Score(firstScore, secondScore, spare);
					} else {
						score = new Score(firstScore, secondScore, strike);
					}
				}
			scores.add(score);
		}
		
		if (scores.size() != 10) {
			registerError();
		}
		
		calFrameScore();
	}
}

	private void registerError() {
		System.out.println("입력 오류");
		System.exit(1);
	}

	private void calFrameScore() {
		int frameScore = 0;
		
		for (int i = 0; i < scores.size() - 1; i++) {
			if (scores.get(i).getStrike() == 1) 
				frameScore = calStrikeFrameScore(i);
			else if (scores.get(i).getSpare()) {
				frameScore = 10 + scores.get(i + 1).getFirstScore();
			}
			else
				frameScore = scores.get(i).getFirstScore() + scores.get(i).getSecondScore();
			
			scores.get(i).setFrameScore(frameScore);
		}
		scores.get(scores.size() - 1).setFrameScore(calLastFrameScore());
	}

	private int calLastFrameScore() {
		if (scores.get(scores.size() - 1).getSpare() || scores.get(scores.size() - 1).getStrike() != 0) 
			return scores.get(scores.size() - 1).getFirstScore() + scores.get(scores.size() - 1).getSecondScore() +
					scores.get(scores.size() - 1).getLastScore();
		else
			return scores.get(scores.size() - 1).getFirstScore() + scores.get(scores.size() - 1).getSecondScore();
	}

	private int calStrikeFrameScore(int i) {
		int strikeFrameScore;
		
		if (scores.get(i + 1).getFirstScore() != 10) {
				strikeFrameScore = 10 + scores.get(i + 1).getFirstScore() + scores.get(i + 1).getSecondScore();
		} else { 
			if (i + 2 < scores.size()) 
				strikeFrameScore = 20 + scores.get(i + 2).getFirstScore();
			else
				strikeFrameScore = 20 + scores.get(i + 1).getSecondScore();
		}
		return strikeFrameScore;
	}

	public void scorePrint() {
		
		int totFrameScore = 0;
		
		for (int i = 1; i <= scores.size() - 1; i++) {
			System.out.printf("|  %d회  ", i);
		}
		System.out.println("|    10회    |");
		
		for (int i = 0; i < scores.size() - 1; i++) {
			if (scores.get(i).getStrike() == 1)
				System.out.printf("| X |   ");
			else if (scores.get(i).getSpare())
				System.out.printf("| %d | / ", scores.get(i).getFirstScore());
			else
				System.out.printf("| %d | %d ", scores.get(i).getFirstScore(), scores.get(i).getSecondScore());
		}
		System.out.println(scores.get(scores.size() - 1) + "| " + scores.get(scores.size() - 1).getLastScore() + "  |");
		
		for (int i = 0; i < scores.size() - 1; i++) {
			totFrameScore += scores.get(i).getFrameScore();
			System.out.printf("|  %3d  ", totFrameScore);
		}
		totFrameScore += scores.get(scores.size() - 1).getFrameScore();
		System.out.printf("|    %3d     |\n", totFrameScore);
		
		System.out.println("총점 : " + totFrameScore + "점");
	}
}
