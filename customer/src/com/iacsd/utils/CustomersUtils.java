package com.iacsd.utils;

import java.util.ArrayList;
import java.util.List;
import static java.time.LocalDate.parse;
import com.iacsd.core.Customer;
import com.iacsd.core.ServicePlan;

public class CustomersUtils {
	
	public static List<Customer> getData() {
		List<Customer> customer = new ArrayList<>();
		customer.add(new Customer("Chetan","Nhalde","nhaldechetan","pass",5000.0,parse("2001-07-13"),ServicePlan.DIAMOND));
		customer.add(new Customer("Ojas","Patil","patilojas","ojas",2000.0,parse("2001-06-10"),ServicePlan.GOLD));
		customer.add(new Customer("Aniket","Kahirnar","kaniket","aniket",10000.0,parse("2001-01-11"),ServicePlan.PLATINUM));
		customer.add(new Customer("Ajinkya","Kokane","kajinkya","ajinkya",2000.0,parse("2001-11-17"),ServicePlan.GOLD));
		return customer;
	
	}

}
