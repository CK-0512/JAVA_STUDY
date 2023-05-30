import java.util.Arrays;

public class Exam_03 {
	public static void main(String[] args) {
		int a[] = {10, 20, 30, 40, 50};
		int b[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		System.out.println("a = " + Arrays.toString(a));
		System.out.println("a = " + Arrays.toString(b));
		
		a[1] = 200;
		b[4] = 1000;
		
		System.out.println("a = " + Arrays.toString(a));
		System.out.println("a = " + Arrays.toString(b));
	}

}
