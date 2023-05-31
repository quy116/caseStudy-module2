package case_study.repository;

import case_study.model.person.Employee;
import case_study.service.EmployeeService;
import case_study.until.read_and_write.ReadAndWriteFileEmployee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private String Path = "/Users/gaugaune/IdeaProjects/CaseStudy_module2/src/case_study/until/data/employee.csv";
    private ReadAndWriteFileEmployee readAndWriteFileEmployee = new ReadAndWriteFileEmployee();
    private List<Employee> employeeList = new ArrayList<>();

    @Override
    public List<Employee> displayEmployeeRepository() {
        employeeList = readAndWriteFileEmployee.read(Path);
        return employeeList;
    }

    @Override
    public void editEmployeeRepository(List<Employee> employeeListService) {
        readAndWriteFileEmployee.write(employeeListService, Path);
    }


    @Override
    public void addEmployeeRepository(Employee employee) {
        employeeList.add(employee);
        readAndWriteFileEmployee.write(employeeList, Path);
    }
}
