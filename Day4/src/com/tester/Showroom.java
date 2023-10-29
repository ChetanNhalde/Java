package com.tester;


import java.util.Scanner;

import com.code.Vehicle;

public class Showroom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Vehicle[] vehicles = new Vehicle[10];
		int index = 0;
		while(true) {
			System.out.println("1.Show all\n2. add Vehicle\n3. Edit Color\n 4. Edit Price\n5. Remove");
			System.out.println("Enter choice: ");
			switch(sc.nextInt()) {
			case 1:
				for(Vehicle v : vehicles) System.out.println(v);
				break;
			case 2:
				if(index < vehicles.length) {
					vehicles[index] = new Vehicle(sc.nextInt(),sc.next(),sc.next(),sc.nextDouble());
					index++;
				}
				else System.out.println("Array out of Bound");
				break;
				
			case 3:
				System.out.println("Enter the index and color: ");
				vehicles[sc.nextInt()].setColor(sc.next());
				break;
				
			case 4:
				System.out.println("Enter index and price: ");
				vehicles[sc.nextInt()].setPrice(sc.nextDouble());
				break;
			
				
			case 5:
				System.err.println("Enter index: ");
				vehicles[sc.nextInt()] = null;
				break;
			}
		}
	}

}
