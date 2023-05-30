package StudentPackage;

public class StudentExam {
	public static void main(String[] args) {
		StudentProcess studentPorcess = new StudentProcess();
		studentPorcess.studentRegister();
		studentPorcess.studentDataPrint();
		studentPorcess.studentDataPrintByNumber();
		studentPorcess.studentDataPrintByRank();
	}
}
