package com.code;

import java.time.LocalDate;



public class Student implements Comparable<Student> {
	private String PRN;
	private String firstName;
	private String lastName;
	private LocalDate dob;
	private Course course;
	private Boolean confirm_admission;
	private String email;
	private String password;
	
	
	
	public Student(String pRN, String firstName, String lastName, LocalDate dob, Course course,String email,String Password,Boolean confirm_admission) {
		super();
		PRN = pRN;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.course = course;
		this.email = email;
		this.password = password;
		this.confirm_admission = confirm_admission;
	}



	public Student(String email) {
		super();
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}

	


	public String getPRN() {
		return PRN;
	}



	public void setPRN(String pRN) {
		PRN = pRN;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public LocalDate getDob() {
		return dob;
	}



	public void setDob(LocalDate dob) {
		this.dob = dob;
	}



	public Course getCourse() {
		return course;
	}



	public void setCourse(Course course) {
		this.course = course;
	}



	public Boolean getConfirm_admission() {
		return confirm_admission;
	}



	public void setConfirm_admission(Boolean confirm_admission) {
		this.confirm_admission = confirm_admission;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		return "Student [PRN=" + PRN + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + ", email=" + email +
				 ", course=" + course + "Fees: " + course.getFees() + ", confirm_admission=" + confirm_admission + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Student s)
			return this.PRN.equals(s.PRN);
		return false;
	}
	
	@Override
	public int compareTo(Student anotherStudent) {
		return this.email.compareTo(anotherStudent.email);
	}

}
