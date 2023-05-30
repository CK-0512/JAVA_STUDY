//while();
public class Exam_09 {
	public static void main(String[] args) {
		int i = 0, s = 0;
		while (i <= 10) {
			s += i;
			i++;
		}
		System.out.println(s);
		
		s = 0;
		for (int j = 1; j <= 10; j ++) {
			s += j;
		}
		System.out.println(s);
		
		i = 0; 
		s = 0;
		
		while (true) {
			s += i;
			i++;
			if (s >= 100) {
				break;
			}
		}
		System.out.println(s);

	}

}
