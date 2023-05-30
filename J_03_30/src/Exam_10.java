import java.util.Scanner;

public class Exam_10 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int arr[] = new int[10];
		int sum = 0;
		int cnt = 0;
		while (cnt <= 10) {
			System.out.print("숫자 입력 : ");
			arr[cnt] = scn.nextInt();
			if (arr[cnt] == 0) {
				break;
			}
			sum += arr[cnt];
			cnt++;
		}
		for (int i = 0; i < cnt; i++) {
			System.out.printf("%5d\t", arr[i]);
		}
		System.out.printf("sum = %d", sum);
	}

}
