package com.jshld.exam02;

public class AlphaExam extends AlphaData {

	public AlphaExam(String[] data) {
		super(data);
	}

	public void alphaCount() {
		System.out.println("영문자 빈도수 출력");
		for (int i = 65; i < 91; i++) {
			System.out.print((char)i + " ");
		}
		System.out.println();

		for (int i = 65; i < 91; i++) {
			int alphabetCount = 0;
			for (int j = 0; j < cnt; j++) {
				String dataUpper = data[j].toUpperCase();
				for (int k = 0; k < data[j].length(); k++) {
					if ((int) dataUpper.charAt(k) == i) {
						alphabetCount++;
					}
				}
			}
			System.out.printf("%d ", alphabetCount);

		}
		System.out.println();
	}

	public void alphaDesc() {
		System.out.println("단어 뒤집기");
		for (int i = 0; i < cnt; i++) {
			System.out.print(data[i] + " : ");
			for (int j = data[i].length() - 1; j >= 0; j--) {
				System.out.print(data[i].charAt(j) + " ");
			}
			System.out.println();
		}
	}
}
