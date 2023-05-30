class CC {

	public int add(int m) {
		int cnt = 0;
		for (int i = 1; i < m; i++) {
			if (i % 3 == 0 && i % 2 != 0) {
				cnt++;
			}
		}
		return cnt;
	}

	public int sum(int ... m) {
		int s = 0;
		for (int i = 0; i < m.length; i++) {
			s += m[i];
		}
		return s;
	}

	public int max(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
}

public class Exam_06 {
	public static void main(String[] args) {
		CC c1 = new CC();
		
		int result = c1.add(50);
		System.out.println(" 1 ~ 50 3의 배수이면서 짝수가 아닌 수의 갯수 = " + result);
		
		result = c1.sum(1, 2, 3);
		System.out.println("1 + 2 + 3 = " + result);
		result = c1.sum(1, 2, 3, 4, 5);
		System.out.println("1 + 2 + 3 + 4 + 5 = " + result);
		result = c1.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println("1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = " + result);
		
		int[] arr = {5, 3, 9, 6, 8, 3, 7};
		int max = c1.max(arr);
		System.out.println("max = " + max);
	}
}
