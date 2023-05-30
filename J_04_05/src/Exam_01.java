//배열 공유
public class Exam_01 {
	public static void main(String[] args) {
		int var[] = new int[5];
		
		int arr[] = {10, 20, 30, 40, 50};
		int a[] = arr;
		System.out.println("arr = " + arr);
		System.out.println("a = " + a);
		System.out.println("arr[0] = " + arr[0]);
		System.out.println("a[0] = " + a[0]);
	}

}
