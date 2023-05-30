import java.util.Scanner;

public class Exam_04 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int score[] = new int[10];
		//입력
		for (int i = 0; i < score.length; i++) {
			System.out.print("입력 : ");
			score[i] = scn.nextInt();
		}
		//출력
		System.out.print("출력 : ");
		int sum = 0;
		double avg = 0;
		for (int j = 0; j < score.length; j++) {
			sum += score[j];
			System.out.printf("%3d", score[j]);
		}
		avg = (int)(sum / (double)score.length * 100 + 0.5) / 100.;
		System.out.printf(" = %3d, %.2f", sum, avg);
		
		sum = 0;
		for (int k : score) {
			sum += k;
			System.out.printf("%3d", k);
		}
		avg = (int)(sum / (double)score.length * 100 + 0.5) / 100.;
		System.out.printf(" = %3d, %.2f", sum, avg);
	}

}
