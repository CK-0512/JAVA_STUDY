import java.util.Scanner;

//키보드로 정수 2개입력 두수중 큰 수, 작은 수를 찾아서 출력
//단 두 수가 같으면 "같은 수입니다"를 출력
public class Exam_08 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n, m;
		int big = 0, small = 0;
		System.out.print("숫자를 2개 입력하십시오 : ");
		n = scn.nextInt();
		m = scn.nextInt();
		
		int lg = 0, sm = 0;
		if(n > m) {
			lg = n;
			sm = m;
		} else if (n < m) {
			lg = m;
			sm = n;
		}
		if(n == m) {
			System.out.println("같은 수 입니다.");
		} else {
			System.out.println("큰 수 : " + lg + " 작은 수 : " + sm);
		}
	}
}
