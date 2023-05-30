package com.jslhrd.employee;

public class EmployeeService {
	
	private EmployeeDao employeeDao = new EmployeeDao();

	public void employeeRegister(String[] employeeInfo, int cnt) {
		employeeDao.employeeRegister(employeeInfo, cnt);
	}

	public void employeePrint(int cnt) {
		employeeDao.employeePrint(cnt);
	}

}
