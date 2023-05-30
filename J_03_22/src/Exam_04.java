import java.util.Scanner;

//
public class Exam_04 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("이름을 입력하시오 : ");
		String name = scn.next();
		System.out.print("3과목의 점수를 입력하시오 : ");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		
		int sum = a + b + c;
		double avg = (int)(sum / 3 * 100 + 0.5) /100.;
		
		String reason = "", pass = "";
		
		if (avg < 60) {
			reason = "평균 미달";
			pass = "불합격";
		} else if (a < 40 || b < 40 || c < 40) {
			reason = "과락";
			pass = "불합격";
		} else {
			reason = "합격";
			pass = "합격";
		}
		System.out.printf("이름 : %s \n평균 : %.2f \n판정 : %s \n불합격사유 : %s", name, avg, pass, reason);
		
		if (avg < 60 || a < 40 || b < 40 || c < 40) {
			pass = "불합격";
			if (avg >= 60) {
				reason = "평균 미달";
			} else {
				reason = "과락";
			}
		} else {
			reason = "합격";
			pass = "합격";
		}
		System.out.printf("이름 : %s \n평균 : %.2f \n판정 : %s \n불합격사유 : %s", name, avg, pass, reason);
	}

}
