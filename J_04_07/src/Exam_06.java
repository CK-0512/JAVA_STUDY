//행열 합계
public class Exam_06 {
	public static void main(String[] args) {
		int var[][] = new int[6][6];
		int cnt = 0;
		
		for (int i = 0; i < var.length - 1; i++) {
			for (int j = 0; j < var[i].length - 1; j++) {
				cnt++;
				var[i][j] = cnt;
				var[i][var[i].length - 1] += cnt;
				var[var.length - 1][j] += cnt;
				var[var.length - 1][var.length - 1] += cnt;
			}
		}
		
		for (int i = 0; i < var[0].length; i++) {
			for (int j = 0; j < var.length; j++) {
				System.out.printf("%5d", var[i][j]);
			}
			System.out.println();
		}
	}

}
