import java.util.Scanner;

public class Exam_07 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int pay[] = new int[10];
		int sum[] = new int[10];
		int money[] = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		int num = 0;
		int i, j, k;
		
		for (i = 0; i < pay.length; i++) {
			System.out.print("급여 : ");
			pay[i] = scn.nextInt();
			if (pay[i] == 0) {
				break;
			}
		}
		System.out.println("급여 :\t\t오만\t일만\t오천\t일천\t오백\t일백\t오십\t일십\t 오\t 일");
		for (j = 0; j < i; j++) {
			System.out.printf("%d : ", pay[j]);
			for (k = 0; k < sum.length; k++) {
				num = pay[j] / money[k];
				pay[j] = pay[j] % money[k];
				System.out.printf("\t%3d ", num);
				sum[k] += num;
			}
			System.out.println();
		}
		
		System.out.printf("합계 :\t");
		for (int m = 0; m < sum.length; m++) {
			System.out.printf("\t%3d ", sum[m]);
		}
	}

}
