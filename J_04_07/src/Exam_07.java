//행열 합계
public class Exam_07 {
	public static void main(String[] args) {
		int var[][] = new int[5][5];
		int cnt = 0;
		boolean flag = true;
		
		for (int i = 0; i < var.length; i++) {
			if (flag) {
				for (int j = 0; j < var[i].length; j++) {
					cnt++;
					var[i][j] = cnt;
				}
				flag = false;
			} else {
				for (int j = var[i].length - 1; j >= 0; j--) {
					cnt++;
					var[i][j] = cnt;
				}
				flag = true;
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
