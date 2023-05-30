//메소드 : 가변인자
public class Exam_01 {
	//메소드 오버로딩 - 다형성
	static int sum(int a, int b) {
		return a + b;
	}
	static int sum(int a, int b, int c) {
		return a + b + c;
	}
	static int sum(int a, int b, int c, int d) {
		return a + b + c + d;
	}
	static int sum(int a, int b, int c, int d, int e) {
		return a + b + c + d + e;
	}
	public static void main(String[] args) {
		System.out.println(sum(12 , 21));
		System.out.println(sum(12 , 21, 31));
		System.out.println(sum(12 , 21, 42, 53));
		System.out.println(sum(12 , 21, 32, 42, 51));
	}
}
