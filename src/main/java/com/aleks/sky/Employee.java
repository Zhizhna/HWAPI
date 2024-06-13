package com.aleks.sky;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;

@Service
class Employee {
    public class EmployeeService implements EmployeeServiceInt {

        private final Map<String, Employee> employees = new HashMap<>();

        @Override
        public Employee getEmployeeWithMinSalary(int department) {
            return employees.values()
                    .stream()
                    .filter(employee -> employee.getDepartment()== department)
                    .min(Comparator.comparing(Employee::getSalary))
                    .orElse(null);
        }

        @Override
        public Employee getEmployeeWithMaxSalary(int department) {
            return employees.values()
                    .stream()
                    .filter(employee -> employee.getDepartment() == department)
                    .max(Comparator.comparing(Employee::getSalary))
                    .orElse(null);
        }

        @Override
        public List<Employee> getAllEmployees(int department) {
            return employees.values()
                    .stream()
                    .filter(employee -> employee.getDepartment() == department)
                    .toList();
        }

        @Override
        public Map<String, Employee> getEmployees() {

            return employees.values()
                    .stream()
                    .collect(Collector.grouping(Employee::getDepartment
        }

    }
}