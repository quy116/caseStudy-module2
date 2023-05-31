package case_study.controller.bookingController;

import java.util.Scanner;

public class BookingManagement {
    public void bookingManagement(){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("1.display list booking\n" +
                    "2. add new booking\n" +
                    "3. edit contracts\n" +
                    "4. create new contracts\n" +
                    "5. display list contracts" +
                    "6. return main menu");
            String input = sc.nextLine();
        }while (flag);
    }
}
