
public class Exam_05 {
	public static void main(String[] args) {
		int score[] = {32, 43, 46, 57, 55, 45, 34, 12, 44, 37, 67, 87};
		int max = score[0];
		int min = score[0];
		int sum = 0;
		for (int i : score) {
			System.out.printf("%3d\n", i);
		}
		
		for (int j : score) {
			if (j > max) {
				max = j;
			} else if (j < min) {
				min = j;
			}
			sum += j;
		}
		sum = sum - max - min;
		System.out.printf("최대 : %3d\n", max);
		System.out.printf("최소 : %3d\n", min);
		System.out.printf("합계 : %3d", sum);
	}

}
