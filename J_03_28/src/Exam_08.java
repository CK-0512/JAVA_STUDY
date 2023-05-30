import java.util.Scanner;

public class Exam_08 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.print("10진수 입력 : ");
			int num = scn.nextInt();
			if (num == -99) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			String str = "";
			int cal = 0;
			while (num > 0) {
				cal = num % 2;
				num = num / 2;
				str = cal + str;
			}
			System.out.printf("결과 2진수 : %s\n", str);
		}
	}

}
