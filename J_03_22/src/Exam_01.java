import java.util.Scanner;

//5개의 정수를 입력 최대값, 최소값 구하기
public class Exam_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("숫자 5개를 입력하시오 : ");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		int d = scn.nextInt();
		int e = scn.nextInt();
		
		int max = a;
		if (max < b) {
			max = b;
		}
		if (max < c) {
			max = c;
		}
		if (max < d) {
			max = d;
		}
		if (max < e) {
			max = e;
		}
		
		int min = a;
		if (min > b) {
			min = b;
		}
		if (min > c) {
			min = c;
		}
		if (min > d) {
			min = d;
		}
		if (min > e) {
			min = e;
		}
		
		System.out.println("최댓값 : " + max + " 최솟값 : " + min);
	}

}
