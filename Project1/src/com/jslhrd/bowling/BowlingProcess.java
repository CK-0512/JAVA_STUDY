package com.jslhrd.bowling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BowlingProcess {
	List<Score> scores = new ArrayList<>();
	Score score;
	Scanner sc;
	int lastFrame;

	public void scoreRegister() {
		sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		String reg = sc.nextLine();
		String[] regBits = reg.split(" ");
		String firstScore;
		String secondScore;
		String lastScore;

		for (int i = 0; i < regBits.length; i++) {
			if (Integer.parseInt(regBits[i]) > 10 || Integer.parseInt(regBits[i]) < 0) {
				registerError();
			}
			if (regBits[i].equals("10"))
				regBits[i] = "X";
		}

		for (int i = 0; i < regBits.length; i = i + 2) {
			firstScore = regBits[i];
			secondScore = regBits[i + 1];
			
			if (scores.size() == 9) {
				if (regBits.length - i != 3) {
					if (firstScore.equals("X") || secondScore.equals("X") || Integer.parseInt(firstScore) + Integer.parseInt(secondScore) >= 10) {
						registerError();
					}
					score = new Score(firstScore, secondScore, " ");
				} else {
					lastScore = regBits[i + 2];
					
					if (!firstScore.equals("X"))
						secondScore = "/";
					else if (!secondScore.equals("X") && Integer.parseInt(secondScore) + Integer.parseInt(lastScore) == 10)
						lastScore = "/";
					else if (!secondScore.equals("X") && Integer.parseInt(secondScore) + Integer.parseInt(lastScore) > 10)
						registerError();
					
					score = new Score(firstScore, secondScore, lastScore);
					scores.add(score);
					break;
				}
			} else {
				
					if (firstScore.equals("X")) {
						score = new Score(firstScore, " ");
						i--;
					} else if (Integer.parseInt(firstScore) + Integer.parseInt(secondScore) > 10) {
						registerError();
					} else if (Integer.parseInt(firstScore) + Integer.parseInt(secondScore) == 10) {
						secondScore = "/";
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
		lastFrame = scores.size() - 1;
		int frameScore = 0;
		
		for (int i = 0; i < lastFrame; i++) {
			if (scores.get(i).getFirstScore().equals("X")) 
				frameScore = calStrikeFrameScore(i);
			else if (scores.get(i).getSecondScore().equals("/")) {
				if (scores.get(i + 1).getFirstScore().equals("X"))
					frameScore = 20;
				else
					frameScore = 10 + Integer.parseInt(scores.get(i + 1).getFirstScore());
			}
			else
				frameScore = Integer.parseInt(scores.get(i).getFirstScore()) + Integer.parseInt(scores.get(i).getSecondScore());
			
			scores.get(i).setFrameScore(frameScore);
			calLastFrameScore();
		}
	}

	private void calLastFrameScore() {
		lastFrame = scores.size() - 1;
		int firstScore = 0;
		int secondScore = 0;
		int lastFrameScore = 0;

		if (scores.get(lastFrame).getFirstScore().equals("X"))
			firstScore = 10;
		else
			firstScore = Integer.parseInt(scores.get(lastFrame).getFirstScore());

		if (scores.get(lastFrame).getSecondScore().equals("X"))
			secondScore = 10;
		else if (scores.get(lastFrame).getSecondScore().equals("/"))
			secondScore = 10 - firstScore;
		else
			secondScore = Integer.parseInt(scores.get(lastFrame).getSecondScore());

		if (scores.get(lastFrame).getLastScore().equals("X")) 
			lastFrameScore = firstScore + secondScore + 10;
		else if (scores.get(lastFrame).getLastScore().equals("/"))
			lastFrameScore = 20;
		else {
			if (scores.get(lastFrame).getLastScore().equals(" "))
				lastFrameScore = firstScore + secondScore;
			else 
				lastFrameScore = firstScore + secondScore + Integer.parseInt(scores.get(lastFrame).getLastScore());
		}
		
		scores.get(lastFrame).setFrameScore(lastFrameScore);
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
		lastFrame = scores.size() - 1;
		if (scores.size() != 10)
			return;
		
		int totFrameScore = 0;
		
		for (int i = 1; i <= lastFrame; i++) {
			System.out.printf("|  %d회  ", i);
		}
		System.out.println("|    10회    |");
		
		for (int i = 0; i < lastFrame; i++) {
			System.out.print(scores.get(i));
		}
		System.out.println(scores.get(lastFrame) + "| " + scores.get(lastFrame).getLastScore() + "  |");
		
		for (int i = 0; i < lastFrame; i++) {
			totFrameScore += scores.get(i).getFrameScore();
			System.out.printf("|  %3d  ", totFrameScore);
		}
		totFrameScore += scores.get(lastFrame).getFrameScore();
		System.out.printf("|    %3d     |\n", totFrameScore);
		
		System.out.println("총점 : " + totFrameScore + "점");
	}
}
