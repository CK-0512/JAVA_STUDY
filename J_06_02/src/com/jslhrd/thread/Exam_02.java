package com.jslhrd.thread;

class Cat2 extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("고양이 : 야옹");
			try {
				Thread.sleep(500);
			} catch(Exception e) {}
		}
	}
}

class Dog2 extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("멍멍이 : 멍멍");
			try {
				Thread.sleep(500);
			} catch(Exception e) {}
		}
	}
}

public class Exam_02 {
	public static void main(String[] args) {
		Cat2 cat = new Cat2();
		Dog2 dog = new Dog2();
		
		cat.start();
		dog.start();
	}
}
