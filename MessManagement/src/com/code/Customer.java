package com.code;

import java.io.Serializable;
import java.time.LocalDate;

public class Customer implements Serializable {
	
	private static int counter;
	private int customerId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String address;
	private LocalDate registerDate;
	private LocalDate planEndDate;
	private String phoneNo;
	private Plan plan;
	private double finalAmount;
	
	static {
		counter = 1;
	}
	
	
	public Customer(String firstName, String lastName, String email, String password, String address,
			LocalDate registerDate,String phoneNo, Plan plan,double finalAmount) {
		this.customerId = counter++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.address = address;
		this.registerDate = registerDate;
		this.phoneNo = phoneNo;
		this.plan = plan;
		this.planEndDate = registerDate.plusMonths(plan.getPeriod());
		this.finalAmount = plan.getPrice();
		this.finalAmount = finalAmount;
	}


	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", address=" + address + ", registerDate=" + registerDate + ", planEndDate=" + planEndDate
				+ ", phoneNo=" + phoneNo + ", plan=" + plan + ", finalAmount=" + finalAmount + "]";
	}



	public static int getCounter() {
		return counter;
	}



	public static void setCounter(int counter) {
		Customer.counter = counter;
	}



	public int getCustomerId() {
		return customerId;
	}



	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public LocalDate getRegisterDate() {
		return registerDate;
	}



	public void setRegisterDate(LocalDate registerDate) {
		this.registerDate = registerDate;
	}



	public LocalDate getPlanEndDate() {
		return planEndDate;
	}



	public void setPlanEndDate(LocalDate planEndDate) {
		this.planEndDate = planEndDate;
	}



	public String getPhoneNo() {
		return phoneNo;
	}



	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}



	public Plan getPlan() {
		return plan;
	}



	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	


	public double getFinalAmount() {
		return finalAmount;
	}



	public void setFinalAmount(double finalAmount) {
		this.finalAmount = finalAmount;
	}
	
	
	
	
	
	

}
