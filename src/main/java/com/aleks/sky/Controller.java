package com.aleks.sky;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@RequestMapping("/Employees")
public class Controller {

    private final Employee employee;

    public EmployeeController(Employee employee){
        this.employee = employee;
    }

    @GetMapping("min-salary"))
    public Employee getEmployeeWithMinSalary(int department){
    return employee.getEmployeeWithMinSalary(department);
    }
    @GetMapping("max-salary"))
    public Employee getEmployeeWithMaxSalary(int department){
        return employee.getEmployeeWithMaxSalary(department);
}
@GetMapping("all")
    public List<Employee>getAllEmployees(int department){
    return employee.getAllEmployees(department);
    }
    @GetMapping("all-department"
    public Map<Integer,List<Employee>> getEmployees(){
        return employee.getEmployees();            }
}
