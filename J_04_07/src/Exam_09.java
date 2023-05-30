import java.util.Scanner;

public class Exam_09 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int apt[][] = new int[11][8];
		while(true) {
			System.out.print("등록 :");
			int row = scn.nextInt();//동코드
			if(row==0)
				break;
			scn.next();//이름
			int age = scn.nextInt();//나이
			//나이에따른 분류
			int col = age/10;
			if(col>6)//나이가 60이상
				col=6;
			apt[row-1][col]++;
			apt[row-1][apt[0].length-1]++;//가로합
			apt[apt.length-1][col]++;//세로합
			apt[apt.length-1][apt[0].length-1]++;//전체합
		}
		//출력
		System.out.println("동\t0~9\t10~19\t20~29\t30~39\t"
				+ "40~49\t50~59\t60이상\t합계");
		for(int i=0; i<apt.length-1; i++) {
			System.out.print((i+1)+"\t");
			for(int j=0; j<apt[i].length;j++) {
				System.out.print(apt[i][j]+"\t");
			}
			System.out.print("\n");
		}
		System.out.print("합계\t");
		for(int i=0;i<apt[0].length; i++) {
			System.out.print(apt[apt.length-1][i]+"\t");
		}
	}

}
