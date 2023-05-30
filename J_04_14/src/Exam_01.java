import java.util.Scanner;

public class Exam_01 {
	//스캐너
	static Scanner sc = new Scanner(System.in);
	//소수 구하기
	static void Prime() {
		System.out.print("2 ~ n까지의 소수 : ");
		int var = sc.nextInt();
		int cnt = 0;
		int i, j;
		for (i = 2; i <= var; i++) {
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					break;
				}
			}
			if (i == j) {
				System.out.printf("%3d", i);
				cnt++;
				if (cnt % 7 == 0) {
					System.out.println();
				}
			}
		}
		System.out.printf("\n소수는 총 %d개 입니다.\n", cnt);
	}
	//진법변환하기
	static void Base() {
		System.out.print("10진수 입력 : ");
		int num = sc.nextInt();
		System.out.print("변환 진수(2, 8, 16, 0) : ");
		int ba = sc.nextInt();
		String bin = "";
		String oct = "";
		String hex = "";
		int var;
		switch (ba) {
			case 0 :
				System.out.println("모든 진법 변환 입니다.");
			case 2 :
				var = num;
				while (var != 0) {
					int na = var % 2;
					var = var / 2;
					bin = na + bin;
				}
				System.out.printf("10진수 %d는 2진수 %s 입니다.\n", num, bin);
				if (ba != 0) {
					break;
				}
			case 8 :
				var = num;
				while (var != 0) {
					int na = var % 8;
					var = var / 8;
					oct = na + oct;
					
				}
				System.out.printf("10진수 %d는 8진수 %s 입니다.\n", num, oct);
				if (ba != 0) {
					break;
				}
			case 16 :
				var = num;
				while (var != 0) {
					int na = var % 16;
					var = var / 16;
					switch (na) {
						case 10 :
							hex = "A" + hex;
							break;
						case 11 :
							hex = "B" + hex;
							break;
						case 12 :
							hex = "C" + hex;
							break;
						case 13 :
							hex = "D" + hex;
							break;
						case 14 :
							hex = "E" + hex;
							break;
						case 15 :
							hex = "F" + hex;
							break;
						default :
							hex = na + hex;
					}
					
				}
				System.out.printf("10진수 %d는 16진수 %s 입니다.\n", num, hex);
				if (ba != 0) {
					break;
				}
		}
	}
	//배열 정렬
	static void Sort(int arr[][]) {
		System.out.print("정렬방식 선택(1.선택정렬/2.버블정렬) ?");
		int num = sc.nextInt();
		System.out.print("오름차순 1/내림차순 2 ?");
		int var = sc.nextInt();
		if (num == 1) {
			System.out.println("선택정렬");
			if (var == 1) {
				System.out.println("오름차순");
				for (int i = 0; i < arr.length; i++) {
					for (int j = i + 1; j < arr.length; j++) {
						if (arr[i][0] > arr[j][0]) {
							for (int k = 0; k < arr[i].length; k++) {
								int sort = arr[i][k];
								arr[i][k] = arr[j][k];
								arr[j][k] = sort;
							}
						}
					}
				}
				System.out.println("학번\t국어\t영어\t수학");
				for (int m = 0; m < arr.length; m++) {
					for (int n = 0; n < arr[m].length; n++) {
						System.out.printf("%d\t", arr[m][n]);
					}
					System.out.println();
				}
			} else if (var == 2) {
				System.out.println("내림차순");
				for (int i = 0; i < arr.length; i++) {
					for (int j = i + 1; j < arr.length; j++) {
						if (arr[i][0] < arr[j][0]) {
							for (int k = 0; k < arr[i].length; k++) {
								int sort = arr[i][k];
								arr[i][k] = arr[j][k];
								arr[j][k] = sort;
							}
						}
					}
				}
				System.out.println("학번\t국어\t영어\t수학");
				for (int m = 0; m < arr.length; m++) {
					for (int n = 0; n < arr[m].length; n++) {
						System.out.printf("%d\t", arr[m][n]);
					}
					System.out.println();
				}
			} else {
				System.out.println("올바른 차순을 선택해 주십시오.");
				Sort(arr);
				return;
			}
		} else if (num == 2) {
			System.out.println("버블정렬");
			if (var == 1) {
				System.out.println("오름차순");
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr.length - i - 1; j++) {
						if (arr[j][0] > arr[j + 1][0]) {
							for (int k = 0; k < arr[i].length; k++) {
								int sort = arr[j][k];
								arr[j][k] = arr[j + 1][k];
								arr[j + 1][k] = sort;
							}
						}
					}
				}
				System.out.println("학번\t국어\t영어\t수학");
				for (int m = 0; m < arr.length; m++) {
					for (int n = 0; n < arr[m].length; n++) {
						System.out.printf("%d\t", arr[m][n]);
					}
					System.out.println();
				}
			} else if (var == 2) {
				System.out.println("내림차순");
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr.length - i - 1; j++) {
						if (arr[j][0] < arr[j + 1][0]) {
							for (int k = 0; k < arr[i].length; k++) {
								int sort = arr[j][k];
								arr[j][k] = arr[j + 1][k];
								arr[j + 1][k] = sort;
							}
						}
					}
				}
				System.out.println("학번\t국어\t영어\t수학");
				for (int m = 0; m < arr.length; m++) {
					for (int n = 0; n < arr[m].length; n++) {
						System.out.printf("%d\t", arr[m][n]);
					}
					System.out.println();
				}
			} else {
				System.out.println("올바른 차순을 선택해 주십시오.");
				Sort(arr);
				return;
			}
		} else {
			System.out.println("올바른 정렬을 선택해 주십시오.");
			Sort(arr);
			return;
		}
	}
	
	static void Search(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i][0] > arr[j][0]) {
					for (int k = 0; k < arr[i].length; k++) {
						int sort = arr[i][k];
						arr[i][k] = arr[j][k];
						arr[j][k] = sort;
					}
				}
			}
		}
		System.out.print("번호입력 : ");
		int num = sc.nextInt();
		int max = arr.length - 1;
		int min = 0;
		int mid = 0;
		int sum = 0;
		while (min <= max) {
				mid = (max + min) / 2;
			if (num < arr[mid][0]) {
				max = mid - 1;
			} else if (num > arr[mid][0]) {
				min = mid + 1;
			} else {
				System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
				for (int m = 0; m < arr[0].length; m++) {
					System.out.printf("%d\t", arr[mid][m]);
					sum += arr[mid][m];
				}
				sum -= arr[mid][0];
				System.out.printf("%d\t", sum);
				System.out.printf("%.2f\n", (int)(sum / 3. * 100 + 0.5) / 100.);
				break;
			}
		}
		if (num != arr[mid][0]) {
			System.out.println("등록된 학생이 없습니다.");
			Search(arr);
			return;
		}
	}
	
	
	public static void main(String[] args) {
		int arr[][] = {{1101, 90, 70, 85}, {1105, 88, 80, 88}, {1108, 79, 90, 79}, {1102, 90, 75, 95}, {1104, 80, 65, 70}, {1107, 88, 88, 60}, {1103, 95, 85, 85}};
		
		while(true) {
			System.out.println("[1] 소수 구하기");
			System.out.println("[2] 진법변환하기");
			System.out.println("[3] 배열 정렬");
			System.out.println("[4] 2진 검색하기");
			System.out.println("[5] 프로그램 종료");
			System.out.print("메뉴를 선택하세요 ?");
			int num = sc.nextInt();
			switch (num) {
				case 1 : 
					Prime();
					break;
				case 2 :
					Base();
					break;
				case 3 :
					Sort(arr);
					break;
				case 4 :
					Search(arr);
					break;
				case 5 :
					System.out.print("종료");
					System.exit(1);
				default :
					System.out.println("[1] ~ [5]중에 선택해 주십시오.");
					continue;
			}
		}
	}
}
