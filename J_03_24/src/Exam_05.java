import java.util.Scanner;

// 키보드로 입력된 N개의 정수 점수중에서
// 0 ~ 100 사이의 점수 5개를 찾아서 합계를 구하여 출력
public class Exam_05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int score;
		int sum = 0;
		int cnt = 0;
//		while (true) {
//			System.out.print("점수를 입력하시오 : ");
//			score = scn.nextInt();
//			if (score >= 0 && score <= 100) {
//				cnt++;
//				sum += score;
//				if (cnt == 5) {
//					break;
//				}
//			}
//		}
		System.out.printf("총점 : %d", sum);
		while (cnt < 5) {
			System.out.print("점수를 입력하시오 : ");
			score = scn.nextInt();
			if (score >= 0 && score <= 100) {
				cnt++;
				sum += score;
			}
		}
		System.out.printf("총점 : %d", sum);
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("점수를 입력하시오 : ");
			score = scn.nextInt();
			if (score < 0 || score > 100) {
				i--;
				continue;
			}
			sum += score;
		}
	}

}
