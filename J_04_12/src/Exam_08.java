import java.util.Arrays;

public class Exam_08 {
	//1
	static void deciaml(int a) {
		int cnt = 0;
		boolean flag = true;
		System.out.printf("1 ~ %d까지의 소수 : \n", a);
		for (int i = 2; i <= a; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				cnt++;
				System.out.printf("%3d", i);
				if (cnt % 5 == 0) {
					System.out.println();
				}
			}
			flag = true;
		}
		System.out.println("소수의 갯수 : " + cnt);
	}
	
	//2
	static void binary(int val) {
		int bin[] = new int[10];
		int i = 0;
		while (val != 0) {
			int na = val % 2;
			bin[i] = na;
			val = val / 2;
			i++;
		}
		System.out.print("2진수 : ");
		for (int j = i - 1; j >= 0; j--) {
			System.out.printf("%d", bin[j]);
		}
		System.out.println();
	}
	
	//2_1
	static String binaryStr(int val) {
		String bin = "";
		while (val != 0) {
			int na = val % 2;
			bin = na + bin;
			val = val / 2;
		}
		return bin;
	}
	
	//2_2
	static int[] binaryArr(int val) {
		int cal[] = new int[10];
		int i = 0;
		while (val != 0) {
			int na = val % 2;
			cal[i] = na;
			val = val / 2;
			i++;
		}
		int bin[] = new int[i];
		for (int j = 0; j < bin.length; j++) {
			bin[j] = cal[j];
		}
		return bin;
	}
	
	static int integerTotal(int val) {
		int sum = 0;
		for (int i = 1; i <= val; i++) {
			System.out.printf("%3d", i);
			if (i % 5 == 0) {
				System.out.println();
			}
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		//1. 2 ~ n 까지 소수를 출력하고, 소수 갯수 출력
		//한줄에 5개씩만 출력
		deciaml(50);
		System.out.println("----------------------------------------------------------");
		
		//2. 2진수 변환
		binary(37);
		System.out.println("----------------------------------------------------------");
		
		//2_1. 2진수 변환 반환
		String bin = binaryStr(37);
		System.out.println("2진수 : " + bin);
		System.out.println("----------------------------------------------------------");
		
		//2_2. 2진수 변환 반환
		int [] binArr = binaryArr(37);
		System.out.print("2진수 : ");
		for (int i = binArr.length - 1; i >= 0; i--) {
			System.out.print(binArr[i]);
		}
		System.out.println("\n----------------------------------------------------------");
		
		//3. 1 ~ n까지 정수를 출력(한 줄에 5개), 합을 구하여 반환
		int sum = integerTotal(100);
		System.out.println("1 ~ 100 : " + sum);

	}
}
