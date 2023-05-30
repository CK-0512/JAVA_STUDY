
public class Exam_02 {
	public static void main(String[] args) {
		boolean flag = true;
		for (int i = 0; i < 5; i++) {
			int cal = 0;
			int sum = 0;
			
			if (flag == true) {
				for (int k = 0; k < 5; k++) {
					sum = i * 5 + 1 + k;
					System.out.printf("%3d", sum);
				}
				flag = false;
			}
			else {
					sum = i * 5 + 1;
				for (int j = 4 ; j >= 0; j--) {
					cal = sum + j;
					System.out.printf("%3d", cal);
				}
				flag = true;
			}
			System.out.println();
		}
	}

}
