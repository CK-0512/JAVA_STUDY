package com.jslhrd.object;
class AA {
	int x;
	AA (int x) {
		this.x = x;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof AA) {
			AA a = (AA)obj;
			return x == a.x;
		}
		return false;
	}
}
public class Exam_02 {
	public static void main(String[] args) {
		AA a1 = new AA(10);
		AA a2 = new AA(20);
		AA a3 = new AA(10);

		System.out.println(a1.equals(a2));
		System.out.println(a1.equals(a3));
	}
}
