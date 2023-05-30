class AA {
	int a;
	double b;
	boolean bool;
	char ch;
	String str;//인스턴스 변수(객체 생성시만 사용가능)
	void print() {//인스턴스 메소드
		System.out.printf("a = %d\n", a);
		System.out.printf("b = %d\n", b);
	}
	static int c;//클래스 변수(method 영역에 생성)
	static void print2() {//클래스 메소드
		System.out.printf("c = %d\n", c);
		//System.out.printf("a = %d\n", a);//인스턴스 변수라 사용 불가
	}
}

public class Exam_03 {
	public static void main(String[] args) {
		AA aa = new AA();//heap 영역에 new AA()생성, stack 영역에 aa생성
		
		System.out.println(aa);//참조값
		System.out.println("a = " + aa.a);
		System.out.println("b = " + aa.b);
		System.out.println("bool = " + aa.bool);
		System.out.println("ch = " + aa.ch);
		System.out.println("str = " + aa.str);
	}
}
