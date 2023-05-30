import java.util.Scanner;

public class Exam_07 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.print("정수 입력 : ");
			int num = scn.nextInt();
			if (num == -99) {
				break;
			}
			int sum = 0;
			for (int i = 1; i <= num; i++) {
				sum += i;
			}
			System.out.printf("1 ~ %d의 합 : %d\n", num, sum);
		}
	}

}
