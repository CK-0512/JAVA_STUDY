import java.util.Arrays;

//배열 정렬방법 2 - bubble sort
public class Exam_07 {
	public static void main(String[] args) {
		int score[] = {50, 90, 60, 70, 80};
		for (int i = 0; i < score.length; i++) {
			for(int j = 0; j < score.length - i - 1; j++)
				if(score[j] > score[j + 1]) {
					int sort = score[j];
					score[j] = score[j + 1];
					score[j + 1] = sort;
				}
		}
		System.out.println("score = " + Arrays.toString(score));
	}

}
