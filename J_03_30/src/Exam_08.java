import java.util.Scanner;

public class Exam_08 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int arr[] = new int[5];
		for(int i = 0; i< arr.length; i++) {
			System.out.print("데이터 입력 : ");
			arr[i] = scn.nextInt();
		}
		System.out.println("배열 데이터 출력");
		int sum = 0;
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr[i] + "\t");
			sum += arr[i];
		}
		System.out.println(" = " + sum);
	}

}
