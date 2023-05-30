package com.jslhrd.util;

public class DataPro implements Data {

	@Override
	public int getMax(int... var) {
		int max = var[0];
		for (int i : var) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}

	@Override
	public int getMin(int... var) {
		int min = var[0];
		for (int i : var) {
			if (i < min) {
				min = i;
			}
		}
		return min;
	}

	@Override
	public void sort(int[] var, boolean bool) {
		if (bool) {
			ascSort(var);
		} else {
			descSort(var);
		}
	}
	
	private void ascSort(int[] var) {
		for (int i = 0; i < var.length - 1; i++) {
			for (int j = i + 1; j < var.length; j++) {
				if (var[i] > var[j]) {
					int srt = var[i];
					var[i] = var[j];
					var[j] = srt;
				}
			}
		}
	}
	
	private void descSort(int[] var) {
		for (int i = 0; i < var.length - 1; i++) {
			for (int j = i + 1; j < var.length; j++) {
				if (var[i] < var[j]) {
					int srt = var[i];
					var[i] = var[j];
					var[j] = srt;
				}
			}
		}
	}

}
