import java.util.Arrays;

// 정렬(오름차순) - 선택정렬(Selection sort)
public class Exam_05 {
	public static void main(String[] args) {
		int score[] = {50, 90, 80, 60, 70};
		int clone[] = score.clone();
		int num;
		for (int i = 0; i < score.length - 1; i++) {
			for (int j = i + 1; j < score.length; j++) {
				if (score[i] > score[j]) {
					num = score[i];
					score[i] = score[j];
					score[j]= num;
				}
			}
		}

		System.out.println("score = " + Arrays.toString(score));
		System.out.println("clone = " + Arrays.toString(clone));
	}

}
