import java.util.Scanner;

public class Exam_06 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("금액을 입력하시오 : ");
		int money = scn.nextInt();
		int cal = 50000;
		int cul = 0;
		boolean flag = true;
		while (money > 0) {
			cul = money / cal;
			System.out.println(cal + "원 : " + cul);
			money = money % cal;
			if (flag == true) {
				cal = cal / 5;
			} else {
				cal = cal / 2;
			}
			flag = !flag;
		}
	}

}
