package com.jslhrd.contest.service;

import java.util.List;

import com.jslhrd.contest.dao.ContestDAO;
import com.jslhrd.contset.dto.EntryDTO;
import com.jslhrd.contset.dto.ScoreDTO;

public class ContestService {
	
	private ContestDAO contestDAO;
	
	public ContestService() {
		this.contestDAO = new ContestDAO();
	}

	public void entryRegister(EntryDTO entryDTO) {
		contestDAO.entryRegister(entryDTO);
	}
	
	public void scoreRegister(ScoreDTO scoreDTO) {
		contestDAO.scoreRegister(scoreDTO);
	}
	
	public int getLastEntryNo() {
		return contestDAO.getLastEntryNO();
	}

	public List<String> getJumin() {
		return contestDAO.getJumin();
	}
	
	public List<EntryDTO> getEntries() {
		return contestDAO.getEntries();
	}

	public String getExistsEntryNo(String entry_no) {
		return contestDAO.getExistsEntryNo(entry_no);
	}

	public List<ScoreDTO> getScores() {
		return contestDAO.getScores();
	}

	public ScoreDTO doSearch(String entry_no) {
		return contestDAO.doSearch(entry_no);
	}

	public List<ScoreDTO> getResult() {
		List<ScoreDTO> scores = contestDAO.getResult();
		
		for (ScoreDTO dto : scores) {
			int rank = 1;
			for (ScoreDTO dto2 : scores) {
				if (dto.getS_avg() < dto2.getS_avg()) {
					rank++;
				}
			}
			dto.setRank(rank);
		}
		
		return scores; 
	}



}
