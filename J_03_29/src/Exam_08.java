
public class Exam_08 {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			if (i <= 5) {
				for (int k = 1; k < i; k++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= 6 - i ; j++) {
					System.out.print("*");
				}	
			}
			else {
				for (int k = 1; k < 10 - i; k++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i - 4 ; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
