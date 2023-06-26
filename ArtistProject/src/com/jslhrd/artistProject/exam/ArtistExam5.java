package com.jslhrd.artistProject.exam;

import java.util.List;
import java.util.Scanner;

import com.jslhrd.artistProject.dao.ArtistDAO;
import com.jslhrd.artistProject.dto.ArtistDTO;

public class ArtistExam5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<ArtistDTO> list;
		ArtistDAO dao = ArtistDAO.getInstance();
		
		System.out.println("참가자 정보 삭제화면");
		System.out.print("참가번호 : ");
		String artist_id = sc.next();
		
		int row = dao.artistDelete(artist_id);
		if (row != 0) {
			System.out.println("참가자 삭제가 완료되었습니다");
		} else {
			System.out.println("존재하지 않는 참가자입니다.");
			return;
		}
		
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
