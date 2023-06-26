package com.jslhrd.artistProject.dto;

public class PointDTO {
	int serial_no;
	String artist_id;
	String mento_id;
	int point;
	
	public PointDTO() {};
	public PointDTO(int serial_no, String artist_id, String mento_id, int point) {
		this.serial_no = serial_no;
		this.artist_id = artist_id;
		this.mento_id = mento_id;
		this.point = point;
	}
	public int getSerial_no() {
		return serial_no;
	}
	public void setSerial_no(int serial_no) {
		this.serial_no = serial_no;
	}
	public String getArtist_id() {
		return artist_id;
	}
	public void setArtist_id(String artist_id) {
		this.artist_id = artist_id;
	}
	public String getMento_id() {
		return mento_id;
	}
	public void setMento_id(String mento_id) {
		this.mento_id = mento_id;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
}
