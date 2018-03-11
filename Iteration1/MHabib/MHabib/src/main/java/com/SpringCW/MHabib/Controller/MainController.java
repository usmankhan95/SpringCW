package com.SpringCW.MHabib.Controller;

import com.SpringCW.MHabib.Model.Employee;
import com.SpringCW.MHabib.Model.EmployeeLogic;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
    
    @RequestMapping("/")
    public String homePage() {
        return "index";
    }
    
    @RequestMapping(value = "/result", method = RequestMethod.POST)
    public String result(@ModelAttribute Employee emp, Model model) {
        EmployeeLogic empLogic = new EmployeeLogic();
        model.addAttribute("empName", emp.getEmpName());
        model.addAttribute("empID", emp.getEmpID());
        model.addAttribute("empHours", emp.getEmpHours());
        model.addAttribute("empWage", emp.getEmpWage());
        model.addAttribute("weeklyWage", empLogic.weeklyWage(emp.getEmpHours(), emp.getEmpWage()));
        return "result";
    }
    
}