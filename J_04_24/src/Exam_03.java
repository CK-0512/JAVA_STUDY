class CC {
	static int cnt;
	int sum;
	void test() {
		cnt++;
		sum++;
	}
}
public class Exam_03 {
	public static void main(String[] args) {
		CC c1 = new CC();
		CC c2 = new CC();
		
		c1.test();
		System.out.println("c1.cnt = " + c1.cnt);
		System.out.println("c1.sum = " + c1.sum);
		c2.test();
		System.out.println("c2.cnt = " + c2.cnt);
		System.out.println("c2.sum = " + c2.sum);
		
	}
}
