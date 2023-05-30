
public class Exam_01 {
	public static void main(String[] args) {
		int a;
		String b;
		Point p;//참조변수
		p = new Point();//객체 생성
		p.x = 10;
		p.y = 20;
		p.line();
		System.out.print(p.x);
		System.out.print(p.y);
	}
}
