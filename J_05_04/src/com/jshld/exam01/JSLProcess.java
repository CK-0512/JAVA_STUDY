package com.jshld.exam01;

public interface JSLProcess {
	int max(int a, int b);
	
	int min(int a, int b);
	
	int max(int ... a);
	
	int min(int ... a);
	
	default int sum(int ...val) {
		int s = 0;
		for (int i : val) {
			s += i;
		}
		return s;
	}
}
