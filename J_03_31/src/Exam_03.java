
public class Exam_03 {
	public static void main(String[] args) {
		String name[] = {"홍길동", "임꺽정", "장길산", "홍길순", "임꺽순"};
		for(int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		System.out.println("---------------------------------");
		for (String str : name) {
			System.out.println(str);
		}
	}

}
