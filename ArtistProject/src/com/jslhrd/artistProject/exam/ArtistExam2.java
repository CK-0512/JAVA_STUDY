package com.jslhrd.artistProject.exam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.jslhrd.artistProject.dao.ArtistDAO;
import com.jslhrd.artistProject.dto.ArtistDTO;

public class ArtistExam2 {

	public static void main(String[] args) {
		List<ArtistDTO> list;
		ArtistDAO dao = ArtistDAO.getInstance();
		
		list = dao.artistList();
		System.out.println("참가번호	참가자명	생년월일	성별	특기	소속사");
		for (ArtistDTO dto : list) {
			String birth;
			String gender;
			String talent;
			
			birth = dto.getArtist_birth().substring(0, 4) + "년" + dto.getArtist_birth().substring(4, 6) + "월" + dto.getArtist_birth().substring(6) + "일";
			
			if (dto.getArtist_gender().equals("M")) {
				gender = "남성";
			} else {
				gender = "여성";
			}
			
			if (dto.getTalent().equals("1")) {
				talent = "댄스";
			} else if (dto.getTalent().equals("2")) {
				talent = "노래";
			} else {
				talent = "랩";
			}
			
			System.out.printf("%s\t\t%s\t\t", dto.getArtist_id(), dto.getArtist_name());
			System.out.printf("%s\t%s\t", birth, gender);
			System.out.printf("%s\t%s\n", talent, dto.getAgency());
		}
	}

}
