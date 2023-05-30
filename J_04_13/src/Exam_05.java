//1 ~ 5까지 합계
public class Exam_05 {
	static int sum(int num) {
		int s = 0;
		for (int i = 1; i <= num; i++) {
			s += i;
		}
		return s;
	}
	//재귀메소드
	static int func(int num) {
		if(num == 1)
			return 1;
		return num + func(num - 1);
	}
	public static void main(String[] args) {
		int s = sum(5);
		System.out.println("sum = " + s);
		int t = func(5);
		System.out.println("t = " + t);
	}
}
