// 디폴트 생성자 : 매개변수가 없는 생성자(내용은 있어도 됨) 
// this : 자기 자신,	 this() : 자신의 생성자 호출, 첫줄에 한번만 사용 가능
class AA {
	int num;
	String name;
	int age;
	
	AA() {
		this(10);//AA(int num)호출
	}
	AA(int num) {
		this(num, "홍길동");//AA(int num, String name)호출
		this.num = num;
	}
	AA(int num, String name){//AA(int num, String name, int age)호출
		this(num, name, 30);
		this.num = num;
		this.name = name;
	}
	AA(int num, String name, int age) {
		this.num = num;
		this.name = name;
		this.age = age;
	}
}
public class Exam_01 {
	public static void main(String[] args) {
		AA a1 = new AA();
		System.out.println("번호 : " + a1.num + "이름 : " + a1.name + "나이 : " + a1.age);
	}
}
