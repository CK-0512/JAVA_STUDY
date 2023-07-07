package com.jslhrd.artistProject.exam;

import java.util.List;

import com.jslhrd.artistProject.dao.ArtistDAO;
import com.jslhrd.artistProject.dto.Join2DTO;

public class ArtistExam8 {

	public static void main(String[] args) {
		List<Join2DTO> list;
		ArtistDAO dao = ArtistDAO.getInstance();

		list = dao.join2List();
		System.out.println("참가번호	참가자명	성별	총점	평균");

		for (Join2DTO dto : list) {
			String gender;

			if (dto.getArtist_gender().equals("M")) {
				gender = "남성";
			} else {
				gender = "여성";
			}

			System.out.printf("%s\t\t%s\t\t", dto.getArtist_id(), dto.getArtist_name());
			System.out.printf("%s\t%d\t", gender, dto.getSum());
			System.out.printf("%.2f\n", dto.getAvg());
		}

	}

}
