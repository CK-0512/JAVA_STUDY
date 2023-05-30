import java.util.Scanner;

//키보드로 정수를 입력, 정수가 90~100 => A, 80~90 => B 70~80 => C, 0~69 => F
public class Exam_07 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = scn.nextInt();
		
		String str = "";
		if(score >= 90 && score <= 100) {
			str = "A";
		} else if(score >= 80) {
			str = "B";
		} else if(score >= 70) {
			str = "C";
		} else {
			str = "F";
		}
		System.out.println("str : " + str);
	}

}
