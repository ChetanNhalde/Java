package com.code;

public enum Plan {

	MONTHLY(3000,1),
	QUATERLY(11700,3),
	HALFYEAR(17500,6),
	YEARLY(32000,12);
	
	private double price;
	private long period;
	
	
	public double getPrice() {
		return price;
	}
	
	public long getPeriod() {
		return period;
	}

	
	


	public void setPrice(int price) {
		this.price = price;
	}



	Plan(int price,int period) {
		this.price = price;
		this.period = period;
	}
}
