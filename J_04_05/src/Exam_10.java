import java.util.Scanner;

public class Exam_10 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num[] = new int[10];
		String name[] = new String[10];
		int score[] = new int[10];
		int rank[] = new int[10];
		
		int i;
		for (i = 0; i < num.length; i++) {
			System.out.print("입력 : ");
			num[i] = scn.nextInt();
			if (num[i] == 0) {
				break;
			}
			name[i] = scn.next();
			score[i] = scn.nextInt();
		}
		
		for (int m = 0; m < i; m++) {
			rank[m] = 1;
			for (int n = 0; n < rank.length; n++) {
				if (score [m] < score [n] ) {
					rank[m]++;
				}
			}
		}
		
		System.out.println("번호\t이름\t점수\t순위");
		for (int j = 0; j < i; j++) {
			System.out.printf("%d\t%s\t%d\t%d\n", num[j], name[j], score[j], rank[j]);
		}
		
		for (int k = 0; k < i - 1; k++) {
			for (int l = k; l < i; l++) {
				if (rank[k] > rank[l]) {
					int sort = score[k];
					score[k] = score[l];
					score[l] = sort;
					
					sort = num[k];
					num[k] = num[l];
					num[l] = sort;
					
					sort = rank[k];
					rank[k] = rank[l];
					rank[l] = sort;
					
					String sort2 = name[k];
					name[k] = name[l];
					name[l] = sort2;
					
				}
			}
		}
		System.out.println("번호\t이름\t점수\t순위");
		for (int j = 0; j < i; j++) {
			System.out.printf("%d\t%s\t%d\t%d\n", num[j], name[j], score[j], rank[j]);
		}
	}

}
