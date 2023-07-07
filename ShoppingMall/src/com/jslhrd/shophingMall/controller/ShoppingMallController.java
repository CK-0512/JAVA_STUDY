package com.jslhrd.shophingMall.controller;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.jslhrd.shophingMall.dto.Member;
import com.jslhrd.shophingMall.dto.Money;
import com.jslhrd.shophingMall.service.ShoppingMallService;

public class ShoppingMallController {
	private ShoppingMallService shoppingMallService;
	private Scanner sc;

	public ShoppingMallController(Scanner sc) {
		this.sc = sc;
		this.shoppingMallService = ShoppingMallService.getInstance();
	}

	public void memberRegist() {
		System.out.println("회원 정보 등록 화면");

		while (true) {
			int custNo = shoppingMallService.getLastCustNo() + 1;
			System.out.printf("회원번호 : %d\n", custNo);
			

			System.out.print("회원성명 : ");
			String custname = sc.next();
			System.out.print("회원전화 : ");
			String phone = sc.next();
			System.out.print("성별(M/F) : ");
			String gender = sc.next().toUpperCase();
			Date today = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			String joinDate = sdf.format(today);
			System.out.printf("가입일자 : %s\n", joinDate);
			System.out.print("고객등급 : ");
			String grade = sc.next();
			System.out.print("도시코드 : ");
			String city = sc.next();
			
			Member member = new Member();
			member.setCustNo(custNo);
			member.setCustName(custname);
			member.setPhone(phone);
			member.setGender(gender);
			member.setJoinDate(joinDate);
			member.setGrade(grade);
			member.setCity(city);
			
			int row = shoppingMallService.memberRegist(member);
			if (row != 0) {
				System.out.println("등록성공");
			} else {
				System.out.println("등록실패");
			}

			System.out.print("회원등록을 계속합니까(Y/N)? ");
			String confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				continue;
			} else {
				break;
			}
		}
	}

	public void moneyRegist() {
		System.out.println("회원매출정보 등록 화면");
		
		while (true) {
			System.out.print("회원번호 : ");
			int custNo = sc.nextInt();
			Member isExistsMember = shoppingMallService.memberSearchByCustNo(custNo);
			if (isExistsMember == null) {
				System.out.println("존재하지않는 회원입니다.");
				continue;
			}
			System.out.print("판매번호 : ");
			int saleNo = sc.nextInt();
			System.out.print("단가 : ");
			int pcost = sc.nextInt();
			System.out.print("수량 : ");
			int amount = sc.nextInt();
			
			int price = pcost * amount;
			System.out.printf("가격 : %d\n", price);
			System.out.print("상품코드 : ");
			String pcode = sc.next();
			Date today = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			String sDate = sdf.format(today);
			System.out.printf("판매일자 : %s\n", sDate);

			Money money = new Money();
			money.setCustNo(custNo);
			money.setSaleNo(saleNo);
			money.setPcost(pcost);
			money.setAmount(amount);
			money.setPrice(price);
			money.setPcode(pcode);
			money.setSdate(sDate);
			
			int row = shoppingMallService.moneyRegist(money);
			if (row != 0) {
				System.out.println("등록성공");
			} else {
				System.out.println("등록실패");
			}

			System.out.print("회원매출정보 등록을 계속합니까(Y/N)? ");
			String confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				continue;
			} else {
				break;
			}
		}
	}

	public void showMembers() {
		List<Member> members = shoppingMallService.getMembers();
		System.out.println("회원목록조회");
		System.out.println("회원번호	회원성명	연락처	성별	가입일자	고객등급	도시코드");
		for (Member member : members) {
			String joinDate = dateFormat(member.getJoinDate(), 1);
			String grade = setGrade(member.getGrade());
			String gender = setGender(member.getGender());
			
			
			System.out.printf("%d		%s	%s	", member.getCustNo(), member.getCustName(), member.getPhone());
			System.out.printf("%s	%s		", gender, joinDate);
			System.out.printf("%s	%s\n", grade, member.getCity());
		}
	}

	public void showMoneys() {
		List<Money> moneys = shoppingMallService.getMoneys();
		System.out.println("회원매출정보 목록조회");
		System.out.println("회원번호	판매번호	단가	수량	가격	상품코드	판매일자");
		for (Money money : moneys) {
			String price = setPrice(money.getPrice());
			String sdate = dateFormat(money.getSdate(), 1);
			
			System.out.printf("%d		%d	%d	", money.getCustNo(), money.getSaleNo(), money.getPcost());
			System.out.printf("%d	%s	%s		%s\n", money.getAmount(), price, money.getPcode(), sdate);
		}
	}

	public void searchMemberDetail() {
		System.out.println("회원 정보 검색 화면");
		
		while (true) {
			System.out.print("회원번호 : ");
			int custNo = sc.nextInt();
			Member member = shoppingMallService.memberSearchByCustNo(custNo);
			if (member == null) {
				System.out.println("등록된 회원이 없습니다.");
				continue;
			}
			
			System.out.printf("회원성명 : %s\n", member.getCustName());
			System.out.printf("회원전화 : %s\n", member.getPhone());
			
			String gender = setGender(member.getGender());
			System.out.printf("성별 : %s\n", gender);
			
			String joinDate = dateFormat(member.getJoinDate(), 2);
			System.out.printf("가입일자 : %s\n", joinDate);
			
			String grade = setGrade(member.getGrade());
			System.out.printf("고객등급 : %s\n", grade);
			System.out.printf("도시코드 : %s\n", member.getCity());
			
			System.out.print("검색을 계속하시겠습니까(Y/N)? ");
			String confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				continue;
			} else {
				break;
			}
		}
		
	}

	public void showMembers2() {
		List<Member> members = shoppingMallService.getMembersWithCityName();
		System.out.println("회원목록조회2");
		System.out.println("회원번호	회원성명	전화번호	성별	가입일자	고객등급	거주지역");
		for (Member member : members) {
			String joinDate = dateFormat(member.getJoinDate(), 1);
			String grade = setGrade(member.getGrade());
			
			
			System.out.printf("%d		%s		%s	", member.getCustNo(), member.getCustName(), member.getPhone());
			System.out.printf("%s	%s		", member.getGender(), joinDate);
			System.out.printf("%s	%s\n", grade, member.getCityName());
		}
	}

	public void showMembersMoneys() {
		List<Member> membersMoneys = shoppingMallService.getMembersSal();
		System.out.println("회원매출조회");
		System.out.println("회원번호	회원성명	전화번호	고객등급	매출");
		for (Member member : membersMoneys) {
			String sal = setPrice(member.getSal());
			String grade = setGrade(member.getGrade());
			
			System.out.printf("%d		%s		%s	", member.getCustNo(), member.getCustName(), member.getPhone());
			System.out.printf("%s		%s\n", grade, sal);
		}
	}
	
	private String setPrice(int p) {
		DecimalFormat df = new DecimalFormat("#,###");
		String price = df.format(p);
		return price;
	}

	private String setGrade(String grade) {
		switch (grade) {
			case "1" :
				grade = "VIP";
				break;
			case "2" :
				grade = "일반";
				break;
			case "3" :
				grade = "직원";
				break;
		}
		return grade;
	}

	private String setGender(String gender) {
		if (gender.equals("M")) {
			gender = "남자";
		} else {
			gender = "여자";
		}
		return gender;
	}

	private String dateFormat(String date, int flag) {
		String date1 = null;
		String date2 = null;
		try {
			SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
			SimpleDateFormat ndf = new SimpleDateFormat("yyyy년MM월dd일");
			SimpleDateFormat ndf2 = new SimpleDateFormat("yyyy-MM-dd");
			Date d = df.parse(date);
			date1 = ndf.format(d);
			date2 = ndf2.format(d);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if (flag == 1) {
			return date1;
		} else {
			return date2;
		}
	}

}
