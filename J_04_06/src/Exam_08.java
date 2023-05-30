import java.util.Scanner;

//키보드로 번호 국어 영어 수학 입력, 총점과 평균을 구하여 출력
//인원은 최대 10명. 번호가 0이면 출력 종료
public class Exam_08 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int std[][] = new int[10][6];
		
		int i;
		
		for (i = 0; i < std.length; i++) {
			System.out.print("학생 등록 : ");
			for (int j = 0; j < 4; j++) {
				std[i][j] = scn.nextInt();
				if (std[i][0] == 0) {
					break;
				}
				std[i][4] += std[i][j];
			}
			std[i][4] -= std[i][0];
			std[i][5] = std[i][4] / 3;
			if (std[i][0] == 0) {
				System.out.println("프로그램 종료.");
				break;
			}
		}
		
		if (i == std.length) {
			i--;
		}
		
		System.out.printf("번호\t국어\t영어\t수학\t총점\t평균\n");
		
		for (int k = 0; k < i; k++) {
			for (int l = 0; l < std[k].length; l++) {
				System.out.printf("%d\t", std[k][l]);
			}
			System.out.println();
		}
	}

}
