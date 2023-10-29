package com.code;

public class Square extends Shape {
    private int s;

    public Square(int x,int y,int s) {
        super(x,y);
        this.s = s;
    }
    public double area() {
        return s*s;
    }

    @Override
    public String toString() {
        return "Square{" +
                "s=" + s + ", Area: " + area() +
                '}';
    }
}
