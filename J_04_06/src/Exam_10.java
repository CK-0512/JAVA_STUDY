
public class Exam_10 {
	public static void main(String[] args) {
		int val[][] = new int[5][5];
		int cnt = 0;
		for (int i = 0; i < val.length; i++) {
			for (int j = 0; j < val.length; j++) {
				cnt++;
				val[j][i] = cnt;
			}
		}
		
		for (int i = 0; i < val.length; i++) {
			for (int j = 0; j < val[i].length; j++) {
				System.out.printf("%3d", val[i][j]);
			}
			System.out.println();
		}
	}

}
