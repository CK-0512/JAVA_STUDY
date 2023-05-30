import java.util.Scanner;
//키보드로 점수를 입력 점수가 90이상이면 "수" 80 이상이면 "우" 70 이상이면 "미" 70 미만이면 "양"
public class Exam_10 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("점수를 입력하시오 : ");
		int score = scn.nextInt();
		String grade = "";
		if (score >= 90) {
			grade = "수";
		} else if (score >= 80) {
			grade = "우";
		} else if (score >= 70) {
			grade = "미";
		} else {
			grade = "양";
		} 
		System.out.printf("성적 : %s\n", grade);
		
		switch (score / 10) {
			case 10 :
			case 9 :
				grade = "수";
				break;
			case 8 :
				grade = "우";
				break;
			case 7 :
				grade = "미";
				break;
			default :
				grade = "양";
		}
		System.out.printf("성적 : %s", grade);
	}

}
