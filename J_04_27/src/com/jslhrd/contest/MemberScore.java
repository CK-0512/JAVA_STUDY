package com.jslhrd.contest;

public class MemberScore {
	private int memberNum;
	private String memberName;
	private String memberType;
	private int[] score = new int[9];

	public MemberScore() {
	};

	public MemberScore(int memberNum, int[] score) {
		this.memberNum = memberNum;
		this.score = score;
	}

	public int getMemberNum() {
		return memberNum;
	}

	public void setMemberNum(int memberNum) {
		this.memberNum = memberNum;
	}
	public String getMemberName() {
		return memberName;
	}
	
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String getMemberType() {
		return memberType;
	}
	
	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

	public int[] getScore() {
		return score;
	}

	public void setScore(int[] score) {
		this.score = score;
	}
}
