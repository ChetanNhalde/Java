package com.code;

public class Student {
	
	private int rollno;
	private int marks1,marks2,marks3;
	
	
	public void acceptInfo(int rollno,int marks1,int marks2,int marks3) {
		this.rollno = rollno;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
		
	}
	private float total = marks1+marks2+marks3;
	private float percentage = (total/300)*100;
	public char calcGrade() {
		if(percentage >= 75.0) return 'A';
		else if(percentage < 75.0 && percentage >=60.0 ) return 'B';
		else return 'C';
	}
	
	public void displayInfo() {
		System.out.println("Rollno: " + rollno + "\nMarks1: " + marks1 +"\nMarks2: " +
				marks2 + "\nMarks3: " + marks3 + "\nTotal: " + (marks1+marks2+marks3) 
				+ "\nPercentage: " + percentage + "\nGrade: " + calcGrade());
	}
}
