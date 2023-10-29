package com.tester;

import java.util.Scanner;

import com.code.Point2D;

public class TestPoint2D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Point2D[] point = new Point2D[5];
		int index = 0;
		while(true) {
		System.out.println("1.Show all\n2. Add new");
		System.out.println("Enter choice: ");
		switch(sc.nextInt()) {
		case 1:
			for(Point2D p: point) {
				System.out.println(p);
			}
			break;
		case 2:
			if(index < point.length) {
				point[index] = new Point2D(sc.nextDouble(),sc.nextDouble());
				index++;
			}
			
			else System.out.println("Array out of bound");
			break;
		}
		}
		
		
		
	}

}
