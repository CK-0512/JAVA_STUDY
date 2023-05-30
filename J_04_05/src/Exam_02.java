
public class Exam_02 {
	public static void main(String[] args) {
		int var[] = {10, 20, 30, 40, 50};
		int a[] = var;
		int s = 0;
		//배열 내용 출력
		for (int i : a) {
			System.out.printf("i = %d\n", i);
			s += i;
		}
		System.out.printf("s = %d", s);
	}

}
