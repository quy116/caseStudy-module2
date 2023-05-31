package case_study.repository;

import case_study.model.person.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> displayEmployeeRepository();
    void editEmployeeRepository(List<Employee> employeeListService);
    void addEmployeeRepository(Employee employee);
}
