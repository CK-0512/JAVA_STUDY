public class Std {
	int num;
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double avg;
	String pass;
	
	public Std() {}
	
	public Std(int num, String name, int kor, int eng, int mat) {
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		tot = kor + eng + mat;
		avg = tot / 3.;
		passAccount();
	}
	
	void passAccount() {
		pass = "F";
		if(avg >= 90) {
			pass = "A";
		} else if(avg >= 80) {
			pass = "B";
		} else if(avg >= 70) {
			pass = "C";
		} else if(avg >= 60) {
			pass = "D";
		}
	}
	
	void print() {
		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%s\n", num, name, kor, eng, mat, tot, avg, pass);
	}
}