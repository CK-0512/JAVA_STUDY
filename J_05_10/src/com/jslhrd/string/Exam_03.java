package com.jslhrd.string;
//split()
public class Exam_03 {
	public static void main(String[] args) {
		String str = "1111,2222,3333,4444,5555,6666";
		String[] strBits= str.split(",");
		for (String str1 : strBits) {
			System.out.println(str1);
		}
		
		double di = 3.15645;
		String sd = String.format("%7.2f", di);
		System.out.println(sd);
	}
}
