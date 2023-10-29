package com.code;

public class Complex {
	
	private int real;
	private String imag;
	
	
	
	public Complex() {
		this.real = 0;
		this.imag = "";
	}



	public Complex(int real, String imag) {
		
		this.real = real;
		this.imag = imag;
	}



	public int getReal() {
		return real;
	}



	public void setReal(int real) {
		this.real = real;
	}



	public String getImag() {
		return imag;
	}



	public void setImag(String imag) {
		this.imag = imag;
	}



	@Override
	public String toString() {
		return "Complex [real=" + real + ", imag=" + imag + "]";
	}
	
	
	
	

}
