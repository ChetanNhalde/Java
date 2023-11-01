package com.code.tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import static com.custom_exception.ValidateRules.validateAllRules;
import com.code.Student;

import com.utils.InvalidInputException;

public class StudentManagmentSystem {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			List<Student> students = new ArrayList<>();
			boolean exit = false;
			while(!exit) {
				System.out.println("1.Sign Up\n2.Sign in\n3.Change Password\n4.Unsubscribe Student\n5.Display all Students\n6.Sort Student as per Email\n7.Sort as per dob\n0.Exit");
				System.out.println("Enter Choice: ");
				try {
				
				switch(sc.nextInt()) {
					case 1:
						System.out.println("Enter PRN, FirstName, LastName, DOB,Course,email,password");
						Student s = validateAllRules(sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),students);
						students.add(s);
						System.out.println("Student added successfully");
						break;
					
					case 2:
						for(Student stu: students) {
							System.out.println(stu);
							
						}
						break;
						
					case 3:
						Collections.sort(students);
						break;
						
					case 4:
						Collections.sort(students,new Comparator<Student>() {
							@Override
							public int compare(Student c1,Student c2) {
								return c1.getDob().compareTo(c2.getDob());
							}
						});
						break;
						
					case 5:
						System.out.println("Enter Email and Password");
						boolean removed = students.remove(new Student(sc.next()));
						if(removed) {
							System.out.println("Student has been removed");
						}
						else
							throw new InvalidInputException("Student details can't be removed: Invalid Email!!");
						break;
					case 0:
						exit = true;
						break;
					
				}
				}catch(Exception e) {
					System.out.println(e);
				}
			}
		}

	}

}
