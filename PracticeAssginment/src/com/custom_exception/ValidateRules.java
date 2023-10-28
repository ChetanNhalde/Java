package com.custom_exception;

import java.time.LocalDate;
import java.util.List;

import com.code.Course;
import com.code.Student;
import com.utils.InvalidInputException;

public class ValidateRules {

	
	public static LocalDate validateDob(String dob)throws InvalidInputException {

		if(LocalDate.parse(dob).isBefore(LocalDate.parse("1985-01-01"))) {
			throw new InvalidInputException("Date of should be after 01 Jan 1985");
		}
		else 
			return LocalDate.parse(dob);
	}
	
	public static Course validateCourse(String course)throws IllegalArgumentException {
		return Course.valueOf(course.toUpperCase());
	}
	
	
	public static LocalDate parseDate(String date) {
		return LocalDate.parse(date);
	}
	
	
	public static Student validateAllRules(String prn,String firstName,String lastName,String dob,String course,List<Student> students)throws InvalidInputException, IllegalArgumentException {
		
		return new Student(prn,firstName,lastName,validateDob(dob),validateCourse(course),true);
		
	}
	
}
