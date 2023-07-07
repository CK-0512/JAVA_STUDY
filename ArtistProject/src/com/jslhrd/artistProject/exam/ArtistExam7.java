package com.jslhrd.artistProject.exam;

import java.util.List;

import com.jslhrd.artistProject.dao.ArtistDAO;
import com.jslhrd.artistProject.dto.JoinDTO;

public class ArtistExam7 {

	public static void main(String[] args) {
		List<JoinDTO> list;
		ArtistDAO dao = ArtistDAO.getInstance();
		
		list = dao.joinList();
		System.out.println("채점번호	참가번호	참가자명	생년월일	점수	멘토이름");
		for (JoinDTO dto : list) {
			String birth;
			
			birth = dto.getArtist_birth().substring(0, 4) + "년" + dto.getArtist_birth().substring(4, 6) + "월" + dto.getArtist_birth().substring(6) + "일";

			System.out.printf("%s\t\t%s\t\t", dto.getSerial_no(), dto.getArtist_id());
			System.out.printf("%s\t\t%s\t", dto.getArtist_name(), birth);
			System.out.printf("%d\t%s\n", dto.getPoint(), dto.getMento_name());
		}
	}

}
