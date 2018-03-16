package com.springemployeecw;

import com.springemployeecw.models.Employee;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestHelper {

    static List<Employee> getTestList(){
        List<Employee> employeeList = new ArrayList<>();
        Employee employee1 = new Employee("Test1",10.50,40);
        Employee employee2 = new Employee("Test2",9.50,40);
        Employee employee3 = new Employee("Test3",8.50,40);
        employeeList.addAll(Arrays.asList(employee1,employee2,employee3));
        return employeeList;
    }
}
