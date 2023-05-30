import java.util.Scanner;

public class Exam_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Std[] std = new Std[10];
		int cnt = 0;
		
		while(cnt < 10) {
			System.out.print("학생 등록 : ");
			int num = sc.nextInt();
			if(num == 0) {
				break;
			}
			String name = sc.next();
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			int mat = sc.nextInt();
			
			std[cnt] = new Std(num, name, kor, eng, mat);
			cnt++;
		}
		
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t판정");
		for(int i = 0; i < cnt; i++) {
			std[i].print();
		}
	}
}
