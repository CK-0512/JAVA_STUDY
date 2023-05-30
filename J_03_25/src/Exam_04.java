import java.util.Scanner;

public class Exam_04 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int ten;
		int cal;
		String str = "";
		int str_per;
		while (true) {
			System.out.print("10진수 :");
			ten = scn.nextInt();
			if (ten == 0) {
				System.out.println("종료");
				break;
			}
			if (ten < 1) {
				System.out.println("오류");
				continue;
			}
			System.out.print("변환진수 : ");
			cal = scn.nextInt();
			if(cal == 2) {
				while (ten != 0) {
					str_per = ten % 2;
					str = str_per + str;
					ten = ten / 2;
				}
				System.out.printf("2진수 : %s\n", str);
				str = "";
			} else if(cal == 8) {
				while (ten != 0) {
					str_per = ten % 8;
					str = str_per + str;
					ten = ten / 8;
				}
				System.out.printf("8진수 : %s\n", str);
				str = "";
			} else if(cal == 16) {
				while (ten != 0) {
					str_per = ten % 16;
					if (str_per == 10) {
						str = "A" + str;
					} else if (str_per == 11) {
						str = "B" + str;
					} else if (str_per == 12) {
						str = "C" + str;
					} else if (str_per == 13) {
						str = "D" + str;
					} else if (str_per == 14) {
						str = "E" + str;
					} else if (str_per == 15) {
						str = "F" + str;
					} else {
						str = str_per + str;
					}
					ten = ten / 16;
				}
				System.out.printf("16진수 : %s\n", str);
				str = "";
			} else {
				System.out.println("오류");
				continue;
			}

		}
	}
}