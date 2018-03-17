package com.springemployeecw.services;

import com.springemployeecw.models.Employee;

public interface EmployeeService {
    
    Iterable<Employee> showAllEmployees();

    Employee getEmp(Integer empID);

    Employee saveEmp(Employee employee);

    void deleteEmp(Integer empID);
    
}
