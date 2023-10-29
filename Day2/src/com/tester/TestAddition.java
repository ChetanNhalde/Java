package com.tester;

import java.util.Scanner;

import com.code.MathOperation;

public class TestAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		MathOperation math = new MathOperation();
		
		System.out.println("Addtion of two int: "+ math.add(sc.nextInt(), sc.nextInt()));
		System.out.println("Addtion of two float: "+ math.add(sc.nextFloat(), sc.nextFloat()));
		System.out.println("Addtion of two double: "+ math.add(sc.nextDouble(), sc.nextDouble()));
		System.out.println("Addtion of ints: "+ math.add(1,2,3,4,5));
	}

}
