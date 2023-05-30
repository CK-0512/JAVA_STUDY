package com.jlshard.exam03;

public class Number extends NumberProcess {
	int[] numberOrigin;

	public Number(int[] number, int cnt) {
		super(number, cnt);
		this.numberOrigin = number.clone();
	}
	
	public void dataPrint() {
		for (int i = 0; i < cnt; i++) {
			System.out.printf("%d\t", numberOrigin[i]);
		}
		System.out.println();
	}

	@Override
	public void ascSort() {
		for (int i = 0; i < cnt - 1; i++) {
			for (int j = i + 1; j < cnt; j++) {
				if (number[i] > number[j]) {
					int sort = number[i];
					number[i] = number[j];
					number[j] = sort;
				}
			}
		}
		super.dataPrint();
	}

	@Override
	public void descSort() {
		for (int i = 0; i < cnt - 1; i++) {
			for (int j = i + 1; j < cnt; j++) {
				if (number[i] < number[j]) {
					int sort = number[i];
					number[i] = number[j];
					number[j] = sort;
				}
			}
		}
		super.dataPrint();
	}

	@Override
	public int maxMinTotal() {
		int max = number[0];
		int min = number[0];
		int tot = 0;
		for (int i = 0; i < cnt; i++) {
			tot += number[i];
			if (number[i] > max) {
				max = number[i];
			} else if (number[i] < min) {
				if (number[i] == 0) {
					break;
				}
				min = number[i];
			}
		}
		return tot - max - min;
	}

}
