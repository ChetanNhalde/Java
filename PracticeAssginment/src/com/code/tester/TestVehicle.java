package com.code.tester;

import com.code.Car;
import com.code.Truck;
import com.code.Vehicle;


public class TestVehicle {
	public static void main(String[] args) {
		Vehicle[] vehicle = new Vehicle[2];
		vehicle[0] = new Car();
		vehicle[1] = new Truck();
		
		for(Vehicle v: vehicle) {
			if(v instanceof Car c) {
				((Car)v).engine();
			}
			
			else ((Truck)v).engine();
		}
	
	
	
	}
	
	
	
}
