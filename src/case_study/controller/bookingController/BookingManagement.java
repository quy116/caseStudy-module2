package case_study.controller.bookingController;

import case_study.service.BookingService;

import java.util.Scanner;

public class BookingManagement {
    public void bookingManagement() {
        Scanner sc = new Scanner(System.in);
        BookingService bookingService = new BookingService();
        boolean flag = true;
        do {
            System.out.println("1.display list booking\n" +
                    "2. add new booking\n" +
                    "3. edit contracts\n" +
                    "4. create new contracts\n" +
                    "5. display list contracts" +
                    "6. return main menu");
            String input = sc.nextLine();
            switch (input) {
                case "1":
                    bookingService.displayBookingService();
                    break;
                case "2":
                    bookingService.addBookingService();
                    break;
//                case "3":
//                    employeeService.editEmployeeService();
//                    break;
//                case "4":
//                    employeeService.deleteEmployeeService();
//                    break;
//                case "5":
//                    employeeService.findEmployeeService();
//                    break;
                case "6":
                    flag = false;
                    break;
                default:
                    System.err.println("nhap sai. moi nhap lai");
            }
        } while (flag);
    }
}
