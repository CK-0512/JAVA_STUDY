
public class Exam_05 {
	static void exam(int a[]) {
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.printf("max = %d\n", max);
	}
	public static void main(String[] args) {
		int a[] = {5, 3, 9, 6, 4, 8, 7};
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%d\t", a[i]);
		}
		System.out.println();
		exam(a);
	}
}
