package case_study.service;

import case_study.model.person.Customer;
import case_study.repository.CustomerRepository;
import case_study.until.regex.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private CustomerRepository customerRepository = new CustomerRepository();
    private Scanner sc = new Scanner(System.in);
    private List<Customer> customerList = new ArrayList<>();

    @Override
    public void displayCustomerService() {
        customerList = customerRepository.displayCustomerRepository();
        for (Customer e : customerList) {
            System.out.println(e);
        }
    }

    @Override
    public List<Customer> editCustomerService() {
        do {
            System.out.println("nhập CodeName bạn muốn sửa");
            String inputCode = sc.nextLine();
            int index = 0;
            boolean check = false;
            for (int i = 0; i < customerList.size(); i++) {
                if (inputCode.equals(customerList.get(i).getCodeName())) {
                    index = i;
                    check = true;
                    break;
                }
            }
            if (check == false) {
                System.out.println("tìm không thấy Code");
                break;
            }
            System.out.println("bạn muốn thông tin nào \n" +
                    "1. code name\n" +
                    "2. name\n" +
                    "3. dateOfBirth \n" +
                    "4. gender \n" +
                    "5. phoneNumber\n" +
                    "6. id \n" +
                    "7. email \n" +
                    "8. type of Guest \n" +
                    "9. address \n");
            String input = sc.nextLine();
            switch (input) {
                case "1":
                    String inputCodeName;
                    do {
                        System.out.println("nhập CodeName bạn muốn sửa");
                        inputCodeName = sc.nextLine();
                    } while (!Regex.checkRegexCodeNameCustomer(inputCodeName));
                    customerList.get(index).setCodeName(inputCodeName);
                    customerRepository.editCustomerRepository(customerList);
                    break;
                case "2":
                    String inputName;
                    do {
                        System.out.println("nhập CodeName bạn muốn sửa");
                        inputName = sc.nextLine();
                    } while (!Regex.checkRegexName(inputName));
                    customerList.get(index).setName(inputName);
                    customerRepository.editCustomerRepository(customerList);
                    break;
                case "3":
                    String inputDateOfBirth;
                    do {
                        System.out.println("nhập DateOfBirth bạn muốn sửa");
                        inputDateOfBirth = sc.nextLine();
                    } while (!Regex.checkRegexOld(inputDateOfBirth));
                    customerList.get(index).setDateOfBirth(inputDateOfBirth);
                    customerRepository.editCustomerRepository(customerList);
                    break;
                case "4":
                    System.out.println("nhập gender bạn muốn sửa");
                    String inputgender = sc.nextLine();
                    customerList.get(index).setGender(inputgender);
                    customerRepository.editCustomerRepository(customerList);
                    break;
                case "5":
                    String inputPhoneNumber;
                    do {
                        System.out.println("nhập phone number bạn muốn sửa");
                        inputPhoneNumber = sc.nextLine();
                    } while (!Regex.checkRegexTelephone(inputPhoneNumber));
                    customerList.get(index).setPhoneNumber(inputPhoneNumber);
                    customerRepository.editCustomerRepository(customerList);
                    break;
                case "6":
                    String inputId;
                    do {
                        System.out.println("nhập ID bạn muốn sửa");
                        inputId = sc.nextLine();
                    } while (!Regex.checkRegexId(inputId));
                    customerList.get(index).setId(inputId);
                    customerRepository.editCustomerRepository(customerList);
                    break;
                case "7":
                    String inputEmail;
                    do {
                        System.out.println("nhập Email bạn muốn sửa");
                        inputEmail = sc.nextLine();
                    } while (!Regex.checkRegexEmail(inputEmail));
                    customerList.get(index).setEmail(inputEmail);
                    customerRepository.editCustomerRepository(customerList);
                    break;
                case "8":
                    System.out.println("nhập Type of guest bạn muốn sửa");
                    String inputType = choiceTypeOfGuest();
                    customerList.get(index).setTypeOfGuest(inputType);
                    customerRepository.editCustomerRepository(customerList);
                    break;
                case "9":
                    System.out.println("nhập address bạn muốn sửa");
                    String inputAddress = choiceTypeOfGuest();
                    customerList.get(index).setAddress(inputAddress);
                    customerRepository.editCustomerRepository(customerList);

                    break;
                default:
                    System.err.println("nhap sai moi nhap lai");
            }
        }
        while (false);
        return customerList;
    }

    @Override
    public void addCustomerService() {
        String inputCode;
        do {
            System.out.println("enter your Code name");
            inputCode = sc.nextLine();
        } while (!Regex.checkRegexCodeNameCustomer(inputCode));
        String inputName;
        do {
            System.out.println("enter your name");
            inputName = sc.nextLine();
        } while (!Regex.checkRegexName(inputName));
        String inputDateOfBirth;
        do {
            System.out.println("enter your date Of Birth");
            inputDateOfBirth = sc.nextLine();
        } while (!Regex.checkRegexOld(inputDateOfBirth));


        System.out.println("enter your gender");
        String inputGender = sc.nextLine();
        String inputId;
        do {
            System.out.println("enter your Id");
            inputId = sc.nextLine();
        } while (!Regex.checkRegexId(inputId));
        String inputPhone;
        do {
            System.out.println("enter your phone number");
            inputPhone = sc.nextLine();
        } while (!Regex.checkRegexTelephone(inputPhone));
        String inputGmail;
        do {
            System.out.println("enter your Email");
            inputGmail = sc.nextLine();
        } while (!Regex.checkRegexEmail(inputGmail));
        String inputType = choiceTypeOfGuest();
        System.out.println("enter your address");
        String inputAddress = sc.nextLine();
        Customer customer = new Customer(inputCode, inputName, inputDateOfBirth, inputGender, inputId, inputPhone, inputGmail, inputType, inputAddress);
        customerRepository.addCustomerRepository(customer);
    }

    @Override
    public String choiceTypeOfGuest() {
        boolean flag = true;
        String inputTypeOfGuest;
        do {
            System.out.println("bạn đang loại khách hàng nào?\n" +
                    "1. Diamond \n" +
                    "2. Platinum \n" +
                    "3. Gold  \n" +
                    "4. Silver \n" +
                    "5. Member\n" +
                    "enter your choice");
            String input = sc.nextLine();
            switch (input) {
                case "1":
                    return inputTypeOfGuest = "Diamond";
                case "2":
                    return inputTypeOfGuest = "Platinum";
                case "3":
                    return inputTypeOfGuest = "Gold";
                case "4":
                    return inputTypeOfGuest = "thạc sĩ";
                case "5":
                    return inputTypeOfGuest = "Member";
                default:
                    System.err.println("nhập sai. vui lòng nhập lại");
                    flag = false;
            }
        } while (flag);
        return null;
    }

}
