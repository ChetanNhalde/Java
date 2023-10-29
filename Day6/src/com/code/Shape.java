package com.code;

public abstract class Shape {
    private int x;
    private int y;

    public Shape(){
        this.x = 0;
        this.y = 0;
    }
    public Shape(int x,int y) {
        this.x = x;
        this.y = y;
    }
    public abstract double area();

    public String toString(){
        return "X:" + x + "Y:" + y;
    }


}
