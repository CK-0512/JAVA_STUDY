import java.util.Scanner;

//소수 출력
public class Exam_06 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		while (true) {
			System.out.print("정수 : ");
			int num = scn.nextInt();
			int cnt = 0;
			if (num <= 2) {
				System.out.println("입력오류");
				continue;
			} else {
				System.out.println("[소수 출력]");
				for (int i = 2; i <= num; i++) {
					int cal = 0;
					for (int j = 2; j < i; j++) {
						cal = i % j;
						if (cal == 0) {
							break;
						}
					}
					if (cal != 0) {
						System.out.printf("%d\t", i);
						cnt++;
						if (cnt % 5 == 0) {
							System.out.println();
						}
					}
				}
				System.out.printf("\n소수개수 : %d", cnt);
				break;
			}
		}
	}

}
