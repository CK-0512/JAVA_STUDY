import java.util.Scanner;

//키보드로 번호 이름 국어 영어 수학 점수일람
//총점 평균을 구하여 출력
public class Exam_03 {
	public static void main(String[] args) {
		int num, kor, eng, mat, tot;
		String name;
		double avg;
		
		Scanner scn = new Scanner(System.in);
		System.out.print("번호 : ");
		num = scn.nextInt();
		System.out.print("이름 : ");
		name = scn.next();
		System.out.print("국어 : ");
		kor = scn.nextInt();
		System.out.print("영어 : ");
		eng = scn.nextInt();
		System.out.print("수학 : ");
		mat = scn.nextInt();
		
		tot = kor + eng + mat;
		avg = tot / 3;
		//avg = (int)(tot / 3 * 100 + 0.5)/100.;//소숫점 셋째자리에서 반올림
		
		System.out.print("번호\t이름\t총점\t평균\n");
		System.out.print(num + "\t" + name + "\t");
		System.out.print(tot + "\t" + avg + "\t");
		System.out.printf("평균 : %.2f", avg);
		}

}
