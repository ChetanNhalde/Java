package Tester;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import static utils.StudentCollectionUtils.*;

import com.app.core.Address;
import com.app.core.Student;
import com.app.core.Subject;

import static utils.IOUtils.*;


public class TestStudent {
	public static void main(String[] args) {
		List<Student> ls = populateList();
		Map<String, Student> mp  = populateMap(ls);
		String file = "student.ser";
		try(Scanner sc = new Scanner(System.in)) {
			boolean exit = false;
			while(!exit) {
				System.out.println("1. Student Admission\n"
						+ "2. Display all student details\n"
						+ "3. Cancel Admission\n"
						+ "4. Find out specific student's details\n"
						+ "0. Exit");
				System.out.println("Enter your Choice: ");
				switch(sc.nextInt()) {
				case 1: 
					System.out.println("Enter your  rollNo,  name,  dob,  subject,  gpa");
					Student s = new Student(sc.next(),sc.next(),LocalDate.parse(sc.next()),Subject.valueOf(sc.next().toUpperCase()),sc.nextDouble());
					s.assignAddress(new Address(sc.next(),sc.next(),sc.next()));
					mp.put(s.getRollNo(), s);
					sc.nextLine();
					storeStudentDetails(mp,file);
					System.out.println("Student Stored Succesfully");
					break;
				case 2:
					System.out.println("All Students Details : ");
					mp.forEach((k, v) -> System.out.println(v));
					break;
					
				case 3:
					System.out.println("Enter roll no: ");
					mp.values().removeIf(i -> i.getRollNo().equals(sc.next()));
					break;
					
				case 4:
					System.out.println("Enter roll no: ");
					mp.values().stream().filter(i -> i.getRollNo().equals(sc.next())).forEach(System.out::println);
					break;
					
				case 0:
					System.out.println();
					mp = readStudentDeatils(file);
					System.out.println("Stored Successfully!");
					exit = true;
					break;
				}
			}
		}
	}

}
