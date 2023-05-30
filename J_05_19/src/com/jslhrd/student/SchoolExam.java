package com.jslhrd.student;

import java.io.FileNotFoundException;

public class SchoolExam {
	public static void main(String[] args) throws FileNotFoundException {
		SchoolProcess schoolProcess = new SchoolProcess();
		schoolProcess.stdRegister();
		schoolProcess.scoreRegister();
		schoolProcess.stdPrint();
		schoolProcess.scorePrint();
	}
}
