import java.util.Scanner;

public class Exam_05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("금액을 입력하시오 : ");
		int money = scn.nextInt();
		int cal = 50000;
		int cul = 0;
		for (int i = 1; i <= 10; i++) {
			cul = money / cal;
			System.out.println(cal + "원 : " + cul);
			money = money % cal;
			if (i % 2 == 1) {
				cal = cal / 5;
			} else {
				cal = cal / 2;
			}
			
		}
	}

}
