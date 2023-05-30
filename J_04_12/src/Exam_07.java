
public class Exam_07 {
	static void maxMin(int a, int b, int c) {
		int max = a;
		int min = a;
		if (b > max) {
			max = b;
		} else if (b < min) {
			min = b;
		}
		if (c > max) {
			max = c;
		} else if (c < min) {
			min = c;
		}
		
		System.out.printf("max = %d, min = %d\n", max, min);
	}
	
	static int scoreSum(int score[]) {
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		return sum;
	}
	
	static void scoreDecSort(int score[], int sw) {
		for (int m = 0; m < score.length; m++) {
			System.out.printf("%d ", score[m]);
		}
		System.out.println();
		
		if (sw == 1) {
			for (int i = 0; i < score.length; i++) {
				for (int j = 0; j < score.length - i - 1; j++) {
					if (score[j] < score[j + 1]) {
						int sort = score[j];
						score[j] = score[j + 1];
						score[j + 1] = sort;
					}
				}
			}
		} else if (sw == 2) {
			for (int i = 0; i < score.length - 1; i++) {
				for (int j = i + 1; j < score.length; j++) {
					if (score[i] < score[j]) {
						int sort = score[i];
						score[i] = score[j];
						score[j] = sort;
					}
				}
			}
		} else {
			System.out.println("입력값 오류입니다.");
			return;
		}
		
		for (int m = 0; m < score.length; m++) {
			System.out.printf("%d ", score[m]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int score[] = {10, 90, 50, 70, 80, 55, 78};
		int a = 50, b = 30, c = 70;
		
		//1. a,b,c 세개의 변수를 이용한 대 , 중, 소를 찾아서 출력하는 메소드 호출
		maxMin(a, b, c);
		
		//2. score배열을 이용하여 합계를 구하여 반환하는 메소드 호출
		int sum = scoreSum(score);
		System.out.printf("합계 : %d\n", sum);
		
		//3. score 배열을 이용하여 내림차순 정렬 후 출력하는 메소드 호출
		scoreDecSort(score, 1);
	}
}
