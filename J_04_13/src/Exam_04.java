//재귀 메소드
public class Exam_04 {
	static void function (int num) {
		if(num == 0) {
			return;
		}
		System.out.println("num = " + num);
		function(num-1);
	}
	public static void main(String[] args) {
		function(5);
	}
}
