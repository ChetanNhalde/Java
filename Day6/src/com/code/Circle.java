package com.code;

public class Circle extends Shape{
    private int r;
    public Circle() {
        this.r = 0;
    }
    public Circle(int x,int y,int r) {
        super(x,y);
        this.r = r;
    }
public double area(){
    return 3.14*r*r;
}
@Override
public String toString(){
        return "R: " + r + ", Area of Circle: " + area();
}
}
