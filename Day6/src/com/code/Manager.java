package com.code;

public class Manager extends Employee{
    private int performanceBonus;

    public Manager() {
        super();
        this.performanceBonus = 0;
    }

    public Manager(String empName,int deptId,double basicSalary,int performanceBonus) {
        super(empName,deptId,basicSalary);
        this.performanceBonus = performanceBonus;
    }

    public int getPerformanceBonus() {
        return performanceBonus;
    }

    public double netSalary() {
        return getBasicSalary()+performanceBonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                super.toString() +
                "performanceBonus=" + performanceBonus +
                "Net Salary: " + netSalary() +
                '}';
    }
}
