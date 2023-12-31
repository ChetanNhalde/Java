package com.code;

public class Vehicle {
	
	private int id;
	private String name;
	private String color;
	private double price;
	private static double discount;
	
	static {
		discount = 25000;
	}
	
	
	public Vehicle(int id, String name, String color, double price) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.price = price;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public static double getDiscount() {
		return discount;
	}


	public static void setDiscount(double discount) {
		Vehicle.discount = discount;
	}


	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", name=" + name + ", color=" + color + ", price=" + price + "Discount=" + discount + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

}
