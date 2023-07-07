package com.jslhrd.employee.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.jslhrd.employee.dto.EmpDTO;
import com.jslhrd.employee.service.EmpService;

public class EmpController {
	private EmpService empService;
	private Scanner sc;
	
	public EmpController(Scanner sc) {
		this.sc = sc;
		this.empService = new EmpService();
	}

	public void showList() {
		List<EmpDTO> list;
		list = empService.getEmployees();
		if(list.size() == 0) {
			System.out.println("사원정보가 존재하지 않습니다.");
			return;
		}
		System.out.println("\t\t*** 사원 전체 목록 ***");
		System.out.println("사원번호	이름	업무명	상사번호	입사일자	급여	커미션	부서명");
		for(EmpDTO dto : list) {
			System.out.print(dto.getEno() + "\t\t");
			System.out.print(dto.getEname() == null ? "\t" : dto.getEname() + "\t");
			System.out.print(dto.getJob() == null ? "\t" : dto.getJob() + "\t");
			System.out.print(dto.getManager() == 0 ? "\t\t" : dto.getManager() + "\t\t" );
			System.out.print(dto.getHiredate() == null ? "\t" : dto.getHiredate() + "\t");
			System.out.print(dto.getSalary() == 0 ? "\t" : dto.getSalary() + "\t");
			System.out.print(dto.getCommission() == 0 ? "\t" : dto.getCommission() + "\t");
			System.out.println(dto.getDname() == null ? "\t" : dto.getDname());
		}
		System.out.println("메인 메뉴로 이동합니다(Enter)? ");
		sc.nextLine();
		if (sc.nextLine() == "") {
			return;
		}
	}

	public void doRegister() {
		EmpDTO empDTO = new EmpDTO();
		while(true) {
			
			System.out.println("*** 신규 사원 정보 등록 ***");
			System.out.print("사원이름 : ");
			String ename = sc.next();
			System.out.print("업무명 : ");
			String job = sc.next();
			System.out.print("상사번호 : ");
			int manager = sc.nextInt();
			System.out.print("입사일자(" + LocalDate.now() + ") :");
			sc.nextLine();
			String hiredate = sc.nextLine();
			if(!hiredate.matches("^\\d{4}-\\d{2}-\\d{2}")) {
				hiredate = String.valueOf(LocalDate.now());
			}
			System.out.print("급	여 : ");
			int salary = sc.nextInt();
			System.out.print("커 미 션 : ");
			int commission = sc.nextInt();
			System.out.println("부서정보(10 : 행정, 20 : 인사, 30 : 총무, 40 : 전략)");
			System.out.print("부서번호 : ");
			int dno = sc.nextInt();
			System.out.print("등록하시겠습니까(y/n)?");
			String cmd = sc.next();
			if (cmd.equalsIgnoreCase("y")) {
				empDTO.setEno(empService.getLastEno() == 0 ? 1000 : empService.getLastEno() + 1);
				empDTO.setEname(ename);
				empDTO.setJob(job);
				empDTO.setManager(manager);
				empDTO.setHiredate(hiredate);
				empDTO.setSalary(salary);
				empDTO.setCommission(commission);
				empDTO.setDno(dno);
				empService.doRegister(empDTO);
				System.out.printf("%d번 사원등록이 완료되었습니다.\n", empDTO.getEno());
				return;
			} else {
				continue;
			}
		}
	}

	public void doSearch() {
		while(true) {
			System.out.println("*** 사원 정보 검색 ***");
			System.out.print("검색할 사원번호를 입력하세요 ? ");
			int eno = sc.nextInt();
			EmpDTO searchedEmp = empService.doSearch(eno);
			
			if(searchedEmp != null) {
				System.out.printf("사원번호 : %d\t\t 사원이름 : %s\n", searchedEmp.getEno(), searchedEmp.getEname());
				System.out.printf("업 무 명 : %s\t\t 상사이름 : %s\n", searchedEmp.getJob(), searchedEmp.getManagerName());
				System.out.printf("입사일자 : %s\t 급	여 : %d\n", searchedEmp.getHiredate(), searchedEmp.getSalary());
				System.out.printf("커 미 션 : %d\t\t 부 서 명 : %s\n", searchedEmp.getCommission(), searchedEmp.getDname());
			} else {
				System.out.println("등록된 사원이 없습니다.");
			}
			
			System.out.println("검색을 계속할까요(y/n) ?");
			String confirm = sc.next();
			if (confirm.equalsIgnoreCase("y")) {
				continue;
			} else {
				return;
			}
		}
	}

	public void doModify() {
		EmpDTO searchedEmp;
		String ename;
		String job;
		int manager;
		String hiredate;
		int salary;
		int commission;
		int dno;
		String cmd;
		while(true) {
			System.out.println("*** 사원 정보 수정 ***");
			System.out.print("수정할 사원번호를 입력하세요 ? ");
			int eno = sc.nextInt();
			searchedEmp = empService.doSearch(eno);
			if(searchedEmp != null) {
				System.out.println("사원번호 : " + eno);
				System.out.printf("사원이름(%s) : ", searchedEmp.getEname());
				sc.nextLine();
				cmd = sc.nextLine();
				if(cmd == "") {
					ename = searchedEmp.getEname();
				} else {
					ename = cmd;
				}
				System.out.printf("업무명(%s) : ", searchedEmp.getJob());
				cmd = sc.nextLine();
				if(cmd == "") {
					job = searchedEmp.getJob();
				} else {
					job = cmd;
				}
				System.out.printf("상사번호(%d) : ", searchedEmp.getManager());
				cmd = sc.nextLine();
				if(cmd == "") {
					manager = searchedEmp.getManager();
				} else {
					manager = Integer.valueOf(cmd);
				}
				System.out.printf("입사일자(%s) : ", searchedEmp.getHiredate());
				cmd = sc.nextLine();
				if(cmd == "") {
					hiredate = searchedEmp.getHiredate().substring(0, 10);
				} else {
					hiredate = cmd;
				}
				System.out.printf("급	여(%d) : ", searchedEmp.getSalary());
				cmd = sc.nextLine();
				if(cmd == "") {
					salary  = searchedEmp.getSalary();
				} else {
					salary = Integer.valueOf(cmd);
				}
				System.out.printf("커 미 션(%d) : ", searchedEmp.getCommission());
				cmd = sc.nextLine();
				if(cmd == "") {
					commission = searchedEmp.getCommission();
				} else {
					commission = Integer.valueOf(cmd);
				}
				System.out.println("부서정보(10 : 행정, 20 : 인사, 30 : 총무, 40 : 전략)");
				System.out.printf("부서번호(%d) : ", searchedEmp.getDno());
				cmd = sc.nextLine();
				if(cmd == "") {
					dno = searchedEmp.getDno();
				} else {
					dno = Integer.valueOf(cmd);
				}
				System.out.print("수정하시겠습니까(y/n)?");
				String confirm = sc.next();
				if (confirm.equalsIgnoreCase("y")) {
					searchedEmp.setEname(ename);
					searchedEmp.setJob(job);
					searchedEmp.setManager(manager);
					searchedEmp.setHiredate(hiredate);
					searchedEmp.setSalary(salary);
					searchedEmp.setCommission(commission);
					searchedEmp.setDno(dno);
					empService.doModify(searchedEmp);
					System.out.printf("%d번 사원수정이 완료되었습니다.\n", searchedEmp.getEno());
					return;
				} else {
					return;
				}
			} else {
				System.out.println("존재하지 않는 사원입니다.");
				continue;
			}
		}
	}

	public void doDelete() {
		System.out.println("*** 사원 정보 검색 ***");
		System.out.print("검색할 사원정보를 입력하세요 ? ");
		int eno = sc.nextInt();
		EmpDTO searchedEmp = empService.doSearch(eno);
		
		if(searchedEmp != null) {
			System.out.printf("사원번호 : %d\t\t 사원이름 : %s\n", searchedEmp.getEno(), searchedEmp.getEname());
			System.out.printf("업 무 명 : %s\t\t 상사이름 : %s\n", searchedEmp.getJob(), searchedEmp.getManagerName());
			System.out.printf("입사일자 : %s\t 급	여 : %d\n", searchedEmp.getHiredate(), searchedEmp.getSalary());
			System.out.printf("커 미 션 : %d\t\t 부 서 명 : %s\n", searchedEmp.getCommission(), searchedEmp.getDname());
		} else {
			System.out.println("등록된 사원이 없습니다.");
		}
		
		System.out.println("삭제할까요(y/n) ?");
		String confirm = sc.next();
		if (confirm.equalsIgnoreCase("y")) {
			empService.doDelete(searchedEmp.getEno());
			System.out.println("사원정보가 삭제되었습니다.");
			return;
		} else {
			return;
		}
	}

}
