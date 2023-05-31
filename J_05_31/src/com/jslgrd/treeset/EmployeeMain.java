package com.jslgrd.treeset;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class EmployeeMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<Employee> eSet = new TreeSet<>();
		Employee employee = null;
		
		while(true) {
			System.out.print("입력 : ");
			String reg = sc.nextLine();
			String[] regBits = reg.split(",");
			if(regBits[0].equals("0000"))
				break;
			if(!Pattern.matches("\\d{4}", regBits[0])) {
				System.out.println("사원번호 입력오류");
				continue;
			}
			
			int employeeNum = Integer.parseInt(regBits[0]);
			String name = regBits[1];
			String gender = regBits[2];
			String birth = regBits[3];
			
			employee = new Employee(employeeNum, name, gender, birth);
			if(!eSet.add(employee)) {
				System.out.println("이미등록된 사원입니다.");
				continue;
			}
		}
		
		System.out.println("사번	이름	성별	생년월일	나이");
		for(Employee e : eSet) {
			System.out.println(e);
		}
	}
}
