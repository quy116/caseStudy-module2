package case_study.controller.facilityController;

import case_study.service.FacilityService;

import java.util.Scanner;

public class FacilityManagement {
    public void facilityManagement() {
        FacilityService facilityService = new FacilityService();

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("1.display list Facility\n" +
                    "2. add new Facility\n" +
                    "3. Display list facility maintenance(chua hien thi duoc)\n" +
                    "4. return main menu");
            String input = sc.nextLine();
            switch (input) {
                case "1":
                    facilityService.displayFacility();
                    break;
                case "2":
                    boolean check = true;
                    do {
                        System.out.println("1.  add villa  \n" +
                                "2. add House \n" +
                                "3. add Room\n" +
                                "4. return menu" +
                                "enter your choice");
                        String inputChoice = sc.nextLine();
                        switch (inputChoice){
                            case "1":
                                facilityService.addVillaService();
                                break;
                            case "2":
                                facilityService.addHouseService();
                                break;
                            case "3" :
                                facilityService.addRoomService();
                                break;
                            case "4" :
                                check = false;
                                break;
                            default:
                                System.err.println("nhap sai. moi nhap lai");
                        }
                    }while (check);
                    break;
//                case "3":
//                    employeeService.editEmployeeService();
//                    break;
                case "4":
                    flag = false;
                    break;
                default:
                    System.err.println("nhap sai. moi nhap lai");
            }
        } while (flag);
    }
}
