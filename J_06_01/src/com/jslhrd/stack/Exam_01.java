package com.jslhrd.stack;

import java.util.Stack;
//LIFO
public class Exam_01 {
	public static void main(String[] args) {
		Stack<Object> stack = new Stack<>();
		//삽입
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(400);
		System.out.println("스택 객체 수 : " + stack.size());
		Object obj = stack.peek();
		System.out.println("맨 위 객체 : " + obj);
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
			System.out.println("스택 객체 수 : " + stack.size());
		}
	}
}
