
public class Student {
	int num;
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double avg;
	int rank;
	
	public Student() {}
	
	public Student(int num, String name, int kor, int eng, int mat) {
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.tot = kor + eng + mat;
		this.avg = tot / 3.;
	}
	public void studentPrint() {
		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",num, name, kor, eng, mat, tot, avg, rank);
	}
}
