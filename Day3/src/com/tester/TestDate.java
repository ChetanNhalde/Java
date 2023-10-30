package com.tester;

import java.util.Scanner;

import com.code.Date;

public class TestDate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date d = new Date(sc.nextInt(),sc.nextInt(),sc.nextInt());
		System.out.println(d.getDd()+"\n"+d.getMm()+"\n"+d.getYy());
		System.out.println("Enter Month");
		d.setMm(sc.nextInt());
		System.out.println(d);
		
	}

}
