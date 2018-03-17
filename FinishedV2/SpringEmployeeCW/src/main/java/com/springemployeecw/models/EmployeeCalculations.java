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
    
    public double getTotalWeeklyWage(List<Employee> employeeList){
        double total = 0;
        for(Employee e : employeeList){
            total += getWeeklyWage(e.getEmpHourlyRate(),e.getEmpWeeklyHours());
        }
        return Math.round(total*100.0)/100.0;
    }

    public double getEmpAverage(List<Employee> employeeList){
        double allEmpWages = 0;
        for (Employee e : employeeList){
            allEmpWages += (getWeeklyWage(e.getEmpHourlyRate(),e.getEmpWeeklyHours()));
        }
        double output = allEmpWages/employeeList.size();
        return Math.round(output*100.0)/100.0;
    }

    public double getEmpMax(List<Employee> employeeList){

        List<Double> empTotalWeeklyWage = totalWeeklyWage(employeeList);
        return Math.round(Collections.max(empTotalWeeklyWage)*100.0)/100.0;

    }

    public double getEmpMin(List<Employee> employeeList){
        List<Double> empTotalWeeklyWage = totalWeeklyWage(employeeList);
        return Math.round(Collections.min(empTotalWeeklyWage)*100.0)/100.0;
    }
    
    public List<Employee> convertToList(Iterable<Employee> employeeList){
        List<Employee> convertToList = new ArrayList();
        employeeList.forEach(convertToList::add);
        return convertToList;
    }
}
