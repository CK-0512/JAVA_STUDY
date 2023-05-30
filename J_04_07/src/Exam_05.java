
public class Exam_05 {
	public static void main(String[] args) {
		int var[][] = new int[5][5];
		int cnt = 0;
		
		for (int i = 0; i < var.length; i++) {
			for (int j = var[i].length - i - 1; j < var[i].length; j++) {
				cnt++;
				var[i][j] = cnt;
			}
		}
		
		for (int i = 0; i < var[0].length; i++) {
			for (int j = 0; j < var.length; j++) {
				System.out.printf("%3d", var[i][j]);
			}
			System.out.println();
		}
	}

}