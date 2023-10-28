package com.code.tester;

public class TestTwoNumbers {
	public static void main(String[] args) {
		try {
		if(args.length<2) {
			throw new IllegalArgumentException("User should enter two numbers");
		}
		
		 double num1 = Double.parseDouble(args[0]);
         double num2 = Double.parseDouble(args[1]);

         double result = num1 / num2;
         System.out.println("The result is: " + result);
		}
         
         catch(Exception e) {
        	 System.out.println(e);
         }
	}
}
