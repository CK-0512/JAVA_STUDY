package com.jslhrd.employee;

import java.util.Scanner;

public class EmployeeController {
	
	public static void run() {
		
		EmployeeService employeeService = new EmployeeService();
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		
		while (cnt < 10) {
			System.out.print("사원입력 : ");
			String cmd = sc.nextLine();
			if (cmd.startsWith("9999")) {
				break;
			}
			
			String[] employeeInfo = cmd.split(",");
			
			employeeService.employeeRegister(employeeInfo, cnt);
			cnt++;
		}
		
		employeeService.employeePrint(cnt);
		sc.close();
	}
	
}
