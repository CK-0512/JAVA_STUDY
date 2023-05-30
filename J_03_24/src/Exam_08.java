import java.util.Scanner;

public class Exam_08 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int score;
		int sum = 0;
		int max = 1; 
		int min = 100;
		int cnt = 0;
		double avg;
		System.out.print("정수 입력 : ");
		while (true) {
			score = scn.nextInt();
			if (score >= 1 && score <= 100) {
				sum += score;
				cnt++;
				if (score > max) {
					max = score;
				} 
				if (score < min) {
					min = score;
				}
			}
			if (score == -99) {
				break;
			}
		}
		avg = (int)(sum / (double)cnt * 100 + 0.5) / 100.;
		
		System.out.printf("최대점수 : %d\n최소점수 : %d\n합계 : %d\n평균 : %.2f", max, min, sum, avg);
	}

}
