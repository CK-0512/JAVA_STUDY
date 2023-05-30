//1 ~ 10의 홀수합, 짝수합 동시 게산
public class Exam_08 {
	public static void main(String[] args) {
		int sum1 = 0, sum2 = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum1 += i;
			} else {
				sum2 += i;
			}
		}
		System.out.printf("sum1 : %d, sum2 : %d", sum1, sum2);
	}

}
