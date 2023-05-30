//반환타입 o, 매개변수 x
public class Exam_06 {
	static int test() {//return : 반환, 메소드 끝
		int s = 0;
		for (int i = 1; i <= 10; i++) {
			s += i;
		}
		return s;
	}
	
	static int test1(int a , int b) {//return : 반환, 메소드 끝
		int s = 0;
		for (int i = a; i <= b; i++) {
			s += i;
		}
		return s;
	}
	public static void main(String[] args) {
		int a = test();
		System.out.println(a);
		System.out.println(test());
		
		int b = test1(1, 50);
		System.out.println(b);
		System.out.println(test1(20, 30));
	}
}
