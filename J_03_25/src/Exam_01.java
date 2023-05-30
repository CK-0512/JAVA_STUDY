import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int score;
		double avg;
		System.out.print("정수 입력 : ");
			int fscore = scn.nextInt();
			int max = fscore;
			int min = fscore;
			int sum = fscore;
			int cnt = 1;
		while (true) {
			score = scn.nextInt();
			if (score >= 1 && score <= 100) {
				sum += score;
				cnt++;
				if (score > max) {
					max = score;
				} 
				else if (score < min) {
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
