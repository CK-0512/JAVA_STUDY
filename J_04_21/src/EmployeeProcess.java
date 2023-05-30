import java.util.Scanner;

public class EmployeeProcess {
	
	private Employee[] employee = new Employee[10];
	private int cnt = 0;
	private int sum = 0;
	
	public void employeeRegister() {
		
		Scanner sc = new Scanner(System.in);
		while (cnt < 10) {
			System.out.print("사원정보 : ");
			String id = sc.next();
			if (id.equals("end")) {
				break;
			}
			int grade = sc.nextInt();
			if (grade != 1 && grade != 2 && grade != 3) {
				System.out.println("올바른 등급을 입력해 주십시오.");
				continue;
			}
			int time = sc.nextInt();		
			Employee employee = new Employee(id, grade, time);
			this.employee[cnt] = employee;
			cnt++;
		}
		
		employeeMoneyCount();
		sc.close();
	}
	
	private void employeeMoneyCount() {
		for (int i = 0; i < cnt; i++) {
			if (employee[i].time > 50) {
				employee[i].money = employee[i].hMoney * (int)(36 + 14 * 1.5);
			} else if (employee[i].time > 36 && employee[i].time <= 50) {
				employee[i].money = employee[i].hMoney * (int)(employee[i].time - 36 + (50 - employee[i].time) * 1.5) ;
			} else {
				employee[i].money = employee[i].hMoney * employee[i].time;
			}
			sum += employee[i].money;
		}
	}
	
	public void employeeDataPrint() {
		System.out.println("아이디\t등급\t시급\t근무시간\t주간급여");
		for (int i = 0; i < cnt; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t\t%d\n", employee[i].id, employee[i].grade, employee[i].hMoney, employee[i].time, employee[i].money);
		}
		System.out.printf("급여합계\t\t\t\t%d", sum);
	}
}
