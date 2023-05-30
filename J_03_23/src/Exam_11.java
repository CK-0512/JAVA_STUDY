// 1 ~ 50까지의 정수 중에서 짝수이면서 3의 배수를 찾아서 출력
public class Exam_11 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0 && i % 3 == 0) {
				sum += i;
				System.out.println(i);
			}
		}
		System.out.printf("합 : %d\n", sum);
		
		sum = 0;
		int i = 1;
		while (i <= 50) {
			if (i % 2 == 0 && i % 3 == 0) {
				sum += i;
				System.out.println(i);
			} 
			i++;
		}
		System.out.printf("합 : %d\n", sum);
	}

}
