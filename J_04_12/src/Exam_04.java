//reference(참조)에 의한 호출
public class Exam_04 {
	static void swap(int d[]) {
		int t = d[0];
		d[0] = d[1];
		d[1] = t;
	}
	public static void main(String[] args) {
		int data[] = {10, 20};
		System.out.printf("data[0] = %d, data[1] = %d\n", data[0], data[1]);
		
		swap(data);
		System.out.printf("data[0] = %d, data[1] = %d", data[0], data[1]);
	}
}
