package com.tester;

import java.util.Scanner;

import com.code.Student;

public class TestMarks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		
		s.acceptInfo(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		
		s.displayInfo();
	}
}
