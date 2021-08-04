package djs.team2.hotelApp.repository;

import djs.team2.hotelApp.model.Employee;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> getAllEmployees();

    Employee createEmployee(Employee employee) throws Exception;

    Employee getEmployeeById(int id);

    Employee deleteEmployeeById(int id) throws Exception;

    Employee updateEmployee(Employee employee) throws Exception;
}
