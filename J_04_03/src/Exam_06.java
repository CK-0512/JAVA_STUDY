import java.util.Scanner;

public class Exam_06 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int cnt = 0;
		int score[] = new int[100];
		
		System.out.print("점수 입력 : ");
		while (cnt < 100) {
			score[cnt] = scn.nextInt();
			if (score[cnt] == -99) {
				break;
			}
			cnt++;
		}
		for (int i = 0; i < cnt; i++) {
			System.out.printf("%d : ", score[i]);
			int t = score[i] / 5;
			for (int j = 1; j <= t; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
