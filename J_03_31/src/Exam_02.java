
public class Exam_02 {
	public static void main(String[] args) {
		int arr[] = {1, 5, 3, 7, 2, 8, 9, 6};
		int s = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			s += arr[i];
		}
		System.out.println(s);
		System.out.println("----------------------------------------");
		//확장 for() a에 자동으로 배열의 모든 요소를 저장
		s = 0;
		for(int a : arr) {
			System.out.println(a);
			s += a;
		}
		System.out.println(s);
	}

}
