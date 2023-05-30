class DD {
	int a;
	DD(int a) {
		this.a = a;
	}
}
public class Exam_07 {
	public static void main(String[] args) {
		DD[] arr = new DD[5];
		
		arr[0] = new DD(10);
		arr[1] = new DD(40);
		arr[2] = new DD(50);
		arr[3] = new DD(30);
		arr[4] = new DD(20);//객체배열 (클래스 배열)
		System.out.println(arr[0].a);
	}
}
