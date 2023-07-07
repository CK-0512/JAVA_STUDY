package com.jslhrd.shophingMall.service;

import java.util.List;

import com.jslhrd.shophingMall.dao.ShoppingMallDAO;
import com.jslhrd.shophingMall.dto.Member;
import com.jslhrd.shophingMall.dto.Money;

public class ShoppingMallService {
	
	private ShoppingMallDAO shoppingMallDAO;
	
	private ShoppingMallService() {
		this.shoppingMallDAO = ShoppingMallDAO.getInstance();
	}
	
	private static ShoppingMallService instance = new ShoppingMallService();
	
	public static ShoppingMallService getInstance() {
		return instance;
	}

	public int getLastCustNo() {
		return shoppingMallDAO.getLastCustNo();
	}

	public int memberRegist(Member member) {
		return shoppingMallDAO.memberRegist(member);
	}

	public Member memberSearchByCustNo(int custNo) {
		return shoppingMallDAO.memberSearchByCustNo(custNo);
	}

	public int moneyRegist(Money money) {
		return shoppingMallDAO.moneyRegist(money);
	}

	public List<Member> getMembers() {
		return shoppingMallDAO.getMembers();
	}

	public List<Money> getMoneys() {
		return shoppingMallDAO.getMoneys();
	}

	public List<Member> getMembersWithCityName() {
		return shoppingMallDAO.getMembersWithCityName();
	}

	public List<Member> getMembersSal() {
		return shoppingMallDAO.getMembersSal();
	}
	
}
