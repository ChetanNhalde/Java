package com.code.tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static com.custom_exception.ValidateRules.validateAllRules;
import com.code.Student;

public class StudentManagmentSystem {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			List<Student> students = new ArrayList<>();
			boolean exit = false;
			while(!exit) {
				System.out.println("1.Accept Student Details\n2.Show Students\n3.exit");
				System.out.println("Enter Choice: ");
				try {
				
				switch(sc.nextInt()) {
					case 1:
						System.out.println("Enter PRN, FirstName, LastName, DOB,Course");
						Student s = validateAllRules(sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),students);
						students.add(s);
						System.out.println("Student added successfully");
						break;
					
					case 2:
						for(Student stu: students) {
							System.out.println(stu);
							
						}
					case 3:
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
