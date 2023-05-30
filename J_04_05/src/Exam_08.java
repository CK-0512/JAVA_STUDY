import java.util.Arrays;

//석차
public class Exam_08 {
	public static void main(String[] args) {
		int score[] = {50, 90, 80, 60, 70};
		int rank[] = new int[5];
		
		for (int i = 0; i < score.length; i++) {
			rank[i] = 1;
			for (int j = 0; j < score.length; j++) {
				if (score[i] < score[j]) {
					rank[i]++;
				}
			}
		}
		System.out.println("score = " + Arrays.toString(score));
		System.out.println("rank = " + Arrays.toString(rank));
	}

}
