package case_study.controller.customerController;

import case_study.service.CustomerService;

import java.util.Scanner;

public class CustomerManagement {
    public void customerManagement(){
        CustomerService customerService = new CustomerService();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("1.display list Customer\n" +
                    "2. add new Customer\n" +
                    "3. edit Customer\n" +
                    "4. return main menu");
            String input = sc.nextLine();
            switch (input){
                case "1":
                    customerService.displayCustomerService();
                    break;
                case "2":
                    customerService.addCustomerService();
                    break;
                case "3":
                    customerService.editCustomerService();
                    break;
                case "4":
                    flag = false;
                    break;
                default:
                    System.err.println("nhap sai. moi nhap lai");
            }
        }while (flag);
    }
}
