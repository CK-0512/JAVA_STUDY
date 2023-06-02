package com.jslhrd.thread;

// 자바는 다중상속이 불가능해서 구현방법이 2개
class Cat3 {

}

class Dog3 extends Cat3 implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("멍멍이 : 멍멍");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}
}

public class Exam_03 {
	public static void main(String[] args) {
		Dog3 dog = new Dog3();
		// dog.start();
		Thread t1 = new Thread(dog);
		Thread t2 = new Thread(new Dog3());
		t1.start();
		t2.start();
	}
}
