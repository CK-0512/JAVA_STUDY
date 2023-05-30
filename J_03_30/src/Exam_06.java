import java.util.Scanner;

public class Exam_06 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.print("줄수입력(홀수) : ");
			int row = scn.nextInt();
			int cnt = 0;
			boolean flag;
			if (row % 2 == 1) {
				cnt = (row / 2 + 1) * (row / 2 + 1);
				flag = true;
			} else {
				System.out.println("홀수를 입력하시오.");
				continue;
			}
			for (int i = 0; i < row; i++) {
				if (i <= row / 2 ) {
					for (int k = 0; k < i; k++) {
						System.out.printf("%3s", " ");
					}
					for (int j = 1; j <= row - i * 2; j++) {
						System.out.printf("%3d", cnt);
						cnt--;
					}
				} else {
					if (i == row / 2 + 1) {
						cnt++;
					}
					for (int k = 0; k < row - i - 1; k++) {
						System.out.printf("%3s", " ");
					}
					for (int j = 1; j <= i * 2 - row + 2; j++) {
						cnt++;
						System.out.printf("%3d", cnt);
					}
				}
				System.out.println();
			}
			if (flag == true) {
				break;
			}
		}
	}
}