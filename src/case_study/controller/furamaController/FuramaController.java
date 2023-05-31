package case_study.controller.furamaController;

import case_study.controller.bookingController.BookingManagement;
import case_study.controller.customerController.CustomerManagement;
import case_study.controller.employeeController.EmployeeManagement;
import case_study.controller.facilityController.FacilityManagement;
import case_study.controller.promotionController.Promotionmanagement;

import java.util.Scanner;

public class FuramaController {
    public void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        CustomerManagement customerManagement = new CustomerManagement();
        FacilityManagement facilityManagement = new FacilityManagement();
        EmployeeManagement employeeManagement = new EmployeeManagement();
        BookingManagement bookingManagement = new BookingManagement();
        Promotionmanagement promotionmanagement = new Promotionmanagement();

        do {
            System.out.println("enter my choice\n" +
                    "1. Employee Management\n" +
                    "2. Customer Management\n" +
                    "3. Facility Management \n" +
                    "4. Booking Management\n" +
                    "5. Promotion Management\n" +
                    "6. Exit");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    employeeManagement.employeeManagement();
                    break;
                case "2":
                    customerManagement.customerManagement();
                    break;
                case "3":
                    facilityManagement.facilityManagement();
                    break;
                case "4":
                    bookingManagement.bookingManagement();
                    break;
                case "5":
                    promotionmanagement.promotionManagement();
                    break;
                case "6":
                    System.exit(1);
                default:
                    System.out.println("wrong. please come back later");
            }
        } while (true);
    }
}
