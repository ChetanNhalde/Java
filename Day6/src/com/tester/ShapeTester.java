package com.tester;
import com.code.*;

import java.util.Scanner;

import static java.lang.System.exit;

public class ShapeTester{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape[] s = new Shape[5];
        int index = 0;
        int choice;
        do{
            System.out.println("1.Show All\n2.Add Circle\n3.Add Rectangle\n4.Add Square\n5.Exit");
            System.out.println("Enter Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for(Shape a: s) {
                        if(a!=null) {
                            System.out.println(a);
                            a.area();

                            if(a instanceof Circle) {
                                Circle c = (Circle) a;
                                c.area();
                            }

                            if(a instanceof Rectangle) {
                                ((Rectangle) a).area();
                            }

                            if(a instanceof Square) {
                                ((Square) a).area();
                            }
                        }
                    }
                    break;
                case 2:
                    if(index < s.length) {
                        System.out.println("Enter Radius of circle: ");
                        s[index] = new Circle(10,10,sc.nextInt());
                        index++;
                    }
                    else {
                        System.out.println("Array is Full!");
                    }
                    break;
                case 3:
                    if(index < s.length) {
                        System.out.println("Enter Length and Breadth of Rectangle: ");
                        s[index] = new Rectangle(10,10,sc.nextInt(),sc.nextInt());
                        index++;
                    }
                    else{
                        System.out.println("Array is Full!");
                    }
                    break;

                case 4:
                    if(index<s.length) {
                        System.out.println("Enter side of Square: ");
                        s[index] = new Square(10,10,sc.nextInt());
                        index++;
                    }
                    else {
                        System.out.println("Array is Full!");
                    }
                    break;
                case 5:
                    exit(0);
                    break;
                default:
                    System.out.println("Enter Wrong Choice!");
                    break;
            }

        }while(choice != 5);
    }
}
