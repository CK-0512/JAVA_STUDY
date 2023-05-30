
public class Exam_06 {
	public static void main(String[] args) {
		int var[][] = {{1,2,3,4}, {5,6,7,8,9}, {2,5}, {3,5,6}};
		for (int i = 0; i < var.length; i++) {
			for (int j = 0; j < var[i].length; j++) {
				System.out.printf("var[%d][%d] = %d ", i, j, var[i][j]);
			}
			System.out.println();
		}
		
		for (int m[] : var) {
			for (int n : m) {
				System.out.printf("var = %d", n);
			}
			System.out.println();
		}
	}

}
