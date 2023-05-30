package StudentPackage;

import java.util.Scanner;

public class StudentProcess {
	
	Student[] students = new Student[10];
	int cnt = 0;
	
	public void studentRegister() {
		Scanner sc = new Scanner(System.in);
		
		while (cnt < 10) {
			System.out.print("학생등록 : ");
			int num = sc.nextInt();
			if (num == 0) {
				break;
			}
			String name = sc.next();
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			int mat = sc.nextInt();
			int scn = sc.nextInt();
			int cum = sc.nextInt();
			
			Student student = new Student(num, name, kor, eng, mat, scn, cum);
			students[cnt] = student;
			cnt++;
		}
		
		studentRanked();
		sc.close();
	}
	
	public void studentDataPrint() {
		System.out.println("학생 명단");
		System.out.println("번호\t이름\t국어\t영어\t수학\t과학\t전산\t총점\t평균\t학점\t순위");
		for (Student student : students) {
			System.out.printf("%d	%s	%d	%d	%d	%d	%d	%d	%.2f	%s	%d\n", student.num, student.name, student.kor, student.eng, student.mat, student.scn, student.cum, student.tot, student.avg, student.pass, student.rank);
		}
	}
	
	public void studentDataPrintByNumber() {
		studentSortByNumber();
		System.out.println("번호순");
		System.out.println("번호\t이름\t국어\t영어\t수학\t과학\t전산\t총점\t평균\t학점\t순위");
		for (Student student : students) {
			System.out.printf("%d	%s	%d	%d	%d	%d	%d	%d	%.2f	%s	%d\n", student.num, student.name, student.kor, student.eng, student.mat, student.scn, student.cum, student.tot, student.avg, student.pass, student.rank);
		}
	}
	
	public void studentDataPrintByRank() {
		studentSortByRank();
		System.out.println("성적순");
		System.out.println("번호\t이름\t국어\t영어\t수학\t과학\t전산\t총점\t평균\t학점\t순위");
		for (Student student : students) {
			System.out.printf("%d	%s	%d	%d	%d	%d	%d	%d	%.2f	%s	%d\n", student.num, student.name, student.kor, student.eng, student.mat, student.scn, student.cum, student.tot, student.avg, student.pass, student.rank);
		}
	}
	
	private void studentRanked() {
		for (int i = 0; i < cnt; i++) {
			students[i].rank = 1;
			for (int j = 0; j < cnt; j++) {
				if (students[i].avg < students[j].avg) {
					students[i].rank++;
				}
			}
		}
	}
	
	private void studentSortByNumber() {
		for (int i = 0; i < cnt; i++) {
			for (int j = i + 1; j < cnt; j++) {
				if (students[i].num > students[j].num) {
					Student student = students[i];
					students[i] = students[j];
					students[j] = student;
				}
			}
		}
	}
	
	private void studentSortByRank() {
		for (int i = 0; i < cnt; i++) {
			for (int j = i + 1; j < cnt; j++) {
				if (students[i].rank > students[j].rank) {
					Student student = students[i];
					students[i] = students[j];
					students[j] = student;
				}
			}
		}
	}
}
