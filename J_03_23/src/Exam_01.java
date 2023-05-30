import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("숫자 5개를 입력하시오 : ");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		int d = scn.nextInt();
		int e = scn.nextInt();
		int max, min, sum;
		double avg;
		
		max = a;
		min = a;
		
		if (max < b) {
			max = b;
		}
		if (max < c) {
			max = c;
		}
		if (max < d) {
			max = d;
		}
		if (max < e) {
			max = e;
		}
		if (min > b) {
			min = b;
		}
		if (min > c) {
			min = c;
		}
		if (min > d) {
			min = d;
		}
		if (min > e) {
			min = e;
		}
		sum = a + b + c + d + e - max - min;
		avg = sum / 3.;
		System.out.printf("최대 점수 : %d\n최소 점수 : %d\n총점 : %d\n평균 : %.2f\n", max, min, sum, avg);
	}

}
