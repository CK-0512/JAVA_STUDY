
public class Student {
	int num;
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double avg;
	int rank = 1;
	Student maxStd = null;
	Student minStd = null;
	
	public Student() {};

	public Student(int num, String name, int kor, int eng, int mat) {
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		tot = kor + eng + mat;
		avg = tot / 3.;
	}
	
	public void getRank(Student std[], int cnt, int k) {
		for(int j = 0; j < cnt; j++) {
			if(std[k].avg < std[j].avg) {
				std[k].rank++;
			}
		}
	}
	
	public Student getMax(Student std[], int k) {
		if(std[k].rank == 1) {
			return std[k];
		}
		return null;
	}
	
	public Student getMin(Student std[], int cnt, int k) {
		if(std[k].rank == cnt) {
			return std[k];
		}
		return null;
	}

	public void print() {
		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n", num, name, kor, eng, mat, tot, avg, rank);
	}
	
}
