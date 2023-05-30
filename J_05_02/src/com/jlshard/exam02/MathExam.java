package com.jlshard.exam02;

public abstract class MathExam {

	//2개의 정수 중 큰값
	public abstract int max(int a, int b);
	
	//2개의 정수 중 작은값
	public abstract int min(int a, int b);
	
	//여러개의 정수 중 큰값
	public abstract int max(int ... a);
	
	//여러개의 정수 중 작은값
	public abstract int min(int ... a);
	
}
