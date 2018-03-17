package com.springemployeecw.repositories;

import com.springemployeecw.models.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
}
