import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("줄 수 :");
		int row = scn.nextInt();
		System.out.print("칸 수 :");
		int col = scn.nextInt();
		
		int cnt = 0;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				cnt++;
				System.out.printf("%3d", cnt);
			}
			System.out.println();
		}
	}

}
