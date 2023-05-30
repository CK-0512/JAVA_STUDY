//싱글톤 : 객체를 하나만 생성 가능하게
class DD {
	static final double pl = 3.14;
	int a;
	private DD() {
		
	}
	private static DD d = new DD();//자신이 자신의 객체를 생성
	
	static DD getInstance() {
		return d;
	}
}

public class Exam_04 {
	public static void main(String[] args) {
		//DD d1 = new DD();
		
		DD d1 = DD.getInstance();
		d1.a = 2000;
		//d1.pl = 3000;
		DD d2 = DD.getInstance();
		DD d3 = DD.getInstance();
		DD d4 = DD.getInstance();
		
		System.out.println(d1.a);
		System.out.println(d2.a);
		System.out.println(d3.a);
		System.out.println(d4.a);
	}
}
