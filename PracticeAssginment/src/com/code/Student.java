package com.code;

import java.time.LocalDate;

public class Student {
	private String PRN;
	private String firstName;
	private String lastName;
	private LocalDate dob;
	private Course course;
	private Boolean confirm_admission;
	
	
	
	public Student(String pRN, String firstName, String lastName, LocalDate dob, Course course,Boolean confirm_admission) {
		super();
		PRN = pRN;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.course = course;
		this.confirm_admission = confirm_admission;
	}



	@Override
	public String toString() {
		return "Student [PRN=" + PRN + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", course=" + course + "Fees: " + course.getFees() + ", confirm_admission=" + confirm_admission + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Student s)
			return this.PRN.equals(s.PRN);
		return false;
	}

}
