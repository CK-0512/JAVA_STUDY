import java.util.Scanner;

public class Exam_05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int number[] = new int[100];
		int sum = 0;
		double avg;
		int i;
		
		for (i = 0; i < number.length; i++) {
			System.out.print("정수 입력 : ");
			number[i] = scn.nextInt();
			if (number[i] == 0) {
				break;
			}
			sum += number[i];
		}
		avg = (int)(sum / (double)i * 100 + 0.5) / 100.;
		
		System.out.printf("데이터 출력 : ");
		for (int j = 0; j < i; j++) {
			System.out.printf("%d ", number[j]);
		}
		System.out.printf("\n합계 : %d\n", sum);
		System.out.printf("평균 : %.2f", avg);
	}

}
