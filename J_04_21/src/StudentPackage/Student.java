package StudentPackage;

public class Student {
	int num;
	String name;
	int kor;
	int eng;
	int mat;
	int scn;
	int cum;
	int tot;
	double avg;
	String pass;
	int rank;
	
	Student (int num, String name, int kor, int eng, int mat, int scn, int cum) {
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.scn = scn;
		this.cum = cum;
		this.tot = kor + eng + mat + scn + cum;
		this.avg = tot / 5.;
		if (avg >= 90) {
			this.pass = "A";
		} else if (avg >= 80) {
			this.pass = "B";
		} else if (avg >= 70) {
			this.pass = "C";
		} else if (avg >= 60) {
			this.pass = "D";
		} else {
			this.pass = "F";
		}
	}
}
