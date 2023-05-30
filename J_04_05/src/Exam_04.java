import java.util.Arrays;

//배열 복제 : clone()
public class Exam_04 {
	public static void main(String[] args) {
		int a[] = {10, 20, 30, 40, 50};
		int b[] = a.clone();

		System.out.println("a = " + Arrays.toString(a));
		System.out.println("b = " + Arrays.toString(b));
	}

}
