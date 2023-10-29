package com.tester;

import java.util.Scanner;

import com.code.Complex;

public class TestComplex {
	
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		Complex c = new Complex(sc.nextInt(),sc.next());
		
		System.out.println(c.getReal() + "\n" + c.getImag());
		
		System.out.println("Enter real: ");
		c.setReal(sc.nextInt());
		System.out.println(c);
	}

}
