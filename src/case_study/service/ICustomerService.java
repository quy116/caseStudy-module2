package case_study.service;

import case_study.model.person.Customer;

import java.util.List;

public interface ICustomerService {
    void displayCustomerService();
    List<Customer> editCustomerService();
    void addCustomerService();
    String choiceTypeOfGuest();
}
