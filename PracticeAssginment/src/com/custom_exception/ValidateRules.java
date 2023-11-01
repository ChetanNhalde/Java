package com.custom_exception;

import java.time.LocalDate;
import java.util.List;

import com.code.Course;
import com.code.Student;
import com.utils.InvalidInputException;

public class ValidateRules {
	
	public static String validateEmail(String email,List<Student> customers)throws InvalidInputException {
		String regx = "[a-z]+[a-z0-9]+@[a-z]*\\.(com|org|net)";
		if(!email.matches(regx)) throw new InvalidInputException("Email should be in proper format");
		Student newCustomer = new Student(email);
		if(customers.contains(newCustomer)) {
			throw new InvalidInputException("Customer already exists");
		}
		return email;
		
	}

	
	public static LocalDate validateDob(String dob)throws InvalidInputException {

		if(LocalDate.parse(dob).isBefore(LocalDate.parse("1985-01-01"))) {
			throw new InvalidInputException("Date of should be after 01 Jan 1985");
		}
		else 
			return LocalDate.parse(dob);
	}
	
	public static Student signIn(String email,String password,List<Student> customers)throws InvalidInputException {
		int index = customers.indexOf(new Student(email));
		if(index == -1) throw new InvalidInputException("Invalid Email!");
		Student c = customers.get(index);
		if(!c.getPassword().equals(password)) throw new InvalidInputException("Invalid Password");
		
		return c;
		
	}
	
	public static void changePassword(String email,String oldPassword,String newPassWord,List<Student> customers)throws InvalidInputException {
		
		Student c = signIn(email, oldPassword, customers);
		c.setPassword(newPassWord);
		System.out.println("Password changed successfully");
	}
	
	public static Course validateCourse(String course)throws IllegalArgumentException {
		return Course.valueOf(course.toUpperCase());
	}
	
	
	public static LocalDate parseDate(String date) {
		return LocalDate.parse(date);
	}
	
	
	public static Student validateAllRules(String prn,String firstName,String lastName,String dob,String email,String password,String course,List<Student> students)throws InvalidInputException, IllegalArgumentException {
		
		return new Student(prn,firstName,lastName,validateDob(dob),validateCourse(course),validateEmail(email, students),password,true);
		
	}
	
}
