import java.util.Scanner;

//2진 검색
public class Exam_03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int ave[] = {78, 62, 51, 83, 95, 44, 54, 65, 72, 55, 81, 48, 97, 36};
		boolean flag = true;
		int low = 0;
		int high = ave.length;
		
		for (int i = 0; i < ave.length - 1; i++) {
			for (int j = i + 1; j < ave.length; j++) {
				if (ave[i] > ave[j]) {
					int sort = ave[i];
					ave[i] = ave[j];
					ave[j] = sort;
				}
			}
		}
		
		while (true) {
			System.out.print("점수 : ");
			int score = scn.nextInt();
			if(score == -99) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			while (low < high) {
				int m = (low + high) / 2;
				if (score == ave[m]) {
					System.out.printf("%d점은 %d번에 있음.\n", score, m + 1);
					flag = false;
					break;
				} else if (score > ave[m]) {
					low = m + 1;
				} else {
					high = m - 1;
				}
			}
			if (flag) {
				System.out.printf("%d점은 없음.\n", score);
			}
		}
	}

}
