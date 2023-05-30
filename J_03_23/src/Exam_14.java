// 1 ~ 100까지의 정수중에서 홀수만 출력, 마지막에 합계 출력
public class Exam_14 {
	public static void main(String[] args) {
		int i, sum = 0;
		for (i = 1; i <= 100; i++) {
				if (i % 2 != 0) {
					System.out.print(i + "\t");
					sum += i;
					if (sum % 5 == 0) {
						System.out.println();
				}
			}
		}
		System.out.printf("합계 : %d\n", sum);
		
		i = 0; 
		sum = 0;
		while (i <= 100) {
			if (i % 2 != 0) {
				System.out.print(i + "\t");
				sum += i;
				if (sum % 5 == 0) {
					System.out.println();
				}
			}
			i++;
		}
		System.out.printf("합계 : %d\n", sum);
		
		
		i = 0; 
		sum = 0;
		do {
			if (i % 2 != 0) {
				System.out.print(i + "\t");
				sum += i;
				if (sum % 5 == 0) {
					System.out.println();
				}
			}
			i++;
		} while (i <= 100) ;
		System.out.printf("합계 : %d", sum);
	}

}
