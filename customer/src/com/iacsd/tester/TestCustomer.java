package com.iacsd.tester;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Comparator;
import java.util.HashMap;

import com.iacsd.core.Customer;
import static com.iacsd.utils.CustomersUtils.*;
import com.iacsd.utils.InvalidPlanException;
import static com.iacsd.custom_exception.validateRules.validateAllInputs;
import static com.iacsd.custom_exception.validateRules.signIn;
import static com.iacsd.custom_exception.validateRules.*;


public class TestCustomer {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)) {
				Map<String,Customer> customers = populateData();
				List<Customer> customer = getData();
				
				boolean exit = false;
				while(!exit) {
					System.out.println("1.Sign Up\n2.Sign in\n3.Change Password\n4.Unsubscribe Customer\n5.Display all customer\n6.Sort Customer as per Email\n7.Sort as per dob\n8.Sort as per dob and Lastname\n9.Check Subscription\n0.Exit");
					System.out.println("Enter your choice: ");
				try {
					
					switch(sc.nextInt()) {
					case 1:
						System.out.println("Enter first name, last name,email,password,regDate,registrationAmount,dob,plan\n");
						Customer c = validateAllInputs(sc.next(), sc.next(), sc.next(), sc.next(),sc.next(), sc.nextDouble(), sc.next(), sc.next(),customer);
						System.out.println(c);
						customer.add(c);
						System.out.println("Customer is added!");
						break;
					case 2:
						System.out.println("Enter Email and Password");
//						 c = signIn(sc.next(), sc.next(), customer);
//						 System.out.println(c);
						 Customer cust = signInMap(sc.next(),sc.next(), customers);
						 System.out.println(cust);
						break;
					
					case 3:
						System.out.println("Enter Email, Old Password and New Password");
//						changePassword(sc.next(), sc.next(), sc.next(), customer);
						changePasswordMap(sc.next(), sc.next(), sc.next(), customers);
						break;
					
					case 4:
						System.out.println("Enter Email and Password");
						boolean removed = customer.remove(new Customer(sc.next()));
						if(removed) {
							System.out.println("Customer has been removed");
						}
						else
							throw new InvalidPlanException("Customer details can't be removed: Invalid Email!!");
//						for(Customer custom: customers.values()) {
//							if(custom.getEmail().equals(sc.next()) && custom.getPassword().equals(sc.next())) { 
//								for(Entry<String, Customer> entry : customers.entrySet()) {
//									if(entry.getValue().equals(custom)) {
//										customers.remove(entry.getKey());
//										System.out.println("Customer has been removed");
//									}
//								}
//							}
//						}
						break;
						
					case 5:
						for(Customer cus : customer) {
							System.out.println(cus);
						}
						break;
						
						
					case 6:
						Collections.sort(customer);
						break;
					
					case 7:
						Collections.sort(customer,new Comparator<Customer>() {
							@Override
							public int compare(Customer c1,Customer c2) {
								if(c1.getDob().isBefore(c2.getDob())) {
									return -1;
								}
								else {
									return 1;
								}
							}
						});
						break;
					
					case 8:
						Collections.sort(customer,new Comparator<Customer>() {
							@Override
							public int compare(Customer c1,Customer c2) {
								int ret = c1.getDob().compareTo(c2.getDob());
								if(ret == 0) {
									return c1.getLastName().compareTo(c2.getLastName());
								}
								return ret;
							}
						});
						break;
					case 9:
						validateSubscription(customer);
						break;
					case 0:
						 exit = true;
						 break;
					}
				}catch (Exception e) {
					System.out.println(e);
				}
				}
		
			
		}
		
	}

}
