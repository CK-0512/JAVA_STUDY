package com.jslhrd.util;

public interface Data {
	
	int getMax(int ... var);
	
	int getMin(int ... var);
	
	void sort(int[] var, boolean bool);
	
	default int getSum(int ... var) {
		int s = 0;
		for (int i : var) {
			s += i;
		}
		return s;
	}
	
}
