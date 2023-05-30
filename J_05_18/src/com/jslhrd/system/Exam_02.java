package com.jslhrd.system;
// 가비지 컬렉션 : 쓰레기 수집 : gc()
class Emp {
	int eno;
	Emp(int eno) {
		this.eno = eno;
		System.out.println("Emp(" + eno + ")메모리에 생성됨");
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Emp(" + eno + ")메모리에서 제거됨");
	}
}
public class Exam_02 {
	public static void main(String[] args) {
		Emp emp;
		emp = new Emp(1);
		emp = null;
		emp = new Emp(2);
		emp = new Emp(3);
		
		System.out.println("최종적으로 참조하는 사원번호 : " + emp.eno);
		System.gc();
	}
}
