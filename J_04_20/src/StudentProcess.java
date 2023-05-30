import java.util.Scanner;

public class StudentProcess {
	int cnt;
	Student[] student = new Student[10];
	
	public void studentRegister() {
		Scanner sc = new Scanner(System.in);
		cnt = 0;
		while (cnt < 10) {
			System.out.print("학생등록 : ");
			int num = sc.nextInt();
			if (num == 0)
				break;
			String name = sc.next();
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			int mat = sc.nextInt();
			
			Student std = new Student(num, name, kor, eng, mat);
			student[cnt] = std;
			cnt++;
		}
	}
	
	public void studentRank() {
		for (int i = 0; i < cnt; i++) {
			student[i].rank = 1;
			for (int j = 0; j < cnt; j++) {
				if (student[i].tot < student[j].tot) {
					student[i].rank++;
				}
			}
		}
	}
	public void studentDataPrint() {
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t순위");
		for (int i = 0; i < cnt; i++) {
			student[i].studentPrint();
		}
	}
	public void studentMax() {
		System.out.println("최고 총점 학생");
		Student maxStd = new Student();
		for (int i = 0; i < cnt; i++) {
			if (student[i].rank == 1) {
				maxStd = student[i];
			}
		}
		maxStd.studentPrint();
	}
	public void studentMin() {
		System.out.println("최저 총점 학생");
		Student minStd = new Student();
		minStd = student[0];
		for (int i = 0; i < cnt; i++) {
			if (minStd.tot > student[i + 1].tot) {
				minStd = student[i];
			}
		}
		minStd.studentPrint();
	}
}
