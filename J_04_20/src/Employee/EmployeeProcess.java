package Employee;

import java.util.Scanner;

public class EmployeeProcess {
	
	int cnt = 0;
	Employee[] emp = new Employee[10];
	
	public void employeeRegister() {
		Scanner sc = new Scanner(System.in);
		while (cnt < 10) {
			System.out.print("사원등록 : ");
			String name = sc.next();
			if (name.equals("end") || name.equals("END"))
				break;
			int money = sc.nextInt();
			
			emp[cnt] = new Employee(name, money);
			employeeChangeMoney();
			cnt++;
		}
		sc.close();
	}
	
	private void employeeChangeMoney() {
		int i = 0;
		int won = 50000;
		int money = emp[cnt].money;
		boolean flag = true;
		while (money > 0) {
			if (flag) {
				emp[cnt].won[i] = money / won;
				money = money % won;
				won = won / 5;
				flag = false;
				i++;
			} else {
				emp[cnt].won[i] = money / won;
				money = money % won;
				won = won / 2;
				flag = true;
				i++;
			}
		}
	}
	
	public void employeeDataPrint() {
		System.out.println("성명\t출장비\t오만\t일만\t오천\t일천\t오백\t일백\t오십\t일십\t오\t일");
		
		int[] tot = new int[10];
		for (int i = 0; i < cnt; i++) {
			System.out.printf("%s\t%d\t", emp[i].name, emp[i].money);
			for (int j = 0; j < emp[i].won.length; j++) {
				System.out.printf("%d\t", emp[i].won[j]);
				tot[j] += emp[i].won[j];
			}
			System.out.println();
		}
		
		System.out.printf("전체화폐매수\t");
		for (int i = 0; i < tot.length; i++) {
			System.out.printf("%d\t", tot[i]);
		}
		
	}
}
