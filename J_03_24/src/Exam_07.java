import java.util.Scanner;

// websnet@nate.com
public class Exam_07 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int score;
		int sum = 0;
		int cnt = 0;
		int i = 0;
		double avg;
		while (i < 5) {
			System.out.print("점수를 입력하시오 : ");
			score = scn.nextInt();
			cnt++;
			if (score < 70 || score > 90) {
				System.out.println("[입력오류]");
				continue;
			}
			i++;
			sum += score;
		}
		avg = (int)(sum / 5. * 100 + 0.5) / 100.;
		System.out.printf("전체 입력 자료수 : %d\n합계 : %d\n평균 : %.2f\n", cnt, sum, avg);
	}

}
