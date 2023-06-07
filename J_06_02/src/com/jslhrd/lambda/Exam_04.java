package com.jslhrd.lambda;

import java.util.Arrays;
import java.util.Scanner;

@FunctionalInterface
interface MaxScore {
	public int maxScore(int[] score);
}

public class Exam_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] scores = new int[7];
		MaxScore maxScore = (int[] score) -> {
			Arrays.sort(score);
			return score[6];
		};
		System.out.print("정수 7개 입력(x,y...) : ");
		String cmd = sc.nextLine();
		String[] cmdBits = cmd.split(",");
		for (int i = 0; i < 7; i++) {
			scores[i] = Integer.parseInt(cmdBits[i]);
			System.out.printf("%d : %d\n", i + 1, scores[i]);
		}
		
		System.out.printf("MAX : %d\n", maxScore.maxScore(scores));
	}
}
