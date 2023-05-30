//번호, 국어, 영어, 수학, 총점
public class Exam_07 {
	public static void main(String[] args) {
		int val[][] = {{1, 43, 25, 65, 0}, {2, 5, 86, 54, 0}, {3, 86, 95, 23, 0}, {4, 32, 54, 65, 0}, {5, 85, 53, 12, 0}};
		
		//총점계산
		for (int i = 0; i < val.length; i++) {
			for (int j = 1; j < val[i].length - 1; j++) {
				val[i][4] += val[i][j];
			}
			System.out.printf("%d\n", val[i][4]);
		}
	}

}
