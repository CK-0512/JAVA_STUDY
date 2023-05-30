import java.util.Scanner;

public class Exam_09 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while (true) {
			String str = "";
			int cal = 0;
			
			
			System.out.print("10진수 : ");
			int num = scn.nextInt();
			if (num == 0) {
				System.out.print("종료");
				break;
			}
			if (num < 1) {
				System.out.printf("오류\n");
				continue;
			}
			
			
			System.out.print("변환진수 : ");
			int bin = scn.nextInt();
			
			if (bin == 2) {
				while (num > 0) {
					cal = num % 2;
					num = num / 2;
					str = cal + str;
				}
				System.out.printf("결과 2진수 : %s\n", str);
				
			} else if (bin == 8) {
				while (num > 0) {
					cal = num % 8;
					num = num / 8;
					str = cal + str;
				}
				System.out.printf("결과 8진수 : %s\n", str);
				
			} else if (bin == 16) {
				while (num > 0) {
					cal = num % 16;
					switch (cal) {
						case 11 : {
							str = "A" + str;
							break;
						}
						case 12 : {
							str = "B" + str;
							break;
						}
						case 13 : {
							str = "C" + str;
							break;
						}
						case 14 : {
							str = "D" + str;
							break;
						}
						case 15 : {
							str = "E" + str;
							break;
						}
						default : {
							str = cal + str;
						}
					}	
					num = num / 16;
				}
				System.out.printf("결과 16진수 : %s\n", str);
			}	
				else {
				System.out.printf("오류\n");
			}
				
		}

	}

}
