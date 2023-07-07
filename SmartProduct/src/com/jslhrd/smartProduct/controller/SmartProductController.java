package com.jslhrd.smartProduct.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.jslhrd.smartProduct.dto.ProcessDTO;
import com.jslhrd.smartProduct.dto.ProductDTO;
import com.jslhrd.smartProduct.dto.WorkListDTO;
import com.jslhrd.smartProduct.service.SmartProductService;

public class SmartProductController {
	private SmartProductService smartProductService;
	private Scanner sc;

	public SmartProductController(Scanner sc) {
		this.sc = sc;
		this.smartProductService = SmartProductService.getInstance();
	}

	public void productRegister() {
		System.out.println("제품 등록 화면");

		while (true) {
			System.out.print("제품코드 : ");
			String p_code = sc.next();
			String alreadyExistsCode = smartProductService.productCodeSearch(p_code);
			if (alreadyExistsCode != null) {
				System.out.println("이미 등록된 제품코드입니다.");
				continue;
			}

			System.out.print("제품명 : ");
			String p_name = sc.next();
			System.out.print("제품규격 : ");
			String p_size = sc.next();
			System.out.print("제품구분 : ");
			String p_type = sc.next();
			System.out.print("제품단가 : ");
			int p_price = sc.nextInt();
			
			ProductDTO product = new ProductDTO();
			product.setP_code(p_code);
			product.setP_name(p_name);
			product.setP_size(p_size);
			product.setP_type(p_type);
			product.setP_price(p_price);
			
			int row = smartProductService.productRegiseter(product);
			if (row != 0) {
				System.out.println("등록성공");
			} else {
				System.out.println("등록실패");
			}

			System.out.print("제품등록을 계속합니까(Y/N)? ");
			String confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				continue;
			} else {
				showProduct();
			}
			break;
		}
	}

	private void showProduct() {
		List<ProductDTO> products = smartProductService.getProducts();
		System.out.println("제품조회");
		System.out.print("제품코드	제품명	제품규격	제품구분	제품단가\n");
		for (ProductDTO product : products) {
			System.out.printf("%s	%s	%s	", product.getP_code(), product.getP_name(), product.getP_size());
			System.out.printf("%s	%s\n", product.getP_type(), product.getP_price());
		}
	}

	public void workListRegister() {
		System.out.println("작업지시 등록 화면");
		String w_workNo = String.valueOf(smartProductService.getLastW_workNo() + 1);
		if (w_workNo.equals("1")) {
			w_workNo = "20190001";
		}
		System.out.printf("작업지시번호 : %s\n", w_workNo);
		
		while (true) {
			System.out.print("제품코드 : ");
			String p_code = sc.next();
			String isExistsCode = smartProductService.productCodeSearch(p_code);
			if (isExistsCode == null) {
				System.out.println("등록된 제품코드가 없습니다.");
				continue;
			}
			System.out.print("수량 : ");
			sc.nextLine();
			String w_quentity = sc.nextLine();
			if (!w_quentity.matches("\\d{1,3}") || w_quentity.equals("0")) {
				System.out.println("입력오류");
				continue;
			}
			System.out.print("작업시작일 : ");
			String w_workdate = sc.next();
			if (!w_workdate.matches("^(19|20)\\d{2}(0[1-9]|1[012])([012][1-9]|3[01])|^(19|20)\\d{2}-(0[1-9]|1[012])-([012][1-9]|3[01])")) {
				System.out.println("입력오류");
				continue;
			}
			if (w_workdate.length() != 8) {
				w_workdate = w_workdate.substring(0, 4) + w_workdate.substring(5, 7) + w_workdate.substring(8, 10);
			}
			
			WorkListDTO workList = new WorkListDTO();
			workList.setW_workNo(w_workNo);
			workList.setP_code(p_code);
			workList.setW_quentity(Integer.valueOf(w_quentity));
			workList.setW_workdate(w_workdate);
			
			int row = smartProductService.workListRegister(workList);
			if (row != 0) {
				System.out.println("등록성공");
			} else {
				System.out.println("등록실패");
			}

			System.out.print("작업지시등록을 계속합니까(Y/N)? ");
			String confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				continue;
			} else {
				showWorkList();
			}
			break;
		}
	}

	private void showWorkList() {
		List<WorkListDTO> workLists = smartProductService.getWorkLists();
		System.out.println("작업지시조회");
		System.out.println("작업지시번호	제품코드	제품명	제품규격	제품구분	수량	작업시작일");
		for (WorkListDTO workList : workLists) {
			String w_workNo = workList.getW_workNo().substring(0, 4) + "-" + workList.getW_workNo().substring(4);
			LocalDate w_workDate = LocalDate.parse(workList.getW_workdate(), DateTimeFormatter.BASIC_ISO_DATE);
			
			System.out.printf("%s	%s	%s	", w_workNo, workList.getP_code(), workList.getP_name());
			System.out.printf("%s	%s	", workList.getP_size(), workList.getP_type());
			System.out.printf("%d	%s\n", workList.getW_quentity(), w_workDate);
		}
	}

	public void processRegister() {
		System.out.println("작업공정 등록 화면");
		
		while (true) {
			System.out.print("작업지시번호 : ");
			String w_workNo = sc.next();
			String isW_workNoExists = smartProductService.workListWorkNoSearch(w_workNo);
			if (isW_workNoExists == null) {
				System.out.println("등록된 작업지시번호가 존재하지 않습니다.");
				continue;
			}
			
			System.out.print("재료준비(Y/N) : ");
			String p_p1 = sc.next();
			if (!p_p1.matches("[YyNn]")) {
				System.out.println("입력오류");
				continue;
			}
			p_p1 = p_p1.toUpperCase();
			
			System.out.print("인쇄공정(Y/N) : ");
			String p_p2 = sc.next();
			if (!p_p2.matches("[YyNn]")) {
				System.out.println("입력오류");
				continue;
			}
			p_p2 = p_p2.toUpperCase();
			
			System.out.print("코팅공정(Y/N) : ");
			String p_p3 = sc.next();
			if (!p_p3.matches("[YyNn]")) {
				System.out.println("입력오류");
				continue;
			}
			p_p3 = p_p3.toUpperCase();
			
			System.out.print("합지공정(Y/N) : ");
			String p_p4 = sc.next();
			if (!p_p4.matches("[YyNn]")) {
				System.out.println("입력오류");
				continue;
			}
			p_p4 = p_p4.toUpperCase();
			
			System.out.print("접합공정(Y/N) : ");
			String p_p5 = sc.next();
			if (!p_p5.matches("[YyNn]")) {
				System.out.println("입력오류");
				continue;
			}
			p_p5 = p_p5.toUpperCase();
			
			System.out.print("포장적재(Y/N) : ");
			String p_p6 = sc.next();
			if (!p_p6.matches("[YyNn]")) {
				System.out.println("입력오류");
				continue;
			}
			p_p6 = p_p6.toUpperCase();
			
			System.out.print("최종작업일자 : ");
			String w_lastdate = sc.next();
			if (!w_lastdate.matches("(19|20)\\d{2}(0[1-9]|1[012])([012][1-9]|3[01]|(19|20)\\d{2}-(0[1-9]|1[012])-([012][1-9]|3[01]")) {
				System.out.println("입력오류");
				continue;
			}
			if (w_lastdate.length() != 8) {
				w_lastdate = w_lastdate.substring(0, 4) + w_lastdate.substring(5, 7) + w_lastdate.substring(8, 10);
			}
			
			System.out.print("최종작업시간 : ");
			String w_lasttime = sc.next();
			if (!w_lasttime.matches("^\\d{4}")) {
				System.out.println("입력오류");
				continue;
			}
			
			ProcessDTO process = new ProcessDTO();
			process.setW_workNo(w_workNo);
			process.setP_p1(p_p1);
			process.setP_p2(p_p2);
			process.setP_p3(p_p3);
			process.setP_p4(p_p4);
			process.setP_p5(p_p5);
			process.setP_p6(p_p6);
			process.setW_lastDate(w_lastdate);
			process.setW_lastTime(w_lasttime);
			
			int row = smartProductService.processRegister(process);
			if (row != 0) {
				System.out.println("등록성공");
			} else {
				System.out.println("등록실패");
			}

			System.out.print("작업지시등록을 계속합니까(Y/N)? ");
			String confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				continue;
			} else {
				showProcess();
			}
			break;
		}
	}

	private void showProcess() {
		List<ProcessDTO> processes = smartProductService.getProcesses();
		System.out.println("작업공정조회");
		System.out.println("작업지시번호	준비	인쇄	코팅	합지	접합	포장	최종공정일자	최종공정시간");
		for (ProcessDTO process : processes) {
			System.out.printf("%s	%s	%s	", process.getW_workNo(), process.getP_p1(), process.getP_p2());
			System.out.printf("%s	%s	%s	%s	", process.getP_p3(), process.getP_p4(), process.getP_p5(), process.getP_p6());
			System.out.printf("%s	%s\n", process.getW_lastDate(), process.getW_lastTime());
		}
	}

	public void showResult() {
		List<ProcessDTO> results = smartProductService.getResult();
		System.out.println("작업공정조회(최종)");
		System.out.println("작업지시번호	제품코드	제품명	준비	인쇄	코팅	합지	접합	포장	최종공정일자	최종공정시간");
		for (ProcessDTO result : results) {
			String w_workNo = result.getW_workNo().substring(0, 4) + "-" + result.getW_workNo().substring(4);
			LocalDate w_workDate = LocalDate.parse(result.getW_lastDate(), DateTimeFormatter.BASIC_ISO_DATE);
			String[] p_p = {result.getP_p1(), result.getP_p2(), result.getP_p3(), result.getP_p4(), result.getP_p5(), result.getP_p6() };
			
			
			System.out.printf("%s	%s	%s	", w_workNo, result.getP_code(), result.getP_name());
			for (String p_pi : p_p) {
				if (p_pi.equals("Y")) {
					System.out.printf("완료\t");
				} else {
					System.out.printf("~\t");
				}
			}
			System.out.printf("%s	%s\n", w_workDate, result.getW_lastTime());
		}
	}

}
