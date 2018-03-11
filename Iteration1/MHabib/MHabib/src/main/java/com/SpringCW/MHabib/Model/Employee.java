package com.SpringCW.MHabib.Model;

public class Employee {
    
    private String empName;
    private int empID;
    private float empHours;
    private float empWage;

    public Employee(String empName, int empID, float empHours, float empWage) {
        this.empName = empName;
        this.empID = empID;
        this.empHours = empHours;
        this.empWage = empWage;
    }
    
    public Employee(){}
    
    public String getEmpName() {
        return empName;
    }

    public int getEmpID() {
        return empID;
    }

    public float getEmpHours() {
        return empHours;
    }

    public float getEmpWage() {
        return empWage;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void setEmpHours(float empHours) {
        this.empHours = empHours;
    }

    public void setEmpWage(float empWage) {
        this.empWage = empWage;
    }
    
}
