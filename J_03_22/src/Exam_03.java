import java.util.Scanner;

//3개의 정수를 입력 대, 중, 소 찾기
public class Exam_03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("숫자 3개를 입력하시오 : ");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		
		int m;
		
		if (a<b) {
			m = a;
			a = b;
			b = m;
		}
		if (a<c) {
			m = a;
			a = c;
			c = m;
		}
		if (b<c) {
			m = b;
			b = c;
			c = m;
		}
		if (a == b || a == c || b == c) {
			System.out.println("같은 수가 존재합니다.");
		} else {
		System.out.println("대 : " + a + " 중 : " + b + " 소 : " + c);
		}
	}

}
