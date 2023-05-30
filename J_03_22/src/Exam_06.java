import java.util.Scanner;

public class Exam_06 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = scn.next();
		
		if (str.equals("A")) {
			System.out.println("Pass");
		} else {
			System.out.println("fail");
		}
	}

}
