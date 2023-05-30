import java.util.Scanner;

public class Exam_09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		Student[] std = new Student[10];
		Student maxStd = new Student();
		Student minStd = new Student();
				
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
			
			std[cnt] = new Student(num, name, kor, eng, mat);
			cnt++;
		}
		
		for (int k = 0; k < cnt; k++) {
			std[k].getRank(std, cnt, k);
			maxStd = std[k].getMax(std, k);
			minStd = std[k].getMin(std, cnt, k);
		}

		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t순위");
		for(int m = 0; m < cnt; m++) {
			std[m].print();
		}
		
		System.out.println("최고 총점 학생");
		maxStd.print();
		
		System.out.println("최저 총점 학생");
		minStd.print();
	}
}
