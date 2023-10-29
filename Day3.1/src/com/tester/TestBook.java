package com.tester;

import java.util.Scanner;

import com.code.Book;

public class TestBook {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Book b = new Book(sc.next(),sc.nextInt(),sc.next(),sc.nextDouble());
		
		System.out.println(b.getId()+ "\n" + b.getAuthor()+ "\n" +b.getbName()+"\n"+b.getPrice());
		System.out.println("Enter book name: ");
		b.setbName(sc.next());
		System.out.println(b);
	}

}
