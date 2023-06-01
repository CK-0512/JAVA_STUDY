package com.jslhrd.stack;

import java.util.LinkedList;
import java.util.Queue;
//FIFO
public class Exam_02 {
	public static void main(String[] args) {
		//Queue<Integer> que = new Queue(); 인터페이스
		Queue<Integer> que = new LinkedList<>();
		
		que.offer(100);
		que.offer(200);
		que.offer(300);
		que.offer(400);
		
		System.out.println("큐 객체 수 : " + que.size());
		
		while(!que.isEmpty()) {
			System.out.println("꺼낸 객체 : " + que.poll());
			System.out.println("큐 객체 수 : " + que.size());
		}
	}
}
