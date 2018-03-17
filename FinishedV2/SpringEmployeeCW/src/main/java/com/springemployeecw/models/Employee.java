package com.springemployeecw.models;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer empID;

    @Version
    private Integer version;

    private String empName;
    private double empHourlyRate;
    private double empWeeklyHours;

    public Employee(String empName, double empHourlyRate, double empWeeklyHours) {
        this.empName = empName;
        this.empHourlyRate = empHourlyRate;
        this.empWeeklyHours = empWeeklyHours;
    }

    public Employee(){}
    
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
    
    public Integer getEmpID() {

        return empID;
    }

    public void setEmpID(Integer empID) {

        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getEmpHourlyRate() {
        return empHourlyRate;
    }

    public void setEmpHourlyRate(double empHourlyRate) {
        this.empHourlyRate = empHourlyRate;
    }

    public double getEmpWeeklyHours() {
        return empWeeklyHours;
    }

    public void setEmpWeeklyHours(double empWeeklyHours) {
        this.empWeeklyHours = empWeeklyHours;
    }
    
}
