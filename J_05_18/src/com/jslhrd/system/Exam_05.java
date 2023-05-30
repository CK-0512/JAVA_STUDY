package com.jslhrd.system;
// 시스템 프로퍼티 읽기
public class Exam_05 {
	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		String path = System.getProperty("user.dir");
	
		System.out.println(osName);
		System.out.println(userName);
		System.out.println(userHome);
		System.out.println(path);
	}
}
