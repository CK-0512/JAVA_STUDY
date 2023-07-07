package com.jslhrd.employee.service;

import java.util.List;

import com.jslhrd.employee.dao.EmpDAO;
import com.jslhrd.employee.dto.EmpDTO;

public class EmpService {
	
	private EmpDAO empDAO;
	
	public EmpService() {
		this.empDAO = new EmpDAO();
	}

	public List<EmpDTO> getEmployees() {
		return empDAO.getEmployees();
	}

	public void doRegister(EmpDTO empDTO) {
		empDAO.doRegister(empDTO);
	}

	public EmpDTO doSearch(int eno) {
		return empDAO.doSearch(eno);
	}

	public void doModify(EmpDTO searchedEmp) {
		empDAO.doModify(searchedEmp);
	}

	public void doDelete(int eno) {
		empDAO.doDelete(eno);
	}
	
	public int getLastEno() {
		return empDAO.getLastEno();
	}

}
