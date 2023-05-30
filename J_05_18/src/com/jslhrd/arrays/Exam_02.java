package com.jslhrd.arrays;

import java.util.Arrays;

//배열복제
public class Exam_02 {
	public static void main(String[] args) {
		char[] ch = { 'J', 'A', 'B', 'A', 'P', 'r', 'o', 'g', 'a', 'm' };
		// for()
		char[] arrCh = new char[ch.length];
		for (int i = 0; i < ch.length; i++) {
			arrCh[i] = ch[i];
		}
		System.out.println(Arrays.toString(arrCh));

		// Object clone()
		char[] arrClone= ch.clone();
		System.out.println(Arrays.toString(arrClone));
		
		// Arrays.copyOf()
		char[] arrCopyOf = Arrays.copyOf(ch, ch.length);
		System.out.println(Arrays.toString(arrCopyOf));
		
		// Arrays.copyOfRange(배열, 시작, 끝) //끝전까지
		char[] arrCopyOfRange = Arrays.copyOfRange(ch, 0, 5);
		System.out.println(Arrays.toString(arrCopyOfRange));
		
		// System.arraycopy(원본, 위치, 사본, 시작, 갯수)\
		char[] arrSys = new char[ch.length];
		System.arraycopy(ch, 0, arrSys, 0, ch.length);
		System.out.println(Arrays.toString(arrSys));
	}
}
