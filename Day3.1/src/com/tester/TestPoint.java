package com.tester;

import java.util.Scanner;

import com.code.Point;

public class TestPoint {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Point p = new Point(sc.nextInt(),sc.nextInt());
		
		System.out.println(p.getX() + "\n" + p.getY());
		
		System.out.println("Enter Y: ");
		p.setY(sc.nextInt());
		System.out.println(p);
		
	}
	
	
	
}
