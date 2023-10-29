package com.tester;

import java.util.Scanner;

import com.code.Person;

public class TestPerson {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person p  = new Person(sc.next(),sc.nextInt(),sc.next());
		
		
		System.out.println(p.getName()+ "\n" + p.getAge() + "\n" + p.getCity());
		System.out.println("Enter City name: ");
		p.setCity(sc.next());
		System.out.println(p);
		
		
	}

}
