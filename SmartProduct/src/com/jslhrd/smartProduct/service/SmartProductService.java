package com.jslhrd.smartProduct.service;

import java.util.List;

import com.jslhrd.smartProduct.dao.SmartProductDAO;
import com.jslhrd.smartProduct.dto.ProcessDTO;
import com.jslhrd.smartProduct.dto.ProductDTO;
import com.jslhrd.smartProduct.dto.WorkListDTO;

public class SmartProductService {
	
	private SmartProductDAO smartProductDAO;
	
	private SmartProductService() {
		this.smartProductDAO = SmartProductDAO.getInstance();
	}
	
	private static SmartProductService instance = new SmartProductService();
	
	public static SmartProductService getInstance() {
		return instance;
	}
	
	public String productCodeSearch(String p_code) {
		return smartProductDAO.productCodeSearch(p_code);
	}
	
	public int productRegiseter(ProductDTO product) {
		return smartProductDAO.productRegiseter(product);
	}

	public List<ProductDTO> getProducts() {
		return smartProductDAO.getProducts();
	}
	
	public int getLastW_workNo() {
		return smartProductDAO.getLastW_workNo();
	}

	public int workListRegister(WorkListDTO workList) {
		return smartProductDAO.workListRegiseter(workList);
	}

	public List<WorkListDTO> getWorkLists() {
		return smartProductDAO.getWorkLists();
	}
	
	public String workListWorkNoSearch(String w_workNo) {
		return smartProductDAO.workListWorkNoSearch(w_workNo);
	}

	public int processRegister(ProcessDTO process) {
		return smartProductDAO.processRegister(process);
	}

	public List<ProcessDTO> getProcesses() {
		return smartProductDAO.getProcesses();
	}

	public List<ProcessDTO> getResult() {
		return smartProductDAO.getResult();
	}
	
}
