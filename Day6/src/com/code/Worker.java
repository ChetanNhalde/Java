package com.code;

public class Worker extends Employee{
    private int hoursWorked;
    private int hourlyRate;

    public Worker() {
        super();
        hoursWorked = 0;
        hourlyRate = 0;
    }

    public Worker(String empName,int deptId,double basicSalary,int hoursWorked,int hourlyRate) {
        super(empName, deptId, basicSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public double netSalary() {
        return getBasicSalary()+(hoursWorked*hourlyRate);
    }

    @Override
    public String toString() {
        return "Worker{" +
                super.toString() +
                "hoursWorked=" + hoursWorked +
                ", hourlyRate=" + hourlyRate +
                ", Net Salary=" + netSalary() +
                '}';
    }
}
