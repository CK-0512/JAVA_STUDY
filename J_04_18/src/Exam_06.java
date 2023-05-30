class Student2 {
	int num;
	String name;
	int kor, eng, mat;
	int sum;
	double avg;
	//생성자 : 클래스 이름과 동일한 메소드
	//객체 생성, 객체생성하면서 초기화할 때 이용
	Student2() {} //디폴트 생성자
	Student2(int num, String name, int kor, int eng, int mat) {
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;//this는 멤버의 변수
		sumAvg();
		stuPrint();
	}//메소드 오버로딩 : 메소드 이름은 동일하고 매개변수의 타입, 순서, 갯수가 다르면 가능
	
	void sumAvg() {
		sum = kor + eng + mat;
		avg = sum / 3.;
	}
	void stuPrint() {
		System.out.printf("%d	%s	%d	%d	%d	%d	%.2f\n", num, name, kor, eng, mat, sum, avg);
	}
}

public class Exam_06 {
	public static void main(String[] args) {
		System.out.println("학번	이름	국어	영어	수학	총점	평균");
		Student2 s1 = new Student2(22, "홍길동", 90, 88, 65);//생성자 호출
	}
}
