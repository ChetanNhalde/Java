package com.code;

public class Employee {
    private final int empId;
    private static int counter = 1;
    private String empName;
    private int deptId;
    private double basicSalary;

    public Employee() {

        this.empId = counter++;
        this.empName="";
        this.deptId = 0;
        this.basicSalary=0.0;
    }

    public Employee(String empName, int deptId, double basicSalary) {

        this.empId = counter++;
        this.empName = empName;
        this.deptId = deptId;
        this.basicSalary = basicSalary;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                "empName='" + empName + '\'' +
                ", deptId=" + deptId +
                ", basicSalary=" + basicSalary;
    }

    public double netSalary(){
        return 0;
    }
}
