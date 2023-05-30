
public class Employee {
	String id;
	int grade;
	int hMoney;
	int time;
	int money;
	
	Employee (String id, int grade, int time) {
		this.id = id;
		this.grade = grade;
		switch (grade) {
			case 1 : 
				this.hMoney = 10000;
				break;
			case 2 : 
				this.hMoney = 5000;
				break;
			case 3 : 
				this.hMoney = 2000;
				break;
		}
		this.time = time;
	}
}