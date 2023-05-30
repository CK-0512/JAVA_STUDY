import java.util.Scanner;

//
public class Exam_06 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int i;
		int score[] = new int[10];
		int sort;
		
		for (i = 0; i < score.length; i++) {
			System.out.printf("%d. 점수 : ", i + 1);
			score[i] = scn.nextInt();
			if (score[i] == 0) {
				i--;
				break;
			}
		}
		
		System.out.print("학생점수 : ");
		for (int j = 0; j < i; j++) {
			System.out.printf("%3d", score[j]);
		}
		System.out.println();
		
		for (int m = 0; m < i - 1; m++) {
			for (int n = m + 1; n < i; n++) {
				if (score[m] < score[n]) {
					sort = score[m];
					score[m] = score[n];
					score[n] = sort;
				}
			}
		}
		System.out.print("내림차순 : ");
		for (int k = 0; k < i; k++) {
			System.out.printf("%3d", score[k]);
		}
	}

}
