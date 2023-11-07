package com.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import com.code.Customer;

public interface IOUtils {
	
	@SuppressWarnings("unchecked")
	static Map<String,Customer> readCustomerDetails(Map<String,Customer>mp,String fname){ 
		
		try(ObjectInputStream out = new ObjectInputStream(new FileInputStream(fname))){
			return (Map<String,Customer>)out.readObject();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new HashMap<>();
			
		}
		
	}
	
	static void storeCustomerDetails(Map<String,Customer>mp,String fname) {
		try(ObjectOutputStream in = new ObjectOutputStream(new FileOutputStream(fname))) {
			in.writeObject(mp);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	

}
