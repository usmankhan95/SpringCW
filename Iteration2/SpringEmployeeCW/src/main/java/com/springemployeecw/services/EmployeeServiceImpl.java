package com.springemployeecw.services;

import com.springemployeecw.models.Employee;
import com.springemployeecw.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository empRepo;
    
    @Autowired
    public void setEmpRepo(EmployeeRepository empRepo){
        this.empRepo = empRepo;
    }
    @Override
    public Iterable<Employee> showAllEmployees(){
        return empRepo.findAll();
    }
    @Override
    public Employee getEmp(Integer empID){
        return empRepo.findById(empID).orElse(null);
    }
    @Override
    public Employee saveEmp(Employee emp){
        return empRepo.save(emp);
    }
    @Override
    public void deleteEmp(Integer empID){
        empRepo.deleteById(empID);
    }

}
