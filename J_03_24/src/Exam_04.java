import java.util.Scanner;

// 입력자료수 카운트(5개입력)
// 80이상 자료 5개 입력
// 입력 : 70 80 80 90 50 70 56 67
public class Exam_04 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num;
		int cnt = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.print("숫자를 입력하시오 : ");
			num = scn.nextInt();
			if (num < 80) {
				i--;
			}
		}
		System.out.println("종료");
	}

}