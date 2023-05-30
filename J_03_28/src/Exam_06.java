
public class Exam_06 {
	public static void main(String[] args) {
		int sum = 0;
		int cal = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j <= 5; j++) {
				cal = j + i * 5;
				sum += cal;
				System.out.printf("%4d", cal);
			}
			System.out.printf("%4d\n", sum);
			sum = 0;
		}
		
		sum = 0;
		cal = 0;
		for (int i = 1; i <= 25; i++) {
			System.out.printf("%4d", i);
			sum += i;
			if (i % 5 == 0) {
				System.out.printf("%4d\n", sum);
				sum = 0;
			}
		}
	}

}
