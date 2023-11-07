package com.utils;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Map;

import com.code.Customer;

public interface IOUtils {
	
	static void readDetails(Map<String,Customer>mp,String fname) {
		
		try(ObjectInputStream = new ObjectInputStream(new FileInputStream(fname))){
			
		}
		
	}
	

}
