
public class Exam_05 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.print("\t");
			for (int j = 0 ; j < 5 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i * 2 + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------------");
		
		for (int i = 4; i >= 0; i--) {
			System.out.print("\t");
			for (int j = 0 ; j < 5 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i * 2 + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
