package com.jslhrd.artistProject.exam;

import java.util.List;
import java.util.Scanner;

import com.jslhrd.artistProject.dao.ArtistDAO;
import com.jslhrd.artistProject.dto.PointDTO;

public class ArtistExam3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PointDTO dto;
		List<PointDTO> list;
		ArtistDAO dao = ArtistDAO.getInstance();
		
		System.out.println("심사위원 채점결과 등록화면");
		System.out.print("채점번호 : ");
		int serial_no = sc.nextInt();
		System.out.print("참가번호 : ");
		String artist_id = sc.next();
		System.out.print("멘토아이디 : ");
		String mento_id = sc.next();
		System.out.print("점수 : ");
		int point = sc.nextInt();
		
		dto = new PointDTO(serial_no, artist_id, mento_id, point); 
		
		int row = dao.pointInsert(dto);
		if (row != 0) {
			System.out.println("점수 등록이 완료되었습니다");
		} else {
			System.out.println("등록 실패");
			return;
		}
		
		list = dao.pointList();
		System.out.println("채점번호	참가번호	멘토아이디	점수");
		for (PointDTO pdto : list) {
			System.out.printf("%d\t\t%s\t\t", pdto.getSerial_no(), pdto.getArtist_id());
			System.out.printf("%s\t\t%d\n", pdto.getMento_id(), pdto.getPoint());
		}
	}

}
