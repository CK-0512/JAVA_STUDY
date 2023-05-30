//switch  ~ case
public class Exam_08 {
	public static void main(String[] args) {
		int sw = 2;
		switch(sw) {//변수(정수, 문자, 문자열) 또는 수식(결과값이 정수)
			case 1 ://상수(정수, 문자, 문자열)
				System.out.println(1);
				break;
			case 2 :
				System.out.println(2);
				break;
			case 3 :
				System.out.println(3);
				break;
			default :
				System.out.println("Error");
		}
	}

}
