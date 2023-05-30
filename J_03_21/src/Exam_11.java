import java.util.Scanner;

//세개의 정수 가장 큰 값과 가장 작은 값
public class Exam_11 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n, m, k;
		System.out.print("세 숫자를 입력하시오 : ");
		n = scn.nextInt();
		m = scn.nextInt();
		k = scn.nextInt();
		
		int max = n, min = k;
		
		if (max < m) {
			max = m;
			if (min > n) {
				min = n;
			}
			if (max < k) {
			max = k;
			if (m > n) {
				min = n;
			} else {
				min = m;
				}
			}
		} else if (max > m && max > k) {
			max = n;
			if (m > k) {
				min = k;
			} else {
				min = m;
			}
		} 
		if (n == m || n == k || m == k) {
			System.out.println("같은 수가 존재합니다.");
		} else {
		System.out.println("max : " + max + " min : " + min);
		}
	}
}