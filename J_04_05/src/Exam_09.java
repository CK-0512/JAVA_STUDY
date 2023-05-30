
public class Exam_09 {
	public static void main(String[] args) {
		int num[] = {7, 3, 5, 6, 2, 1};
		int score[] = {70, 85, 90, 66, 85, 79};
		int rank[] = new int[6];
		
		for (int i = 0; i < num.length; i++) {
			rank[i] = 1;
			for (int j = 0; j < num.length; j++) {
				if (score[i] < score[j]) {
					rank[i]++;
				}
			}
		}
		System.out.println("번호\t점수\t석차");
		for (int k = 0; k < num.length; k++) {
			System.out.printf("%d\t%d\t%d\n", num[k], score[k], rank[k]);
		}
		
		for (int m = 0; m < rank.length - 1; m++) {
			for (int n = m; n < rank.length; n++) {
				if(rank[m] > rank[n]) {
					int sort = rank[m];
					rank[m] = rank[n];
					rank[n] = sort;
					
					sort = score[m];
					score[m] = score[n];
					score[n] = sort;
					
					sort = num[m];
					num[m] = num[n];
					num[n] = sort;
				}
			}
		}
		
		for (int m = 0; m < rank.length; m++) {
			for (int n = 0; n < rank.length - m - 1; n++) {
				if(rank[n] > rank[n+1]) {
					int sort = rank[n];
					rank[n+1] = rank[n];
					rank[n] = sort;
				}
			}
		}
		
		System.out.println("번호\t점수\t석차");
		for (int l = 0; l < num.length; l++) {
			System.out.printf("%d\t%d\t%d\n", num[l], score[l], rank[l]);
		}
	}

}
