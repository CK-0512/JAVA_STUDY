//행열 합계
public class Exam_08 {
	public static void main(String[] args) {
		int var[][] = new int[5][5];
		int cnt = 0;
		int i = 0;
		int j = -1;
		int c = 1;
		int m = var.length;
		
		while (m >= 0) {
			for (int n = 0; n < m; n++) {
				cnt++;
				j = j + c;
				var[i][j] = cnt;
			}
			
			m = m - 1;
			for(int n = 0; n < m; n++) {
				cnt++;
				i = i + c;
				var[i][j] = cnt;
			}
			c *= -1;
		}
		
		for (i = 0; i < var.length; i++) {
			for (j = 0; j < var[i].length; j++) {
				System.out.printf("%5d", var[i][j]);
			}
			System.out.println();
		}
	}

}
