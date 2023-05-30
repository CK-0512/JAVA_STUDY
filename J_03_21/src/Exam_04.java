import java.util.Scanner;

//조건문 : if ~ else, switch ~ case
public class Exam_04 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = scn.nextInt();
		if(score >= 80) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		System.out.println("프로그램 종료");
	}

}
