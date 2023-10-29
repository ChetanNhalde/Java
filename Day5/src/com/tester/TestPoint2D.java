package com.tester;

import java.util.Scanner;

import com.code.Point2D;

public class TestPoint2D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Point2D p1 = new Point2D(sc.nextDouble(),sc.nextDouble());
		
		Point2D p2 = new Point2D(sc.nextDouble(),sc.nextDouble());
		
		System.out.println(p1 + " " + p2);
		
		System.out.println(p1.isEquals(p2));
		
		System.out.println(p1.calculateDistance(p2));
		
		
		
	}

}
