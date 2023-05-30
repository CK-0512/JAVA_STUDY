package com.jslhrd.test02;

public class Hak {
	String hakbun;//학번
	String name;//이름
	
	public Hak() {}

	public Hak(String hakbun, String name) {
		this.hakbun = hakbun;
		this.name = name;
	}
	
	void titlePrint() {
		System.out.print("학년\t반\t번호\t이름\t");
	}
	
	void dataPrint() {
		//학번 : "1101"
		String sclass = hakbun.substring(0, 1);//학년분리
		String sban = hakbun.substring(1, 2);//반분리
		String sno = hakbun.substring(3);//번호분리
		
		System.out.printf("%s	%s	%s	%s	", sclass, sban, sno, name);
	}
}
