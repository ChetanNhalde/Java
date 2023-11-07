package com.tester;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;



import static com.utils.customerUtils.populateCustomer;
import static com.utils.ValidatateRules.*;
import com.code.Customer;

public class MessManagement {
	
	public static void main(String[] args) {
		Map<String,Customer> mp = populateCustomer();
		Iterator<Entry<String, Customer>> iterator = mp.entrySet().iterator();
		try(Scanner sc = new Scanner(System.in)) {
			boolean exit = false;
			String file = "student.ser";
			while(!exit) {
				/*
				 * 1. Sign up Customer
2. If already register then sign in
3. Change Password  
4. Sort Customer as per 
A) First name 
B) According to plan
C) According to date of registration
(Imperative/Declarative way)
5. Unsubscribe customer according plan duration (month wise (1, 3, 6, 12))
6. Display all Customers
7) Modify all customers first name (make first Letter capital of customers first name)
8) Display email addresses of the customers who did registration in month of January
10) Display count of the Customers who have register for plan: Monthly
11) Search the Customer who lived in Akurdi.
12) Give the 20% discount to the customers who have selected plan for 1 year.

				 */
				System.out.println("1.Sign up\n2.Sign in\n3.Change Password\n4.Sort as per first name\n"
						+ "5.Sort as per plan\n6.Sort as per date of registration"
						+ "\n7.Unsbscribe Customer\n8.Display all customer"
						+ "\n9.Modify Customers first name\n10.Display email who registered in january\n"
						+ "11.Display count customers who have register for monthly plan\n"
						+ "12.Search Customer\n0.20% Discount for 1 year pla\n13.Exit");
				System.out.println("Enter your choice: ");
				try {
				switch(sc.nextInt()) {
				case 1:
					/*
					 * String firstName, String lastName, String email, String password, String address,
							LocalDate registerDate, String phoneNo, Plan plan,double finalAmount
					 */
					System.out.println("Enter String firstName, String lastName, String email, String password, String address,\r\n"
							+ "							LocalDate registerDate, String phoneNo, Plan plan,double finalAmount");
					storeDetails(mp,file);
					Customer c = validateAllRules(sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),mp);
					mp.put(c.getEmail(), c);
					System.out.println("Customer added!");
					break;
					
				case 2:
					System.out.println("Enter your email and password");
					c  = validateLogin(mp, sc.next(), sc.next());
					System.out.println(c);
					break;
					
				case 3:
					changePassword(mp, sc.next(), sc.next(), sc.next());
					break;
					
				case 4:
					mp.values().stream().sorted((a,b) -> a.getFirstName().compareTo(b.getFirstName())).forEach(System.out::println);
					break;
					
				case 5:
					mp.values().stream().sorted((a,b) -> a.getPlan().compareTo(b.getPlan())).forEach(System.out::println);
					break;
					
				case 6:
					mp.values().stream().sorted((a,b) -> a.getRegisterDate().compareTo(b.getRegisterDate())).forEach(System.out::println);
					break;
					
				case 7:
					long month = sc.nextLong();
					
					while(iterator.hasNext()) {
						if(iterator.next().getValue().getPlan().getPeriod() == month) {
							iterator.remove();
						}
					}
					System.out.println("Removed");
					break;
					
				case 8:
					mp.values().stream().forEach(System.out::println);
					break;
					
				case 9:
					mp.values().stream().map(i -> i.getFirstName().substring(0, 1).toUpperCase()+i.getFirstName().substring(1));
					break;
					
				case 10:
					mp.values().stream().filter(i -> i.getRegisterDate().getMonth().equals("11")).forEach(System.out::println);
					break;
					
				case 11:
					System.out.println(mp.values().stream().filter(i -> i.getPlan().getPeriod() == 1).count());
					break;

					
				case 12:
					mp.values().stream().filter(i -> i.getAddress().equals(sc.next())).forEach(System.out::println);
					break;
					
				case 13:
					mp.values().stream().filter(i -> i.getPlan().getPeriod() == 12).forEach(i -> i.setFinalAmount(i.getPlan().getPrice()*0.20));
					break;
					
				case 0:
					exit  = true;
					break;
					
				}
				
				}catch (Exception e) {
					sc.nextLine();
					// TODO: handle exception
					e.printStackTrace();
				}
				
			}
		}
		
		
	}

}
