package com.springemployeecw.models;

import java.util.*;

public class EmployeeCalculations {

    public double getWeeklyWage(double hourlyRate, double weeklyHours){
        return hourlyRate*weeklyHours;
    }

    private List<Double> totalWeeklyWage(List<Employee> employeeList){
        List<Double> empTotalWeeklyWage = new ArrayList<>();
        for(Employee e : employeeList){
            empTotalWeeklyWage.add(getWeeklyWage(e.getEmpHourlyRate(),e.getEmpWeeklyHours()));
        }
        return empTotalWeeklyWage;
    }

    public double getEmpAverage(List<Employee> employeeList){
        double allEmpWages = 0;
        for (Employee e : employeeList){
            allEmpWages += (getWeeklyWage(e.getEmpHourlyRate(),e.getEmpWeeklyHours()));
        }
        return allEmpWages/employeeList.size();
    }

    public double getEmpMax(List<Employee> employeeList){

        List<Double> empTotalWeeklyWage = totalWeeklyWage(employeeList);
        return Collections.max(empTotalWeeklyWage);

    }

    public double getEmpMin(List<Employee> employeeList){
        List<Double> empTotalWeeklyWage = totalWeeklyWage(employeeList);
        return Collections.min(empTotalWeeklyWage);
    }
}
