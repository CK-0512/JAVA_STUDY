import java.util.Scanner;

//3개의 정수를 입력 대, 중, 소 찾기
public class Exam_02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("숫자 3개를 입력하시오 : ");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		
		int max, med, min;
		if (a>b) {
			if (a>c) {
				max = a;
				if (b>c) {
					med = b;
					min = c;
				} else {
					med = c;
					min = b;
				}
			} else {
				max = c;
				med = a;
				min = b;
			}
		} else if (b>c) {
			max = b;
			if (a>c) {
				med = a;
				min = c;
			} else {
				med = c;
				min = a;
			}
		} else {
			max = c;
			med = b;
			min = a;
		}
		if (a == b || a == c || b == c) {
			System.out.println("같은 수가 존재합니다.");
		} else {
		System.out.println("대 : " + max + " 중 : " + med + " 소 : " + min);
		}
	}

}
