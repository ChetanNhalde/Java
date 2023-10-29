package com.iacsd.custom_exception;

import com.iacsd.core.Customer;
import com.iacsd.core.ServicePlan;


import java.time.LocalDate;
import java.util.List;

import com.iacsd.utils.InvalidPlanException;



public class validateRules {

	
	public static String validateEmail(String email,List<Customer> customers)throws InvalidPlanException {
		Customer newCustomer = new Customer(email);
		if(customers.contains(newCustomer)) {
			throw new InvalidPlanException("Customer already exists");
		}
		return email;
		
	}
	
	public static ServicePlan validatePlan(String plan) throws IllegalArgumentException {
		return ServicePlan.valueOf(plan.toUpperCase());
		
	}
	
	public static void validatePlanAmount(ServicePlan plan,double regAmount) throws InvalidPlanException{
		if(plan.getPlanAmount() != regAmount) {
			throw new InvalidPlanException("Amount doesn't match!");
		}
			
	}
	
	public static LocalDate parseDate(String date) {
		return LocalDate.parse(date);
	}
	
	public static void signIn(String email,String password,List<Customer> customers)throws InvalidPlanException {
		Customer newCustomer = new Customer(email,password);
		if(customers.contains(newCustomer)) {
			System.out.println("Welocme");
			
		}
		else
		throw new InvalidPlanException("Invalid Email and Password");
		
	};
	
	public static void changePassword(String email,String oldPassword,String newPassWord,List<Customer> customers)throws InvalidPlanException {
	
		int index = customers.indexOf(new Customer(email,oldPassword));
		if(index == -1) 
			throw new InvalidPlanException("Customers does not exists");
		else
		customers.set(index, new Customer(email,newPassWord));
		
	}
	/*
	 * state  : customer id(int) ,first name, last name (string),email(string),password(string),registrationAmount(double),dob(LocalDate),plan(ServicePlan : enum)
Must generate customer ids automatically : auto increment)
PK(UID) : email
*/
	
	public static Customer validateAllInputs(String firstName, String lastName, String email, String password, double registrationAmount,
			String dob, String plan,List<Customer> customers) throws InvalidPlanException {
		ServicePlan validatePlan = validatePlan(plan);
		LocalDate date = parseDate(dob);
		
		
		return new Customer(firstName,  lastName,  validateEmail(email, customers),  password,  registrationAmount,
				 date,  validatePlan);
	}

	
	

}
