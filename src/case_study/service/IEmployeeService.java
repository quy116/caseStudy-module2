package case_study.service;

import case_study.model.person.Employee;

import java.util.List;

public interface IEmployeeService {
    void displayEmployeeService();
    List<Employee> editEmployeeService();
    void addEmployeeService();
    String choiceAdd();
    String choiceAddPosition();
}
