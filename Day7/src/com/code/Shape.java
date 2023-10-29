package com.code;

import com.interfaces.Printable;

public abstract class Shape implements Printable {
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
    
    public void print() {
    	System.out.println("Shape is visible");
    }


}
