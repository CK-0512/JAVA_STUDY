import java.util.Scanner;

//검색 1.선형(순차)검색
public class Exam_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int var[] = {70, 60, 50, 80, 90, 40, 50, 65, 70, 55, 80, 40, 95, 30};
		System.out.print("검색 : ");
		int num = scn.nextInt();
		boolean flag = false;
		for (int i = 0; i < var.length; i++) {
			if(num==var[i]) {
				System.out.printf("%d은(는) %d번째에 있다.\n", num, i + 1);
				flag = true;
			}
		}
		
		if (!flag) {
			System.out.printf("없음.");
		}
		
	}

}
