import java.util.Scanner;

class Cal1 {
	int a;
	String op;
	int b;
	
	Cal1(int a, String op, int b) {
		this.a = a;
		this.op = op;
		this.b = b;
	}
	
	void exeu() {
		switch (op) {
			case "+" :
				System.out.printf("%d %s %d = %d", a, op, b, a + b);
				break;
			case "-" :
				System.out.printf("%d %s %d = %d", a, op, b, a - b);
				break;
			case "*" :
				System.out.printf("%d %s %d = %d", a, op, b, a * b);
				break;
			case "/" :
				System.out.printf("%d %s %d = %d", a, op, b, a / b);
				break;
			case "%" :
				System.out.printf("%d %s %d = %d", a, op, b, a % b);
				break;
			default : 
				System.out.println("연산자 오류");
				break;
		}
	}
}

public class Exam_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("계산기 : ");
		int num1 = sc.nextInt();
		String op = sc.next();
		int num2 = sc.nextInt();
		
		Cal1 c1 = new Cal1(num1, op, num2);
		c1.exeu();
		
		sc.close();
	}
}
