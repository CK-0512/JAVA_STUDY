//메소드(함수) : 특정기능을 수행하는 명령문의 집합
/* 형식 : 
 * 반환타입 메소드 이름(매개변수 리스트) {//void
 * 		명령문 기술
 * }
 * 반환타입 : 기본자료형(8가지), 배열, 클래스
 * 매개변수 : 기본자료형(8가지), 배열, 클래스
 * 
 */
public class Exam_01 {//실행클래스
	//메소드 위치
	//1
	static void aa() {
		System.out.println("aa() 호출");
	}
	//1 ~ 10까지 합계 출력
	static void add() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.printf("1 ~ 10 합 : %d\n", sum);
	}
	public static void main(String[] args) {
		aa();//메소드 호출
		add();
	}
	
	//메소드 위치
}
