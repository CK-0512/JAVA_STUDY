
public class Exam_05 {
	public static void main(String[] args) {
		for (int i = 0; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				if (i == 0) {
					System.out.printf("[%d단]\t\t", j);
				}
				else {
					System.out.printf("%d * %d = %d\t", j, i, (j * i));
				}
			}
			System.out.println();
		}
	}

}
