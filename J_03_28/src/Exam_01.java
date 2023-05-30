
public class Exam_01 {
	public static void main(String[] args) {
		for (int i = 1; i <= 25; i++) {
			if (i % 5 == 1) {
				System.out.printf("%d : ", i / 5 + 1);
			}
			System.out.print("*");
			if (i % 5 == 0) {
				System.out.println();
			}
		}
		
		int cnt = 1;
		
		while (cnt <= 25) {
			if (cnt % 5 == 1) {
				System.out.printf("%d : ", cnt / 5 + 1);
			}
			System.out.print("*");
			if (cnt % 5 == 0) {
				System.out.println();
			}
			cnt++;
		}
	}

}
