package com.jslhrd.random;

import java.util.Random;

// 로또
public class Exam_02 {
	public static void main(String[] args) {
		Random r = new Random();
		for (int i = 0; i < 6; i++) {
			int[] lotto = new int[6];
			lotto[i] = r.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				while (true) {
					lotto[i] = r.nextInt(45) + 1;
					if (lotto[i] != lotto[j])
						break;
				}
			}
			System.out.printf("%d\n", lotto[i]);
		}
	}
}
