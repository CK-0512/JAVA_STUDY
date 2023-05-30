package com.jshld.exam02;

public abstract class AlphaData {
	public String[] data;
	public int cnt;
	
	public AlphaData(String[] data) {
		this.data = data;
	}
	
	public void alphaPrint() {
		System.out.println("영문자 분리 출력");
		for (int i = 0; i < cnt; i++) {
			System.out.print(data[i] + " : ");
			for (int j = 0; j < data[i].length(); j++) {
				char ch = data[i].charAt(j);
				System.out.print(ch + " ");
			}
			System.out.println();
		}
	}
	//영문자별 발생빈도수 계산
	public abstract void alphaCount();
	
	//영문자 역순 출력
	public abstract void alphaDesc();
	
}
