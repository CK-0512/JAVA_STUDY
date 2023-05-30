
public class Exam_09 {
	public static void main(String[] args) {
		int val[][] = new int[5][5];
		int cnt = 1;
		for (int i = 0; i < val.length; i++) {
			for (int j = 0; j < val[i].length; j++) {
				val[i][j] = cnt;
				cnt++;
			}
		}
	}

}
