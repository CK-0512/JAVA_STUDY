import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int std[][] = new int[10][11];
		int asc[][] = std.clone();
		
		int i = 0;
		
		while (i < 10) {
			int max = 0;
			int min = 100;
			int sum = 0;
			int avg = 0;
			
			System.out.print("학생등록 : ");
			int num = scn.nextInt();
			if (num == 0) {
				break;
			}
			std[i][0] = num;
			
			
			for (int j = 1; j < 6; j++) {
				int score = scn.nextInt();
				std[i][j] = score;
				if (std[i][j] > max) {
					max = std[i][j];
					std[i][6] = max;
				} else if (std[i][j] < min){
					min = std[i][j];
					std[i][7] = min;
				}
				
				
				sum += score;
				std[i][8] = sum;
			}
			
			
			avg = sum / 5;
			std[i][9] = avg;
			
			
			i++;
		}
		
		
		for (int m = 0; m < i; m++) {
			std[m][10] = 1;
			for (int n = 0; n < i; n++) {
				if (std[m][8] < std[n][8]) {
					std[m][10]++;
				}
			}
		}
		
		
		System.out.println("번호\t점수1\t점수2\t점수3\t점수4\t점수5\t최대점수\t최소점수\t합계\t평균\t순위");
		
		for (int k = 0; k < i; k++) {
			for (int l = 0; l < 11; l++) {
				System.out.printf("%d\t", std[k][l]);
			}
		System.out.println();
		}
		
		for (int k = 0; k < i; k++) {
			for (int l = 0; l < i; l++) {
				if (asc[k][10] < asc[l][10]) {
					for (int m = 0; m < 11; m++) {
						int sort = asc[k][m];
						asc[k][m] = asc[l][m];
						asc[l][m] = sort;
					}
				}
			}
		}
		
		System.out.println("-----------------------------------------------------------------------------------------------------\n");
		
		System.out.println("번호\t점수1\t점수2\t점수3\t점수4\t점수5\t최대점수\t최소점수\t합계\t평균\t순위");
		
		for (int k = 0; k < i; k++) {
			for (int l = 0; l < 11; l++) {
				System.out.printf("%d\t", asc[k][l]);
			}
		System.out.println();
		}
	}

}
