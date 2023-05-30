
public class Exam_09 {
	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
			if (i <= 5) {
				for (int k = 1; k < i; k++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= 11 - 2 * i; j++) {
					System.out.print("*");
				}
			} else {
				for (int k = 1; k < 10 - i; k++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= 2 * i - 9; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
