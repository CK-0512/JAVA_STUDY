package com.jlshard.exam03;

public abstract class NumberProcess {
	int [] number;
	int cnt;
	
	public NumberProcess(int[] number, int cnt) {
		this.cnt = cnt;
		this.number = number;
	}
	
	public void dataPrint() {
		System.out.print("Data : ");
		for (int i = 0; i < cnt; i++) {
			System.out.printf("%d\t", number[i]);
		}
		System.out.println();
	}
	
	//data 오름차순 정렬
	public abstract void ascSort();
	
	//data 내림차순 정렬
	public abstract void descSort();
	
	//최대, 최소를 뺀 나머지 합계
	public abstract int maxMinTotal();
}
