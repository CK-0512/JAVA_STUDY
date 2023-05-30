package com.jshrdTest;

import com.jshrdTest02.EE;
//접근제한자 : private(같은 클래스) < default(같은 패키지) < protected(같은 패키지 또는 상속관계) < public(누구나)
public class Exam_05 {
	FF f1 = new FF();
	
	com.jshrdTest02.EE e1 = new EE();
	EE e2 = new EE();
}
