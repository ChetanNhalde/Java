package com.iacsd.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.time.LocalDate.parse;
import com.iacsd.core.Customer;
import com.iacsd.core.ServicePlan;

public class CustomersUtils {
	
	public static List<Customer> getData() {
		List<Customer> customer = new ArrayList<>();
		customer.add(new Customer("Chetan","Nhalde","nhaldechetan@gmail.com","pass",parse("2023-10-10"),5000.0,parse("2001-07-13"),ServicePlan.DIAMOND));
		customer.add(new Customer("Ojas","Patil","patilojas@gmail.com","ojas",parse("2023-07-10"),2000.0,parse("2001-06-10"),ServicePlan.GOLD));
		customer.add(new Customer("Aniket","Kahirnar","kaniket@gmail.com","aniket",parse("2023-06-10"),10000.0,parse("2001-01-11"),ServicePlan.PLATINUM));
		customer.add(new Customer("Ajinkya","Kokane","kajinkya@gmail.com","ajinkya",parse("2023-05-10"),2000.0,parse("2001-11-17"),ServicePlan.GOLD));
		return customer;
	
	}
	
	public static Map<String,Customer> populateData(){
		Map<String,Customer> customer = new HashMap<>();
		customer.put("nhaldechetan@gmail.com",new Customer("Chetan","Nhalde","nhaldechetan@gmail.com","pass",parse("2023-10-10"),5000.0,parse("2001-07-13"),ServicePlan.DIAMOND));
		customer.put("patilojas@gmail.com",new Customer("Ojas","Patil","patilojas@gmail.com","ojas",parse("2023-07-10"),2000.0,parse("2001-06-10"),ServicePlan.GOLD));
		customer.put("kaniket@gmail.com",new Customer("Aniket","Kahirnar","kaniket@gmail.com","aniket",parse("2023-06-10"),10000.0,parse("2001-01-11"),ServicePlan.PLATINUM));
		customer.put("kajinkya@gmail.com",new Customer("Ajinkya","Kokane","kajinkya@gmail.com","ajinkya",parse("2023-05-10"),2000.0,parse("2001-11-17"),ServicePlan.GOLD));
		return customer;
	}

}
