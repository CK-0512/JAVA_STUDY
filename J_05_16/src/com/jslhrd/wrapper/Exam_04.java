package com.jslhrd.wrapper;
// 10진수 -> 2, 8, 16진수로 변환
public class Exam_04 {
	public static void main(String[] args) {
		int dec = 43;
		String bin = Integer.toBinaryString(dec);
		System.out.println("bin : " + bin);
		String oct = Integer.toOctalString(dec);
		System.out.println("oct : " + oct);
		String hex = Integer.toHexString(dec);
		System.out.println("hex : " + hex);
		
		// 2, 8, 16진수 -> 10진수로 변환
		int dec_2 = Integer.parseInt(bin, 2);
		int oct_2 = Integer.parseInt(oct, 8);
		int hex_2 = Integer.parseInt(hex, 16);
		System.out.println("dec_2 : " + dec_2);
		System.out.println("oct_2 : " + oct_2);
		System.out.println("hex_2 : " + hex_2);
		
		System.out.println(Integer.parseInt("A", 16));
		System.out.println(Integer.parseInt("1010", 2));
	}
}
