package com.jslhrd.student;

import java.io.FileNotFoundException;

public class StudentExam {
	public static void main(String[] args) throws FileNotFoundException {
		StudentData studentData = new StudentData();
		studentData.stdRegister();
		studentData.stdPrintByRegister();
		studentData.stdPrintByTot();
	}
}
