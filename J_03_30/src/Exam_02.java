import java.util.Scanner;

public class Exam_02 {
	public static void main(String[] args) {
		
		int cnt = 0;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				cnt++;
				System.out.printf("%3d", cnt);
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------------");
		
		int cnt1 = 0;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 6-i; j++) {
				cnt1++;
				System.out.printf("%3d", cnt1);
			}
			System.out.println();
		}
	}

}
