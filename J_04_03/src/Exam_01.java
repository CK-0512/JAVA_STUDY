import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("10진수 : ");
		int dec = scn.nextInt();
		
		System.out.print("변환진수(2, 8, 16) : ");
		int con = scn.nextInt();
		
		String str = "";
		while(dec != 0) {
			int mok = dec / 2;
			int bin = dec % con;
			dec = mok;
			switch(bin) {
				case 10 :
					str = "A" + str;
					break;
				case 11 :
					str = "B" + str;
					break;
				case 12 :
					str = "C" + str;
					break;
				case 13 :
					str = "D" + str;
					break;
				case 14 :
					str = "E" + str;
					break;
				case 15 :
					str = "F" + str;
					break;
				default :
					str = bin + str;
			}
		}
		System.out.printf("%d진수 : %s", con, str);
	}

}
