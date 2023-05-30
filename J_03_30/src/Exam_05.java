import java.util.Scanner;

public class Exam_05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("줄수입력 : ");
		int row = scn.nextInt();
		
		int cnt = row * row;
		for (int i = 0; i < row; i++) {
			for (int k = 1; k <= i; k++) {
				System.out.printf("%3s", " ");
			}
			for (int j = 1; j <= row * 2 - i * 2 - 1; j++) {
				System.out.printf("%3d", cnt);
				cnt--;
			}
			System.out.println();
		}
	}
}
