import java.util.Scanner;

public class Exam_02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
		System.out.print("10진수 : ");
		int dec = scn.nextInt();
		
		System.out.print("변환진수(2, 8, 16) : ");
		int con = scn.nextInt();
		
		String str = "";
		while(dec != 0) {
			int mok = dec / 2;
			int bin = dec % con;
			str = ch[bin] + str;
			dec = mok;
			
		}
		System.out.printf("%d진수 : %s", con, str);
	}

}
