package com.iacsd.custom_exception;

import com.iacsd.core.Customer;
import com.iacsd.core.ServicePlan;

import java.time.Period;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import com.iacsd.utils.InvalidPlanException;



public class validateRules {

	
	public static String validateEmail(String email,List<Customer> customers)throws InvalidPlanException {
		String regx = "[a-z]+[a-z0-9]+@[a-z]*\\.(com|org|net)";
		if(!email.matches(regx)) throw new InvalidPlanException("Email should be in proper format");
		Customer newCustomer = new Customer(email);
		if(customers.contains(newCustomer)) {
			throw new InvalidPlanException("Customer already exists");
		}
		return email;
		
	}
	
	public static String validateEmailMap(String email,Map<String,Customer> customers)throws InvalidPlanException {
		String regx = "[a-z]+[a-z0-9]+@[a-z]*\\.(com|org|net)";
		if(!email.matches(regx)) throw new InvalidPlanException("Email should be in proper format");
	
		if(customers.containsValue(email)) {
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
	
	public static Customer signIn(String email,String password,List<Customer> customers)throws InvalidPlanException {
		int index = customers.indexOf(new Customer(email));
		if(index == -1) throw new InvalidPlanException("Invalid Email!");
		Customer c = customers.get(index);
		if(!c.getPassword().equals(password)) throw new InvalidPlanException("Invalid Password");
		
		return c;
		
	}
	
	public static Customer signInMap(String email,String password,Map<String,Customer> customers)throws InvalidPlanException {
		for(Customer c: customers.values()) {
			if(c.getEmail().equals(email) && c.getPassword().equals(password)) {
				return c;
			}
		}
		
		
		throw new InvalidPlanException("Invalid Email and Password");
		
		
		
	}
	
	
	public static void changePassword(String email,String oldPassword,String newPassWord,List<Customer> customers)throws InvalidPlanException {
	
		Customer c = signIn(email, oldPassword, customers);
		c.setPassword(newPassWord);
		System.out.println("Password changed successfully");
	}
	
	public static void changePasswordMap(String email,String oldPassword,String newPassWord,Map<String,Customer> customers)throws InvalidPlanException {
		
		Customer c = signInMap(email, oldPassword, customers);
		c.setPassword(newPassWord);
		System.out.println("Password changed successfully");
	}
	
	public static void validateSubscription(List<Customer> customers) {
		for(Customer c : customers) {
			long date = Period.between(c.getRegDate(), c.getLastSubscriptionDate()).toTotalMonths();
			if(date > 3) System.out.println(c);
		}
	}
	
	
	/*
	 * state  : customer id(int) ,first name, last name (string),email(string),password(string),registrationAmount(double),dob(LocalDate),plan(ServicePlan : enum)
Must generate customer ids automatically : auto increment)
PK(UID) : email
*/
	
	public static Customer validateAllInputs(String firstName, String lastName, String email, String password,String regDate, double registrationAmount,
			String dob, String plan,List<Customer> customers) throws InvalidPlanException {
		ServicePlan validatePlan = validatePlan(plan);
		LocalDate date = parseDate(dob);
		
		
		return new Customer(firstName,  lastName,  validateEmail(email, customers),  password,parseDate(regDate),  registrationAmount,
				 date,  validatePlan);
	}

	
	

}
