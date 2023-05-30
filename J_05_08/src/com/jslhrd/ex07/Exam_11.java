package com.jslhrd.ex07;

public class Exam_11 {
	static void exp(int ptr) throws NullPointerException {
		if(ptr == 0) {
			throw new NullPointerException();//예외발생
		}
	}
	
	static void exp2(int ptr) {
		try {
			if(ptr == 0) {
				throw new NullPointerException();//예외발생
			}			
		} catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		exp(0);
		
		exp2(0);
	}
}
