package com.jshld.exam02;

import java.util.Scanner;

public class AlphaMain {
	public static void main(String[] args) {
//		String[] data = {"Korea", "Java", "Programing", "DataBase"};
//		AlphaData a = new AlphaExam(data);
//		a.alphaPrint();
		
		Scanner sc = new Scanner(System.in);
		String[] data = new String[10];
		AlphaData a = new AlphaExam(data);
		int cnt = 0;
		
		while (cnt < 10) {
			System.out.print("영문 단어입력 : ");
			data[cnt] = sc.next();
			if (data[cnt].equals("end")) {
				break;
			}
			cnt++;
		}
		
		a.data = data;
		a.cnt = cnt;
		a.alphaPrint();
		a.alphaCount();
		a.alphaDesc();
		sc.close();
	}
}
