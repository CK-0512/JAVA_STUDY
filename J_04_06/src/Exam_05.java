//2차원 배열 출력
public class Exam_05 {
	public static void main(String[] args) {
		int a[][] = new int[2][3];
		
		//기본 for
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.printf("a[%d][%d] = %d ", i, j, a[i][j]);
			}
			System.out.println();
		}
		
		//확장 for
		for (int m[] : a) {
			for (int n : m) {
				System.out.printf("a = %d", n);
			}
			System.out.println();
		}
	}

}
