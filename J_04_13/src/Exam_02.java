//메소드 : 가변인자
public class Exam_02 {
	//메소드 오버로딩 - 다형성
	static int sum (int ... a) {//a를 배열처럼 취급
		int s = 0;
		for (int i = 0; i < a.length; i++) {
			s += a[i];
		}
		return s;
	}
	
	static int add (int[] a) {
		int s = 0;
		for (int i = 0; i < a.length; i++) {
			s += a[i];
		}
		return s;
	}
	public static void main(String[] args) {
		System.out.println(sum(12, 21));
		System.out.println(sum(12, 21, 31));
		System.out.println(sum(12, 21, 42, 53));
		System.out.println(sum(12, 21, 32, 42, 51));
		int s[] = {1, 2, 3, 4, 5};
		System.out.println(add(s));
		System.out.println(add(new int[] {6, 7, 8, 9}));
	}
}
