package case_study.controller.facilityController;

import java.util.Scanner;

public class FacilityManagement {
    public void facilityManagement(){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("1.displaylist Facility\n" +
                    "2. add new Facility\n" +
                    "3. edit Facility\n" +
                    "4. return main menu");
            String input = sc.nextLine();
        }while (flag);
    }
}
