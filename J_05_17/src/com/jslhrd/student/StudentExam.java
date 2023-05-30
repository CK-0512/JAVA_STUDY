package com.jslhrd.student;

import java.io.FileNotFoundException;

public class StudentExam {
	public static void main(String[] args) throws FileNotFoundException {
		StudentProcess studentProcess = new StudentProcess();
		studentProcess.studentRegister();
		studentProcess.printByregister();
		studentProcess.printBynum();
	}
}
