//10진수를 16진수로 변환
//문자열 연산
public class Exam_02 {
	public static void main(String[] args) {
		int dec = 1234223;
		String bin = "";
		while(dec != 0) {
			int cal = dec / 16;
			int per = dec % 16;
			if (per == 10) {
				bin = "A" + bin;
			} else if (per == 11) {
				bin = "B" + bin;
			} else if (per == 12) {
				bin = "C" + bin;
			} else if (per == 13) {
				bin = "D" + bin;
			} else if (per == 14) {
				bin = "E" + bin;
			} else if (per == 15) {
				bin = "F" + bin;
			} else {
				bin = per + bin;
			}
			dec = cal;
		}
		System.out.println(bin);
	}
}
