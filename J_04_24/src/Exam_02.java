class BB {
	static int money = 1000;
	int pay = 100;
}

public class Exam_02 {
	public static void main(String[] args) {
		BB b1 = new BB();
		BB b2 = new BB();
		System.out.println("b1.pay : " + b1.pay);
		System.out.println("b1.money : " + b1.money);
		

		System.out.println("b2.pay : " + b2.pay);
		System.out.println("b2.money : " + b2.money);
		
		b1.money = 5000;
		b1.pay = 500;
		
		System.out.println("b1.pay : " + b1.pay);
		System.out.println("b1.money : " + b1.money);
		

		System.out.println("b2.pay : " + b2.pay);
		System.out.println("b2.money : " + b2.money);
		
	}
}
