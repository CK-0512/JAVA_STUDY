package com.jslhrd.artistProject.exam;

import java.util.List;
import java.util.Scanner;

import com.jslhrd.artistProject.dao.ArtistDAO;
import com.jslhrd.artistProject.dto.PointDTO;

public class ArtistExam6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<PointDTO> list;
		ArtistDAO dao = ArtistDAO.getInstance();
		
		System.out.println("심사위원 채점결과 삭제화면");
		System.out.print("채점번호 : ");
		int serial_no = sc.nextInt();
		
		int row = dao.pointDelete(serial_no);
		if (row != 0) {
			System.out.println("채점정보 삭제가 완료되었습니다");
		} else {
			System.out.println("존재하지 않는 채점정보입니다.");
			return;
		}
		
		list = dao.pointList();
		System.out.println("채점번호	참가번호	멘토아이디	점수");
		for (PointDTO dto : list) {
			System.out.printf("%d\t\t%s\t\t", dto.getSerial_no(), dto.getArtist_id());
			System.out.printf("%s\t\t%d\n", dto.getMento_id(), dto.getPoint());
		}
	}

}
