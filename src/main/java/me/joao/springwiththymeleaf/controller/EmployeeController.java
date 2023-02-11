package me.joao.springwiththymeleaf.controller;

import me.joao.springwiththymeleaf.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    List<Employee> employees;

    @GetMapping("/list")
    public String getEmployee(Model model) {
        model.addAttribute("employees", employees);
        return "list-employees";
    }

    @PostConstruct
    private void loadData() {
        employees = new ArrayList<>();
        employees.add(Employee.builder().id(1).firstName("Employee").lastName("First").email("employeefirst@test.com").build());
        employees.add(Employee.builder().id(2).firstName("Employee").lastName("Second").email("employeesecond@test.com").build());
        employees.add(Employee.builder().id(2).firstName("Employee").lastName("Third").email("employeethirdt@test.com").build());
    }
}
