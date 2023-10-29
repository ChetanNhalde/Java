package com.code;

public class Rectangle extends Shape {

    private int l;
    private int b;

    public Rectangle(int x,int y,int l,int b) {
        super(x,y);
        this.l = l;
        this.b = b;
    }
    public double area() {
        return l*b;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "l=" + l +
                ", b=" + b + ", Area: " + area() +
                '}';
    }
}
