
public class Exam_04 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + " : ");
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.print("----------------------------------------\n");
		
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + " : ");
			for (int k = 1; k <= 5 - i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.print("----------------------------------------\n");
		
		for (int i = 5; i >= 1; i--) {
			System.out.print(i + " : ");
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.print("----------------------------------------\n");
		
		for (int i = 5; i >= 1; i--) {
			System.out.print(i + " : ");
			for (int k = 1; k <= 5 - i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
