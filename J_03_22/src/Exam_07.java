import java.util.Scanner;

public class Exam_07 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("계산기 : ");
		double a = scn.nextDouble();
		String cal = scn.next();
		if (!(cal.equals("+")) && !(cal.equals("-")) && !(cal.equals("*")) && !(cal.equals("/")) && !(cal.equals("%"))) {
			System.out.println("올바른 계산기호를 넣어 주십시오.");
			return;
		}
		double b = scn.nextDouble();
		
		double c = 0;
		if (cal.equals("+")) {
			c = a + b;
		}
		if (cal.equals("-")) {
			c = a - b;
		}
		if (cal.equals("*")) {
			c = a * b;
		}
		if (cal.equals("/")) {
			c = a / b;
		}
		if (cal.equals("%")) {
			c = a % b;
		}
		System.out.printf("%.2f %s %.2f = %.2f", a, cal, b, c);
	}

}
