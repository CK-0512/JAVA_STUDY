class Student1 {
	int num;
	String name;
	int kor, eng, mat;
	int sum;
	double avg;
	
	void sumAvg() {
		sum = kor + eng + mat;
		avg = sum / 3.;
	}
	void stuPrint() {
		sumAvg();
		System.out.printf("%d	%s	%d	%d	%d	%d	%.2f\n", num, name, kor, eng, mat, sum, avg);
	}
}

public class Exam_05 {
	public static void main(String[] args) {
		System.out.println("학번	이름	국어	영어	수학	총점	평균");
		Student1 s1 = new Student1();
		s1.num = 32;
		s1.name = "홍길동";
		s1.kor = 26;
		s1.eng = 65;
		s1.mat = 87;
		s1.stuPrint();
		
		Student1 s2 = new Student1();
		s2.num = 22;
		s2.name = "홍길순";
		s2.kor = 36;
		s2.eng = 85;
		s2.mat = 42;
		s2.stuPrint();
	}
}
