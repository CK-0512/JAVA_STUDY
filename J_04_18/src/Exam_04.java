class Person {
	String nation = "한국";
	String name;
	int age;
	boolean gender;
	void print() {
		String str = "여자";
		if(gender) {
			str = "남자";
		}
		System.out.printf("국적 : %s, 이름 : %s, 나이 : %d, 성별 : %s\n", nation, name, age, str);
	}
}

public class Exam_04 {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "홍길동";
		p1.age = 30;
		p1.gender = true;
		p1.print();
		
		p1 = new Person();//가비지 컬렉션(key없는 앞의 p1을 자바가 알아서 삭제(메모리정리))
		p1.name = "홍길순";
		p1.age = 25;
		p1.gender = false;
		p1.print();
	}
}
