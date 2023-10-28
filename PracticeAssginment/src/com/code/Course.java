package com.code;

public enum Course {
	PGDAC(95000),
	DBDA(90000),
	DITISS(85000);
	
	private double fees;
	Course(double fees) {
		this.fees = fees;
	}
	public double getFees() {
		return fees;
	}

	
}
