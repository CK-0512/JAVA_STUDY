import java.util.Scanner;

public class Exam_07 {
	//등록
	static int reg(int std[][], int cnt) {
		Scanner scn = new Scanner(System.in);
		System.out.println("[1]학생정보입력");
		System.out.println("<학생정보입력>");
		
		System.out.print("학번  : ");
		std[cnt][0] = scn.nextInt();
		for (int i = 0; i < cnt; i++) {
			if (std[cnt][0] == std[i][0]) {
				System.out.println("이미 등록된 학생입니다.");
				reg(std, cnt);
				return cnt;
			} 
		}
		
		System.out.print("국어 : ");
		std[cnt][1] = scn.nextInt();
		
		System.out.print("영어 : ");
		std[cnt][2] = scn.nextInt();
		
		System.out.print("수학  : ");
		std[cnt][3] = scn.nextInt();
		
		for(int i = 1; i <= 3; i++) {
			std[cnt][4] += std[cnt][i];
		}
		
		std[cnt][5] = std[cnt][4] / 3;
		
		System.out.println("등록할까요?(y/n) : ");
		String yn = scn.next();
		if (yn.equals("y")) {
			System.out.printf("학번%d 학생정보가 등록되었습니다.\n", std[cnt][0]);	
			cnt++;
			rank(std, cnt);
			
		} else if (yn.equals("n")) {
			System.out.printf("학번%d 학생정보가 등록취소되었습니다.\n", std[cnt][0]);
		} else {
			System.out.println("입력 오류입니다.");
		}
		return cnt;
	}
	//순위계산
	static void rank(int std[][], int cnt) {
		for (int i = 0; i < cnt; i++) {
			std[i][6] = 1;
			for (int j = 0; j < cnt; j++) {
				if (std[i][4] < std[j][4]) {
					std[i][6]++;
				}
			}
		}
	}
	//조회
	static void check(int std[][], int cnt) {
		System.out.println("[2]학생정보조회");
		Scanner scn = new Scanner(System.in);
		System.out.print("학번입력 : ");
		int num = scn.nextInt();
		for (int i = 0; i < cnt; i++) {
			if (num == std[i][0]) {
				System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t순위");
				System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\t%d\n", std[i][0], std[i][1], std[i][2], std[i][3], std[i][4], std[i][5], std[i][6]);
			} 
		}
	}
	//번호순 출력
	static void number(int std[][], int cnt) {
		System.out.println("[3]학생정보출력(번호순)");
		for (int i = 0; i < cnt - 1; i++) {
			for (int j = i + 1; j < cnt; j++) {
				if (std[i][0] > std[j][0]) {
					for (int m = 0; m < std[i].length; m++) {
						int sort = std[i][m];
						std[i][m] = std[j][m];
						std[j][m] = sort;
					}
				}
			}
		}
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t순위");
		for (int k = 0; k < cnt; k++) {
			for (int l = 0; l < std[k].length; l++) {
				System.out.printf("%d\t", std[k][l]);
			}
			System.out.println();
		}
	}
	//성적순 출력
	static void ranking(int std[][], int cnt) {
		System.out.println("[4]학생정보출력(성적순)");
		for (int i = 0; i < cnt - 1; i++) {
			for (int j = i + 1; j < cnt; j++) {
				if (std[i][6] > std[j][6]) {
					for (int m = 0; m < std[i].length; m++) {
						int sort = std[i][m];
						std[i][m] = std[j][m];
						std[j][m] = sort;
					}
				}
			}
		}
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t순위");
		for (int k = 0; k < cnt; k++) {
			for (int l = 0; l < std[k].length; l++) {
				System.out.printf("%d\t", std[k][l]);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int std[][] = new int[10][7];
		int cnt = 0;
		Scanner scn = new Scanner(System.in);
		while (cnt <= 10) {
			System.out.println("<학생정보관리프로그램>");
			System.out.println("1. 학생정보등록");
			System.out.println("2. 학생정보조회");
			System.out.println("3. 학생정보출력(번호순)");
			System.out.println("4. 학생정보출력(성적순)");
			System.out.println("5. 프로그램종료");
			System.out.print("메뉴를 선택하세요 : ");
			int sw = scn.nextInt();
			switch (sw) {
				case 1 : 
					cnt = reg(std, cnt);
					break;
				case 2 : 
					check(std, cnt);
					break;
				case 3 : 
					number(std, cnt);
					break;
				case 4 : 
					ranking(std, cnt);
					break;
				case 5 : 
					System.out.println("종료");
					System.exit(1);
					break;
				default : 
					System.out.println("작업메뉴는 1 ~ 5 사용가능");
			}
		}
	}
}
