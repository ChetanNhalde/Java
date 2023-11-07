package com.utils;

import java.time.LocalDate;
import java.util.Map;
import java.time.Period;
import com.code.Customer;
import com.code.Plan;
import com.custom_exception.InvalidIdException;
import com.custom_exception.InvalidInputException;

public class ValidatateRules {
	
	public static int checkDuplicatesId(Map<String,Customer> mp,int id)throws InvalidIdException  {
		if(!mp.containsKey(id)) {
			throw new InvalidIdException("Customer already exists!");
		}
		
		return id;
	}
	
	public static String validateEmail(String email)throws InvalidInputException {
		String regx = "[A-Za-z]+[A-Za-z0-9]+@[a-z]*\\.(com|org|net)";
		if(!email.matches(regx)) {
			throw new InvalidInputException("Invalid Email!");
		}
		
		return email;
		
	}
	
	public static Customer validateLogin(Map<String, Customer>mp,String email,String password)throws InvalidInputException {
		validateEmail(email);
		if(mp.containsValue(email)) {
			throw new InvalidInputException("Customer already exists!");
		}
		
		 for(Customer c: mp.values()) {
			 if(c.getEmail().equals(email) && c.getPassword().equals(password)) {
				 return c;
				
			 }
		 }
		 
		 throw new InvalidInputException("Invalid Password!");
		 
		 
	}
	
	public static void changePassword(Map<String, Customer>mp,String email,String oldPassword,String newPassword) throws InvalidInputException {
		Customer c = validateLogin(mp, email, oldPassword);
		c.setPassword(newPassword);
		System.out.println("Change Password Successfully");
		
	}
	
	public static double validatePlan(double price) throws InvalidInputException {
		for(Plan p : Plan.values()) {
			if(p.getPrice() == price) {
				return price;
			}
		}
		
		
		throw new InvalidInputException("Plan amount does not match!");
	}
	
	
	public static LocalDate parseLocalDate(String regDate) throws InvalidInputException {
	
		
		if(LocalDate.parse(regDate).isBefore(LocalDate.now())) {
			throw new InvalidInputException("Registration date should be today or future date");
		}
		
		return LocalDate.parse(regDate);
		
	}
	
	public static String validatePhoneNo(String phno)throws InvalidInputException {
		String regx = "[0-9]+{10}";
		if(!phno.matches(regx)) {
			throw new InvalidInputException("Phone number should contain only 10 numbers");
		}
		
		return phno;
	}
	/*
	 * String firstName, String lastName, String email, String password, String address,
			LocalDate registerDate,LocalDate planEndDate, String phoneNo, Plan plan,double finalAmount
	 */
	public static Customer validateAllRules(String firstName,String lastName,String email,String password, String address,
			String registerDate,String phoneNo, String plan,double finalAmount,Map<String,Customer> mp)throws InvalidIdException,InvalidInputException {
		
		return new Customer(firstName,lastName,validateEmail(email),password,address,parseLocalDate(registerDate),validatePhoneNo(phoneNo),Plan.valueOf(plan.toUpperCase()),validatePlan(finalAmount));
		
				
	}

}
