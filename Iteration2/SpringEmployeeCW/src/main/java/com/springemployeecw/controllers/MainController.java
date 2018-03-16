package com.springemployeecw.controllers;

import com.springemployeecw.models.Employee;
import com.springemployeecw.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
    
    private EmployeeService empService;

    @Autowired
    public void setEmpService(EmployeeService empService){
        this.empService = empService;
    }
    @RequestMapping("/")
    String index(){
        return "index";
    }
    @RequestMapping("employee/new")
    public String newEmployee(Model model){
        model.addAttribute("employee", new Employee());
        return "employeeform";
    }

    @RequestMapping(value = "/allemployees", method = RequestMethod.GET)
    public String showAllEmployees(Model model){
        model.addAttribute("allemployees", empService.showAllEmployees());
        return "allemployees";
    }

    @RequestMapping(value = "employee", method = RequestMethod.POST)
    public String saveEmployee(Employee employee){
        empService.saveEmp(employee);
        return "redirect:/employee/" + employee.getEmpID();
    }

    @RequestMapping("employee/edit/{empID}")
    public String editEmployee(@PathVariable Integer empID, Model model){
        model.addAttribute("employee", empService.getEmp(empID));
        return "employeeform";
    }

    @RequestMapping("employee/delete/{empID}")
    public String deleteEmployee(@PathVariable Integer empID){
        empService.deleteEmp(empID);
        return "redirect:/allemployees";
    }

    @RequestMapping("employee/{empID}")
    public String getEmployee(@PathVariable Integer empID, Model model){
        model.addAttribute("employee",empService.getEmp(empID));
        return "employeedetails";
    }

}
