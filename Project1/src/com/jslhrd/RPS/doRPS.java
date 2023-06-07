package com.jslhrd.RPS;

import java.util.Random;
import java.util.Scanner;

public class doRPS {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int comRPS;
		int userRPS;
		String result;
		int cnt = 0;

		while (true) {
			comRPS = random.nextInt(3) + 1;
			System.out.print("가위(1) 바위(2) 보(3) : ");
			userRPS = sc.nextInt();
			if (userRPS - comRPS == -2 || userRPS - comRPS == 1)
				result = "승";
			else if (userRPS - comRPS == -1 || userRPS - comRPS == 2)
				result = "패";
			else
				result = "무";
			cnt++;
			System.out.printf("%d회전 : %s\n", cnt, result);

			if (cnt % 5 == 0) {
				System.out.print("계속 하시겠습니까?(Y/N) : ");
				String cmd = sc.next();
				if (cmd.equalsIgnoreCase("y"))
					continue;
				else
					break;
			}
			
		}
	}
}
