import java.util.Scanner;

// 계산기 클래스

public class Exam_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("계산기 : ");
		int num1 = sc.nextInt();
		String op = sc.next();
		int num2 = sc.nextInt();
		
		if(op.equals("+")) {
			System.out.printf("%d %s %d = %d\n", num1, op, num2, num1 + num2);
		} else if(op.equals("-")) {
			System.out.printf("%d %s %d = %d\n", num1, op, num2, num1 - num2);
		} else if(op.equals("*")) {
			System.out.printf("%d %s %d = %d\n", num1, op, num2, num1 * num2);
		} else if(op.equals("/")) {
			System.out.printf("%d %s %d = %d\n", num1, op, num2, num1 / num2);
		} else if(op.equals("%")) {
			System.out.printf("%d %s %d = %d\n", num1, op, num2, num1 % num2);
		} else {
			System.out.println("연산자 오류");
		}
	}
}
