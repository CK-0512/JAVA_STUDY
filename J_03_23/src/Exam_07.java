//1+2+3+...+10
public class Exam_07 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1 ~ 10의 합계는 : " + sum);
		int sum2 = 0;
		for (int i = 1; i <= 10; i+=2) {
			sum += i;
		}
		System.out.println("1 ~ 10의 홀수 합계는 : " + sum2);
		int sum3 = 0;
		for (int i = 2; i <= 10; i+=2) {
			sum += i;
		}
		System.out.println("1 ~ 10의 짝수 합계는 : " + sum3);
	
	}

}
