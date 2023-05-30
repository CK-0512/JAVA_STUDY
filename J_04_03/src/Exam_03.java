import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int won[] = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		System.out.print("금액 : ");
		int money = scn.nextInt();
		int i = 0;
		while (i < won.length) {
			int mok = money / won[i];
			money = money % won[i];
			System.out.printf("%d : %d\n", won[i], mok);
			i++;
		}
	}

}
