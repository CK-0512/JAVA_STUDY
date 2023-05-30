import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("사원의 아이디를 입력하시오 : ");
		String id = scn.next();
		System.out.print("사원의 등급을 입력하시오 : ");
		int gd = scn.nextInt();
		System.out.print("사원의 근무시간을 입력하시오 : ");
		int ti = scn.nextInt();
		int ot;
		int tp = 0;
		int sl;
		
		switch (gd) {
			case 1 :
				tp = 10000;
				break;
			case 2 :
				tp = 5000;
				break;
			case 3 :
				tp = 2000;
				break;
			default :
				System.out.println("잘못된 등급");
				return;
		}
		if(ti > 36) {
			ot = ti - 36;
			sl = (int)((tp * 36) + (tp * ot * 1.5));
			if (ti > 50) {
				ot = 14;
				sl = (int)((tp * 36) + (tp * ot * 1.5 ));
			}
		} else {
			sl = tp * ti;
		}
		
		
		System.out.println("아이디\t등급\t시급\t근무시간\t주간급여");
		System.out.printf("%s\t%d\t%d\t%d\t%d", id, gd, tp, ti, sl);
	}
}
