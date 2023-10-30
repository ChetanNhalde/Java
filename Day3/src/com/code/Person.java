package com.code;

public class Person {
	
//	 Create a class Person with data members as name, age, city. Write getters and setters 
//	for all the data 
//	 members. Also add the display function. Create Default and Parameterized constructors. 
//	Create the 
//	 object of this class in main method and invoke all the methods in that class. 
	
	private String name;
	private int age;
	private String city;
	
	
	
	
	public Person() {
		super();
		this.name = "";
		this.age = 0;
		this.city = "";
	}
	
	public Person(String name, int age, String city) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", city=" + city + "]";
	}
	
	
	
	
	

}
