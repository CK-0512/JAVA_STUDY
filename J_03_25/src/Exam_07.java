import java.util.Scanner;

//소수 판별 : 1, 자신 이외의 수로 나누어지지 않는 수
public class Exam_07 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력 : ");
		int val = scn.nextInt();
		int cal;
		int i;
		for (i = 2; i < val; i++) {
			if (val % i == 0) {
				break;
			}
		}
		if (i == val) {
			System.out.printf("%d는(은) 소수입니다.", val);
		} else {
			System.out.printf("%d는(은) 소수가 아닙니다.", val);
		}
	}

}
