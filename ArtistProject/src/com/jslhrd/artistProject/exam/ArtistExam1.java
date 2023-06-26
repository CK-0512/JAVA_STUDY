package com.jslhrd.artistProject.exam;

import java.util.Scanner;

import com.jslhrd.artistProject.dao.ArtistDAO;
import com.jslhrd.artistProject.dto.ArtistDTO;

public class ArtistExam1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArtistDTO dto;
		ArtistDAO dao = ArtistDAO.getInstance();
		
		System.out.println("오디션 지원자 정보 등록 화면");
		System.out.print("참가번호 : ");
		String artist_id = sc.next();
		System.out.print("이름 : ");
		String artist_name = sc.next();
		System.out.print("성별 : ");
		String artist_gender = sc.next();
		System.out.print("생년월일 : ");
		String artist_birth = sc.next();
		System.out.print("특기 : ");
		String talent = sc.next();
		System.out.print("소속사 : ");
		String agency = sc.next();
		
		dto = new ArtistDTO(artist_id, artist_name, artist_gender, artist_birth, talent, agency);
		
		int row = dao.artistInsert(dto);
		if (row != 0) {
			System.out.println("등록이 완료되었습니다");
		}
	}

}
