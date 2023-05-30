class AA {
	//인스턴스 멤버 변수, 멤버필드
	int a;
	String name;
	//정적멤버변수, 클래스 멤버
	static int hbun;
	static String hname;
	
	int test() {//인스턴스 메소드
		a = 10;
		hbun = 20;
		return a;
	}
	static int method() {//클래스 메소드, 정적메소드
		hbun = 10;
		//bun = 20;
		return hbun;
	}
}


public class Exam_01 {
	public static void main(String[] args) {
		AA.hbun = 1000;
		AA.hname = "asda";
		AA.method();
	}
}
