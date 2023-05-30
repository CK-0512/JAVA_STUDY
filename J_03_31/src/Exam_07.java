
public class Exam_07 {
	public static void main(String[] args) {
		int val[] = {34, 45, 65, 75, 53, 32, 12, 75};
		int sum = 0;
		double avg = 0;
		int m = val[0];
		
		System.out.printf("Data :");
		for (int i : val) {
			System.out.printf("%3d", i);
			sum += i;
		}
		
		avg = (int)(sum / (double)val.length * 100 + 0.5) / 100.;
		
		double num1 = (avg < m) ? m-avg : avg-m;
		
		for (int j = 1; j < val.length; j++) {
			double num2 = (avg < val[j]) ? val[j] - avg : avg - val[j];
			if (num1 > num2) {
				num1 = num2;
				m = val[j];
			}
		}
		System.out.println();
		System.out.printf("평균 : %3.2f\n", avg);
		System.out.printf("평균에 가장 가까운 점수 : %3d", m);
	}

}
