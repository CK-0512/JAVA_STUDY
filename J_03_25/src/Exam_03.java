//10진수를 2진수로 변환
//문자열 연산
public class Exam_03 {
	public static void main(String[] args) {
		int dec = 25;
		String bin = "";
		while(dec != 0) {
			int cal = dec / 2;
			int per = dec % 2;
			bin = per + bin;
			dec = cal;
		}
		System.out.println(bin);
	}
}
