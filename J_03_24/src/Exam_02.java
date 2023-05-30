import java.util.Scanner;

//키보드로 데이터를 입력 합과 평균을 구하여 출력
//단, 입력자료에 -99가 입력되면 프로그램의 종료를 의미한다.
public class Exam_02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sum = 0; 
		double avg;
		int i = 0;
		while (true) {
			System.out.print("숫자를 입력하시오 : ");
			int n = scn.nextInt();
			if (n == -99) {
				break;
			}
			sum += n;
			i++;
		}
		avg = (int)(sum / (double)i * 100 + 0.5) / 100.;
		System.out.printf("합계 : %d, 평균 : %.2f", sum, avg);
	}

}
