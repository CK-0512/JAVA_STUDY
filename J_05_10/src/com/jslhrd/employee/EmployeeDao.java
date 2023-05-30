package com.jslhrd.employee;

public class EmployeeDao {
	
	private Employee[] employees = new Employee[10];
	
	public void employeeRegister(String[] employeeInfo, int cnt) {
		String year = employeeInfo[2].substring(0, 4) + "년";
		String month = employeeInfo[2].substring(4, 6) + "월";
		String day = employeeInfo[2].substring(6) + "일";
		String birth = year + month + day;
		
		String gender = null;
		if (employeeInfo[3].equals("M")) {
			gender = "남";
		} else if (employeeInfo[3].equals("F")) {
			gender = "여";
		}
		
		Employee employee = new Employee(employeeInfo[0], employeeInfo[1], birth, gender, employeeInfo[4]);
		
		employee.age = String.valueOf(2023 - Integer.parseInt(birth.substring(0, 4)) + 1);
		
		employees[cnt] = employee;
	}

	public void employeePrint(int cnt) {
		System.out.println("사원번호	이름	생년월일	나이	성별	급여");
		for (int i = 0; i < cnt; i++) {
			System.out.println(employees[i]);
		}
		
		System.out.printf("평균나이 : %s\n", calAgeAvg(cnt));
		System.out.printf("평균급여 : %s\n", avgSalay(cnt));
	}

	private String calAgeAvg(int cnt) {
		int ageSum = 0;
		
		for (int i = 0; i < cnt; i++) {
			ageSum += Integer.parseInt(employees[i].age);
		}
		
		String ageAvg = String.valueOf(ageSum / cnt);
		
		return ageAvg; 
	}

	private String avgSalay(int cnt) {
		int salaySum = 0;
		
		for (int i = 0; i < cnt; i++) {
			salaySum += Integer.parseInt(employees[i].salay);
		}
		
		String salayAvg = String.valueOf(salaySum / cnt);
		
		return salayAvg;
	}
}
