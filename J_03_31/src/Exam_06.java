import java.util.Scanner;

public class Exam_06 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.print("10진수 : ");
			int num = scn.nextInt();
			if (num > 1024) {
				System.out.println("최댓값(1024) 초과");
				continue;
			} 
			else if (num == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			int bin [] = new int[10];
			int i = 0;
			while (true) {
				bin [i] = num % 2;
				num = num / 2;
				if (num == 0) {
					break;
				}
				i++;
				
			}
				System.out.printf("2진수 : ");
			for (int j = i; j >= 0; j--) {
				System.out.printf("%d", bin[j]);
			}
			System.out.println();
		}
		
	}

}
