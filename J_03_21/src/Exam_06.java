import java.util.Scanner;

//키보드로 정수를 입력 홀수이면서 5의 배수이면 "pass"
//아니면 "fail"
public class Exam_06 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int val = scn.nextInt();
		if (val % 2 != 1) {
			System.out.println("홀수가 아닙니다.");
			System.out.println("fail");
		} else if (val % 5 != 0) {
			System.out.println("5의 배수가 아닙니다.");
			System.out.println("fail");
		} else {
			System.out.println("pass");
		}
	}

}
