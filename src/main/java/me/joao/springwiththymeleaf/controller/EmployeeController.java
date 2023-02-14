package me.joao.springwiththymeleaf.controller;

import me.joao.springwiththymeleaf.entity.Employee;
import me.joao.springwiththymeleaf.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/list")
    public String getEmployee(Model model) {
        List<Employee> employees = employeeService.findAll();

        model.addAttribute("employees", employees);
        return "list-employees";
    }

}
