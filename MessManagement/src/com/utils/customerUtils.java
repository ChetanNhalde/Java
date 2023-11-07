package com.utils;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import com.code.Customer;
import com.code.Plan;

public class customerUtils {
	
	
	public static Map<String,Customer> populateCustomer(){
		Map<String,Customer> mp = new HashMap<>();
//		String firstName, String lastName, String email, String password, String address,
//		LocalDate registerDate,String phoneNo, Plan plan,double finalAmount
		mp.put("ojas@gmail.com", new Customer("Ojas","Patil","ojas@gmail.com","ojas","jalgaon",LocalDate.parse("2023-06-10"),"8888432110",Plan.MONTHLY,3000));
		mp.put("tejas@gmail.com", new Customer("Tejas","Sawalkar","tejas@gmail.com","tejas","pune",LocalDate.parse("2023-04-20"),"8888432110",Plan.YEARLY,32000));
		mp.put("prathmesh@gmail.com", new Customer("Prathmesh","Satpute","prathmesh@gmail.com","prathmesh","jalgaon",LocalDate.parse("2023-08-12"),"8888432110",Plan.QUATERLY,11700));
		mp.put("udit@gmail.com", new Customer("Udit","Gupta","udit@gmail.com","udit","akurdi",LocalDate.parse("2023-09-21"),"8888432110",Plan.HALFYEAR,17500));
		
		return mp;
	}

}
