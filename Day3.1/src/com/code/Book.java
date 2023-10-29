package com.code;

public class Book {
	
	private String bName;
	private int id;
	private String author;
	private double price;
	
	
	
	
	
	
	
	public Book() {
		this.bName = "";
		this.id = 0;
		this.author = "";
		this.price = 0.0;
	}
	
	public Book(String bName, int id, String author, double price) {
		
		this.bName = bName;
		this.id = id;
		this.author = author;
		this.price = price;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bName=" + bName + ", id=" + id + ", author=" + author + ", price=" + price + "]";
	}
	
	
	
	
	

}
