import java.util.Scanner;

//구구단
public class Exam_10 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("원하는 단을 입력하시오 : ");
		int dan = scn.nextInt();
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, (dan * i));
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
	}

}
