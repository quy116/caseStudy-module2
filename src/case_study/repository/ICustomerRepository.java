package case_study.repository;

import case_study.model.person.Customer;
import case_study.model.person.Employee;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> displayCustomerRepository();
    void editCustomerRepository(List<Customer> customerList);
    void addCustomerRepository(Customer customer);
}
