package me.joao.springwiththymeleaf.dao;


import me.joao.springwiththymeleaf.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> findAll();

    public Employee findById(int id);

    public void save(Employee employee);

    public void deleteById(int id);
}
