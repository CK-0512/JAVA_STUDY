import java.util.Scanner;

//세개의 정수 대, 중, 소 비교
public class Exam_10 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n, m, k;
		System.out.print("세 숫자를 입력하시오 : ");
		n = scn.nextInt();
		m = scn.nextInt();
		k = scn.nextInt();
		
		int lg = 0, md = 0, sm = 0;
		if (n > m) {
			lg = n;
			if (m > k) {
				md = m;
				sm = k;
			} else {
				if (k > n){
					lg = k;
					md = n;
					sm = m;
				} else {
				md = k;
				sm = m;
				}
			}
		} else if (n < m) {
			lg = m;
			if (n > k) {
				md = n;
				sm = k;
			} else {
				if (k > m) {
					lg = k;
					md = m;
					sm = n;
				} else {
					md = k;
					sm = n;
				}
			}
		} if (n == m || n == k || m == k) {
			System.out.println("같은 수가 존재합니다.");
		} else {
		System.out.println("대 : " + lg + " 중 : " + md + " 소 : " + sm);
		}
	}
}
