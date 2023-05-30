import java.util.Scanner;

public class Exam_02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int nt[][] = new int[10][6];
		String name[] = new String[10];
		double avg[] = new double[10];
		
		int cnt = 0;
		
		while(cnt < 10) {
			System.out.print("학생등록 : ");
			nt[cnt][0] = scn.nextInt();
			if (nt[cnt][0] == 0) {
				break;
			}
			name[cnt] = scn.next();
			nt[cnt][1] = scn.nextInt();
			nt[cnt][2] = scn.nextInt();
			nt[cnt][3] = scn.nextInt();
			
			nt[cnt][4] = nt[cnt][1] + nt[cnt][2] + nt[cnt][3];
			avg[cnt] = (int)(nt[cnt][4] / 3. * 100 + 0.5) / 100.;
			
			cnt++;
		}
		
		for (int i = 0; i < cnt; i++) {
			nt[i][5] = 1;
			for (int j = 0; j < cnt; j++) {
				if (nt[i][4] < nt[j][4]) {
					nt[i][5]++;
				}
			}
		}
		
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
		
		for (int i = 0; i < cnt; i++) {
			System.out.printf("%d\t%s\t", nt[i][0], name[i]);
			for (int j = 1; j < 5; j++) {
				System.out.printf("%d\t", nt[i][j]);
			}
			System.out.printf("%.2f\t%d\n", avg[i], nt[i][5]);
		}
		
		for (int k = 0; k < cnt - 1; k++) {
			for (int l = k + 1; l < cnt; l++) {
				if (nt[k][5] > nt[l][5]) {
					for (int m = 0; m < nt[cnt].length; m++) {
						int sort1 = nt[k][m];
						nt[k][m] = nt[l][m];
						nt[l][m] = sort1;
					}
					String sort2 = name[k];
					name[k] = name[l];
					name[l] = sort2;
					double sort3 = avg[k];
					avg[k] = avg[l];
					avg[l] = sort3;
				}
			}
		}
		
		System.out.println("-----------------------------------------------------------------------------------------------------\n");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
		
		for (int i = 0; i < cnt; i++) {
			System.out.printf("%d\t%s\t", nt[i][0], name[i]);
			for (int j = 1; j < 5; j++) {
				System.out.printf("%d\t", nt[i][j]);
			}
			System.out.printf("%.2f\t%d\n", avg[i], nt[i][5]);
		}
	}

}
