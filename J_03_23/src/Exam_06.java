import java.util.Scanner;

//키보드로 10개의 데이터를 입력받아 합계 출력
public class Exam_06 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("숫자 10개를 입력하시오 : ");
		int a, tot = 0;
		for (int i = 1; i <= 10; i++) {
			a  = scn.nextInt();
			tot += a;
		}
		System.out.println(tot);
	}

}
