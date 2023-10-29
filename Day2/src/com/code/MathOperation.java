package com.code;

public class MathOperation {
	public int add(int a,int b) {
		return a+b;
	}
	
	public float add(float a, float b) {
		return a+b;
	}
	
	public double add(double a, double b) {
        return a + b;
    }

 
    public int add(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

}
