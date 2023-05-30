import java.util.Scanner;

class Cal2 {

	int add(int a, int b) {
		return a + b;
	}
	int add(int ... a) {//가변인자
		int s = 0;
		for(int i = 0; i < a.length; i++) {
			s += a[i];
		}
		return s;
	}
	int add2(int[] a) {//배열
		int s = 0;
		for(int i = 0; i < a.length; i++) {
			s += a[i];
		}
		return s;
	}
	double add(int a, double b) {
		return a + b;
	}double add(double a, int b) {
		return a + b;
	}
	double add(double a, double b) {
		return a + b;
	}
}

public class Exam_05 {
	public static void main(String[] args) {
		Cal2 c2 = new Cal2();
		System.out.printf("%d + %d = %d\n", 10, 20, c2.add(10, 20));
		System.out.printf("%d + %f = %f\n", 10, 20.5, c2.add(10, 20.5));
		System.out.printf("%f + %d = %f\n", 10.5, 20, c2.add(10.5, 20));
		System.out.printf("%f + %f = %f\n", 10.5, 20.5, c2.add(10.5, 20.5));
		
	}
}
