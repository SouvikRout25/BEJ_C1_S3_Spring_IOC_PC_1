package org.example;

import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean("employee")
    public Employee getEmployeeDetails(){
        Employee employee = new Employee();
        employee.setEmpId(1045);
        employee.setEmpName("Blaziken Getsugatnsho");
        employee.setSalary(750000.50);
        return employee;
    }

    @Bean
    public Department getDepartmentDetails(){
        return new Department(145,"Soul Reaper");
    }
}