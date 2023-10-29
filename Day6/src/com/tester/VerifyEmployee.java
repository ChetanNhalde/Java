package com.tester;
import com.code.Employee;
import com.code.Manager;
import com.code.Worker;

import java.util.Scanner;

import static java.lang.System.exit;

public class VerifyEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] emp = new Employee[5];
        int choice,index=0;
        do{
            System.out.println("1.Hire Manager\n2.Hire Worker\n3.Show Employee\n4.Exit");
            System.out.println("Enter Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (index<emp.length) {
                        System.out.println("Enter name,deptNo,salary,performance bonus");
                        emp[index] = new Manager(sc.next(),sc.nextInt(),sc.nextDouble(),sc.nextInt());
                        index++;
                    }
                    else {
                        System.out.println("Array is Full");
                    }
                    break;
                case 2:
                    if(index<emp.length) {
                        System.out.println("Enter name,deptNo,salary,hours worked,hourly rate");
                        emp[index] = new Worker(sc.next(),sc.nextInt(),sc.nextDouble(),sc.nextInt(),sc.nextInt());
                        index++;
                    }
                    else {
                        System.out.println("Array is Full");
                    }
                    break;
                case 3:
                    for(Employee e: emp) {
                        if(e != null) {
                            System.out.println(e);
                            e.netSalary();

                            if(e instanceof Manager) {
                                ((Manager) e).netSalary();
                            }

                            if(e instanceof Worker){
                                ((Worker) e).netSalary();
                            }
                        }
                    }
                    break;
                case 4:
                    exit(0);
                    break;
                default:
                    System.out.println("Wrong Choice!");
                    break;
            }

        }while(true);
    }
}
