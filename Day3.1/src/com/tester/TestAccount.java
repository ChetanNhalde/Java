package com.tester;

import java.util.Scanner;

import com.code.BankAccount;

public class TestAccount {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BankAccount b = new BankAccount(sc.nextInt(), sc.next(), sc.nextDouble());
		
		b.withDraw(sc.nextDouble());
		b.deposit(sc.nextDouble());
		System.out.println(b);
		
	}
}
