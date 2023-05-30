import java.util.Scanner;

//키보드로 1 0 1 1 0 0 1 1 0 0 0 0 1 1 1 1
public class Exam_13 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("0 또는 1 입력 : ");
		int count = 0;
		while (true) {
			int n = scn.nextInt();
			if (n == 1) {
				System.out.println(n);
				count++;
				if (count >= 5) {
					break;
				}
			}
		}
		System.out.println("종료");
	}

}
