package com.jslhrd.util;

public interface DataArr extends Data {
	
	int getMaxArr(int[] var);
	
	int getMinArr(int[] var);
	
	default int getSumArr(int[] var) {
		int s = 0;
		for (int i : var) {
			s += i;
		}
		return s;
	}
}
