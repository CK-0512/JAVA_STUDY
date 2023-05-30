package com.jslhrd.member;

public class Member implements Comparable<Member> {
	private int id;
	private String name;
	private String email;
	Member(){}
	Member(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return id + "\t" + name + "\t" + email;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member m = (Member)obj;
			return m.id == id;
		}
		return false;
	}
	
	@Override
	public int compareTo(Member o) {
		return Integer.compare(id, o.id);
	}
}
