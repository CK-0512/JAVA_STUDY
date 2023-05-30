class BB {
	
	void test1() {
		
	}
	void test2(int a, int b) {
		
	}
	int test3() {
		return 0;
	}
	int test4(int a, int b) {
		return 0;
	}
}
public class Exam_02 {
	public static void main(String[] args) {
		BB b1 = new BB();
		b1.test1();
		b1.test2(43, 23);
		int result = b1.test3();
		result = b1.test4(42, 12);
	}
}
