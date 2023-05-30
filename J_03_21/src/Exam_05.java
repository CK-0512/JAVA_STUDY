import java.util.Scanner;

//키보드로 점수를 입력 점수가 80이상 90이하이면 "pass"
//아니면 "fail"
public class Exam_05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = scn.nextInt();
		
		if (score >= 80 && score <= 90) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
		if (score >= 80) {
			if (score <= 90) {
				System.out.println("pass");
			} else {
				System.out.println("fail");
			}
		} else {
			System.out.println("fail");
		}
	}

}
