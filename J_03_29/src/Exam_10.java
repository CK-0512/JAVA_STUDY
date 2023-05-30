
public class Exam_10 {
	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {
			if (i <= 4) {
				for (int k = 1; k <= 4 - i; k++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i * 2 + 1; j++) {
					System.out.print("*");
				}
			} else {
				for (int k = 1; k <= i - 4; k++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= 17 - i * 2; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
