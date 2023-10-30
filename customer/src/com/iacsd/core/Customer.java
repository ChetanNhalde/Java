package com.iacsd.core;

import java.time.LocalDate;

public class Customer implements Comparable<Customer>{
	
	private static int idCounter;
	private int custId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private double registrationAmount;
	private LocalDate dob;
	private ServicePlan plan;
	private LocalDate regDate;
	private LocalDate lastSubscriptionDate;
	
	static {
		idCounter = 100;
	}

	public Customer(String firstName, String lastName, String email, String password,LocalDate regDate, double registrationAmount,
			LocalDate dob, ServicePlan plan) {
		super();
		this.custId = idCounter++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.regDate = regDate;
		this.registrationAmount = registrationAmount;
		this.dob = dob;
		this.plan = plan;
		this.lastSubscriptionDate = LocalDate.now();
	}
	
	

	public LocalDate getRegDate() {
		return regDate;
	}



	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}



	public LocalDate getLastSubscriptionDate() {
		return lastSubscriptionDate;
	}



	public static void setIdCounter(int idCounter) {
		Customer.idCounter = idCounter;
	}



	public void setCustId(int custId) {
		this.custId = custId;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public void setPlan(ServicePlan plan) {
		this.plan = plan;
	}



	public void setLastSubscriptionDate(LocalDate lastSubscriptionDate) {
		this.lastSubscriptionDate = lastSubscriptionDate;
	}



	public Customer(String email) {
		super();
		this.email = email;
	}
	



	public String getEmail() {
		return email;
	}

	


	public void setPassword(String password) {
		this.password = password;
	}
	
	



	public LocalDate getDob() {
		return dob;
	}



	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	



	public String getLastName() {
		return lastName;
	}
	


	public Customer(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}



	public String getPassword() {
		return password;
	}



	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", registrationAmount=" + registrationAmount + ", dob=" + dob + ", plan=" + plan + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Customer) {
			Customer c = (Customer)o;
			return this.email.equals(c.email);
		}
		
		return false;
	}
	
	@Override
	public int compareTo(Customer anotherCutomer) {
		return this.email.compareTo(anotherCutomer.email);
	}
	
	
	

}
