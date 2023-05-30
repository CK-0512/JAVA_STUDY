
public class Exam_02 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + " : ");
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		int i = 1, j = 1;
		while (i <= 5) {
			System.out.print(i + " : ");
			while (j <= 5) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
			j = 1;
		}
	}

}
