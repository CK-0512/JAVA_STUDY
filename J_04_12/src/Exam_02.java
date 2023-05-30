//반환타입 x, 매개변수 o
public class Exam_02 {
	// n ~ m까지 합계를 구하여 출력
	static void test(int a, int b) {
		int s = 0;
		for (int i = a; i <= b; i++) {
			s += i;
		}
		System.out.println(a + " ~ " + b + " 합 : " + s);
	}
	
	public static void main(String[] args) {
		test(10, 23);
	}

}
