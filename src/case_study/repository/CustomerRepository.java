package case_study.repository;

import case_study.model.person.Customer;
import case_study.until.read_and_write.ReadAndWriteCustomer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private List<Customer> customerList = new ArrayList<>();
    private String Path = "/Users/gaugaune/IdeaProjects/CaseStudy_module2/src/case_study/until/data/customer.csv";
    private ReadAndWriteCustomer readAndWriteCustomer = new ReadAndWriteCustomer();

    @Override
    public List<Customer> displayCustomerRepository() {
        customerList = readAndWriteCustomer.read(Path);
        return customerList;
    }

    @Override
    public void editCustomerRepository(List<Customer> customerList) {
        readAndWriteCustomer.write(Path, customerList);
    }

    @Override
    public void addCustomerRepository(Customer customer) {
        customerList.add(customer);
        readAndWriteCustomer.write(Path, customerList);
    }
}
