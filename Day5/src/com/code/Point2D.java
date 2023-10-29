package com.code;
import java.lang.Math;

public class Point2D {
	
	private double x;
	private double y;
	
	
	public Point2D(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	


	public double getX() {
		return x;
	}




	public void setX(double x) {
		this.x = x;
	}




	public double getY() {
		return y;
	}




	public void setY(double y) {
		this.y = y;
	}




	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}
	
	
	public boolean isEquals(Point2D p2) {
		if(this.x == p2.getX() && this.y == p2.getY()) return true;
		else return false;
	}
	
	
	public double calculateDistance(Point2D p2) {
		return Math.sqrt(((p2.getX() - this.x) * (p2.getX() - this.x)) + ((p2.getY() - this.y) * (p2.getY() - this.y)));
	}
	
	
	

}
