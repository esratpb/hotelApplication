package djs.team2.hotelApp.service;

import djs.team2.hotelApp.model.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

    public Employee getEmployeeById(int id);

    public Employee deleteEmployeeById(int id);

    public Employee createEmployee(Employee employee);

    public Employee updateEmployee(Employee employee);
}
