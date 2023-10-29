package com.code;

public class Date {
	private int dd;
	private int mm;
	private int yy;
	
	
	
	public Date() {
		this.dd = 0;
		this.mm = 0;
		this.yy = 0;
	}



	public Date(int dd, int mm, int yy) {
		
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}



	public int getDd() {
		return dd;
	}



	public void setDd(int dd) {
		this.dd = dd;
	}



	public int getMm() {
		return mm;
	}



	public void setMm(int mm) {
		this.mm = mm;
	}



	public int getYy() {
		return yy;
	}



	public void setYy(int yy) {
		this.yy = yy;
	}



	@Override
	public String toString() {
		return "Date [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}
	
	
	
	
	
	

}
