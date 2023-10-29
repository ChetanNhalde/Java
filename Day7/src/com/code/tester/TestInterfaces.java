package com.code.tester;

import java.util.Scanner;
public class TestInterfaces {
	interface Myinterface1{
		public void Method1();
	}
	
	interface Myinterface2{
		public void Method2();
	}
	
	interface Myinterface3{
		public void Method3();
	}
	
	interface Myinterface4{
		public void Method4();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Myinterface1 ref1=()->{
			 System.out.println("Method1");
		};
		
		Myinterface2 ref2 = ()->{
			System.out.println("Addition: " + (sc.nextInt()+ sc.nextInt()));
		};
		
		Myinterface3 ref3 = ()->{
			System.out.println("Subtraction: " + (sc.nextInt()- sc.nextInt()));
		};
		
		Myinterface4 ref4 = ()->{
			System.out.println("Multiplication: " + (sc.nextInt()* sc.nextInt()));
		};
		
		ref1.Method1();
		ref2.Method2();
		ref3.Method3();
		ref4.Method4();
	}

}
