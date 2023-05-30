// 1 ~ 100 홀수, 짝수합
public class Exam_09 {
	public static void main(String[] args) {
		int etot = 0;
		int otot = 0;
		boolean sw = true;
		for (int i = 1; i <= 100; i++) {
			if (sw == true) {
				otot += i;
				sw = false;
			} else {
				etot += i;
				sw = true;
			}
		}
		System.out.printf("홀수 합 : %d, 짝수 합 : %d", otot, etot);
	}

}
