import java.util.Scanner;

public class Exam_09 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("계산기 : ");
		int a = scn.nextInt();
		String cal = scn.next();
		int b = scn.nextInt();
		
		int c = 0;
		switch(cal) {
			case "+" :
				c = a + b;
				break;
			case "-" :
				c = a - b;
				break;
			case "*" :
				c = a * b;
				break;
			case "/" :
				c = a / b;
				break;
			case "%" :
				c = a % b;
				break;
			default :
				System.out.println("올바른 계산기호를 넣어 주십시오.");
		}
		System.out.printf("%d %s %d = %d", a, cal, b, c);
	}

}
