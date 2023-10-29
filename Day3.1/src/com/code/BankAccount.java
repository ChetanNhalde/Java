package com.code;

public class BankAccount {
	
	private int actNo;
	private String customerName;
	private double balance;
	
	
	public BankAccount(int actNo, String customerName, double balance) {

		this.actNo = actNo;
		this.customerName = customerName;
		this.balance = balance;
	}
	
	public void withDraw(double amount) {
		this.balance = (balance-amount);
		System.out.println("Current Balance: " + balance);
		
	}
	
	public void deposit(double amount) {
		this.balance = (balance+amount);
		System.out.println("Current Balance: " + balance);
		
	}

	@Override
	public String toString() {
		return "BankAccount [actNo=" + actNo + ", customerName=" + customerName + ", balance=" + balance + "]";
	}
	
	
	
	
	

}
