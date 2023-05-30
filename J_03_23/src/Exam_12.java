//do-while();
public class Exam_12 {
	public static void main(String[] args) {
		System.out.println("------------------for()-------------------");
		int i, sum = 0;
		for (i = 0; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println("------------------while()-------------------");
		sum = 0;
		i = 0;
		while (i <= 10) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		System.out.println("------------------do-while()-------------------");
		sum = 0;
		i = 0;
		do {
			sum += i;
			i++;
		} while (i <= 10);
		System.out.println(sum);
	}

}
