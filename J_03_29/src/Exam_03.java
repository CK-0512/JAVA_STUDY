import java.util.Scanner;

//구구단 출력
public class Exam_03 {
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		while (true) {
			System.out.print("구구단 : ");
			int num = scn.nextInt();
			int sum = 0;
			if (num == 0) {
				System.out.print("종료");
				break;
			}
			for (int i = 1; i <= 9; i++) {
				sum = num * i;
				System.out.printf("%d * %d = %d\n", num, i, sum);
			}
		}
	}

}
