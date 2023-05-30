
public class Exam_04 {
	public static void main(String[] args) {
		int cnt = 0;
		for (int i = 0; i < 5; i++) {
			for (int k = 1; k <= 4 - i; k++) {
				System.out.printf("%3s", " ");
			}
			for (int j = 1; j <= i * 2 + 1; j++) {
				cnt++;
				System.out.printf("%3d", cnt);
			}
			System.out.println();
		}
	}

}
