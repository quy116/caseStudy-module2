package case_study.controller.employeeController;

import case_study.service.EmployeeService;

import java.util.Scanner;

public class EmployeeManagement {
    public void employeeManagement(){
        EmployeeService employeeService = new EmployeeService();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("1.display list Employee\n" +
                    "2. add new Employee\n" +
                    "3. edit Employee\n" +
                    "4. delete Employee \n" +
                    "5. find Employee \n" +
                    "6. return main menu");
            String input = sc.nextLine();
            switch (input){
                case "1":
                    employeeService.displayEmployeeService();
                    break;
                case "2":
                    employeeService.addEmployeeService();
                    break;
                case "3":
                    employeeService.editEmployeeService();
                    break;
                case "4":
                    employeeService.deleteEmployeeService();
                    break;
                case "5":
                    employeeService.findEmployeeService();
                    break;
                case "6":
                    flag = false;
                    break;
                default:
                    System.err.println("nhap sai. moi nhap lai");
            }
        }while (flag);
    }
}
