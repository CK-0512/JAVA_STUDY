package com.jslhrd.ex07;

import java.io.IOException;

//예외처리(Exception)
/*	try {
 * 		//예외가능 문장
 * 	} catch(예외클래스) {
 * 		//예외발생시 처리할 문장 
 *  } 
 * 
 */
public class Exam_07 {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		try {
			System.out.printf("a[5] = %d" , a[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 첨자오류입니다.");
		} catch (Exception ee) {
			
		} finally {
			
		}
		
	}
}
