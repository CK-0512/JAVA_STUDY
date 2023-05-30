
public class Exam_02 {
	public static void main(String[] args) {
		byte by;//변수 선언
		by = 127;//초기화
		short sh = by;//선언과 동시 초기화
		sh = 1000;
		byte d = (byte)sh;
		System.out.println("by = " + by);
		System.out.println("sh = " + sh);
		System.out.println("d = " + d);
	}

}
