
public class Exam_01 {
	public static void main(String[] args) {
		boolean flag = true;
		int cal = 0;
		int loop = 0;
		for (int i = 1; i <= 5; i++) {
			
			if (flag == true) {
				loop = loop + 1;
				cal = loop;
				for (int k = 1; k <= 5; k++) {
					System.out.printf("%3d", cal);
					cal++;
				}
				flag = false;
			}
			else {
					loop = loop + 9;
					cal = loop;
				for (int j = 1 ; j <= 5; j++) {
					System.out.printf("%3d", cal);
					cal--;
				}
				flag = true;
			}
			System.out.println();
		}
	}

}
