package com.jslhrd.bowling2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BowlingProcess {
	List<Score> scores = new ArrayList<>();
	Score score;
	Scanner sc;
	int strike;
	boolean spare;

	public void scoreRegister() {
		sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		String reg = sc.nextLine();
		String[] regBits = reg.split(" ");
		int firstScore;
		int secondScore;
		String lastScore;
		strike = 0;

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
					score = new Score(firstScore, secondScore);
				} else {
					lastScore = regBits[i + 2];
					
					if (secondScore != 10 && secondScore + Integer.parseInt(lastScore) > 10)
						registerError();
					
					if (firstScore != 10)
						spare = true;
					else if (secondScore != 10 && secondScore + Integer.parseInt(lastScore) == 10)
						lastScore = "/";
					else if (Integer.parseInt(lastScore) == 10) 
						lastScore = "X";
					
					score = new Score(firstScore, secondScore, lastScore);
					scores.add(score);
					break;
				}
			} else {
				
					if (firstScore + secondScore > 10) {
						registerError();
					
					if (firstScore == 10) {
						strike++;
						score = new Score(firstScore);
						i--;
					}
					else if (firstScore + secondScore == 10) {
						spare = true;
						score = new Score(firstScore, secondScore);
					} else {
						score = new Score(firstScore, secondScore);
					}
				}
			scores.add(score);
		}
		
		if (scores.size() != 10) {
			registerError();
		}
		
		calFrameScore();
	}

	private void registerError() {
		System.out.println("입력 오류");
		System.exit(1);
	}

	private void calFrameScore() {
		int frameScore = 0;
		
		for (int i = 0; i < scores.size() - 1; i++) {
			if (scores.get(i).getStrike()) 
				frameScore = calStrikeFrameScore(i);
			else if (scores.get(i).getSpare()) {
				if (scores.get(i + 1).getFirstScore() == 10)
					frameScore = 20;
				else
					frameScore = 10 + scores.get(i + 1).getFirstScore();
			}
			else
				frameScore = scores.get(i).getFirstScore() + scores.get(i).getSecondScore();
			
			scores.get(i).setFrameScore(frameScore);
			calLastFrameScore();
		}
	}

	private void calLastFrameScore() {
		int firstScore = 0;
		int secondScore = 0;
		int lastFrameScore = 0;

		if (scores.get(scores.size() - 1).getFirstScore() )
			firstScore = 10;
		else
			firstScore = Integer.parseInt(scores.get(scores.size() - 1).getFirstScore());

		if (scores.get(scores.size() - 1).getSecondScore().equals("X"))
			secondScore = 10;
		else if (scores.get(scores.size() - 1).getSecondScore().equals("/"))
			secondScore = 10 - firstScore;
		else
			secondScore = Integer.parseInt(scores.get(scores.size() - 1).getSecondScore());

		if (scores.get(scores.size() - 1).getLastScore().equals("X")) 
			lastFrameScore = firstScore + secondScore + 10;
		else if (scores.get(scores.size() - 1).getLastScore().equals("/"))
			lastFrameScore = 20;
		else {
			if (scores.get(scores.size() - 1).getLastScore().equals(" "))
				lastFrameScore = firstScore + secondScore;
			else 
				lastFrameScore = firstScore + secondScore + Integer.parseInt(scores.get(scores.size() - 1).getLastScore());
		}
		
		scores.get(scores.size() - 1).setFrameScore(lastFrameScore);
	}

	private int calStrikeFrameScore(int i) {
		int strikeFrameScore;
		
		if (!scores.get(i + 1).getFirstScore().equals("X")) {
			if (!scores.get(i + 1).getSecondScore().equals("/"))
				strikeFrameScore = 10 + Integer.parseInt(scores.get(i + 1).getFirstScore()) + Integer.parseInt(scores.get(i + 1).getSecondScore());
			else 
				strikeFrameScore = 20;
		} else { 
			if (i + 2 < scores.size()) {
				if (!scores.get(i + 2).getFirstScore().equals("X")) 
					strikeFrameScore = 20 + Integer.parseInt(scores.get(i + 2).getFirstScore());
				else
					strikeFrameScore = 30;
			}
			else
				strikeFrameScore = 20 + Integer.parseInt(scores.get(i + 1).getSecondScore());
		}
		return strikeFrameScore;
	}

	public void scorePrint() {
		if (scores.size() != 10)
			return;
		
		int totFrameScore = 0;
		
		for (int i = 1; i <= scores.size() - 1; i++) {
			System.out.printf("|  %d회  ", i);
		}
		System.out.println("|    10회    |");
		
		for (int i = 0; i < scores.size() - 1; i++) {
			System.out.print(scores.get(i));
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
