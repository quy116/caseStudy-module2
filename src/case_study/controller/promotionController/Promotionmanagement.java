package case_study.controller.promotionController;

import java.util.Scanner;

public class Promotionmanagement {
    public void promotionManagement(){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("1.display list customers use service\n" +
                    "2. display list customers get voucher\n" +
                    "3. return main menu");
            String input = sc.nextLine();
        }while (flag);
    }
}
