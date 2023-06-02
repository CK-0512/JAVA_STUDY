package com.jslhrd.thread;

class Cat1 {
	void run() {
		// 고양이 소리
		for (int i = 1; i <= 10; i++) {
			System.out.println("고양이 : 야옹");
		}
	}
}

class Dog1 {
	void run() {
		// 멍멍이 소리
		for (int i = 1; i <= 10; i++) {
			System.out.println("멍멍이 : 멍멍");
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Cat1 cat = new Cat1();
		Dog1 dog = new Dog1();

		cat.run();
		dog.run();
	}
}
