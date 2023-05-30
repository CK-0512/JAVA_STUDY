import java.util.Scanner;

//검색 2.2진검색 --> 데이터는 반드시 정령되더 있어야 한다.
public class Exam_02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int var[] = {70, 60, 50, 80, 90, 40, 50, 65, 70, 55, 80, 40, 95, 30};
		System.out.print("검색 : ");
		int sch = scn.nextInt();
		int low = 0;
		int high = var.length;
		boolean flag = false;
		while (low <= high) {
			int m = (low + high) / 2;
			if(sch == var[m]) {
				System.out.printf("%d은(는) %d번째에 있다.\n", sch, m + 1);
				flag = true;
				break;
			} else if (sch > var[m]) {
				low = m + 1;
			} else {
				high = m - 1;
			}
		}
		
		if (!flag) {
			System.out.printf("없음.");
		}
	}

}
