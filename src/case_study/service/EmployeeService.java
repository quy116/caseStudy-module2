package case_study.service;

import case_study.model.person.Employee;
import case_study.repository.EmployeeRepository;
import case_study.until.regex.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private EmployeeRepository employeeRepository = new EmployeeRepository();
    private List<Employee> list = employeeRepository.displayEmployeeRepository();
    private Scanner sc = new Scanner(System.in);
    //String codeName, String name, String dateOfBirth, String gender, String id, String phoneNumber, String email, String level, String position, double salary) {
    //        super(codeName, name, dateOfBirth, gender, id, phoneNumber, email);

    @Override
    public void displayEmployeeService() {
        for (Employee e : list) {
            System.out.println(e);
        }
    }

    @Override
    public List<Employee> editEmployeeService() {
        do {
            System.out.println("nhập CodeName bạn muốn sửa");
            String inputCode = sc.nextLine();
            int index = 0;
            boolean check = false;
            for (int i = 0; i < list.size(); i++) {
                if (inputCode.equals(list.get(i).getCodeName())) {
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
                    "8. level \n" +
                    "9. position \n" +
                    "10. salary");
            String input = sc.nextLine();
            switch (input) {
                case "1":
                    String inputCodeName;
                    do {
                        System.out.println("nhập CodeName bạn muốn sửa");
                        inputCodeName = sc.nextLine();
                    } while (!Regex.checkRegexCodeNameEmployee(inputCodeName));
                    list.get(index).setCodeName(inputCodeName);
                    employeeRepository.editEmployeeRepository(list);
                    break;
                case "2":
                    String inputName;
                    do {
                        System.out.println("nhập CodeName bạn muốn sửa");
                        inputName = sc.nextLine();
                    } while (!Regex.checkRegexName(inputName));
                    list.get(index).setName(inputName);
                    employeeRepository.editEmployeeRepository(list);
                    break;
                case "3":
                    String inputDateOfBirth;
                    do {
                        System.out.println("nhập DateOfBirth bạn muốn sửa");
                        inputDateOfBirth = sc.nextLine();
                    } while (!Regex.checkRegexOld(inputDateOfBirth));
                    list.get(index).setDateOfBirth(inputDateOfBirth);
                    employeeRepository.editEmployeeRepository(list);
                    break;
                case "4":
                    System.out.println("nhập gender bạn muốn sửa");
                    String inputgender = sc.nextLine();
                    list.get(index).setGender(inputgender);
                    employeeRepository.editEmployeeRepository(list);
                    break;
                case "5":
                    String inputPhoneNumber;
                    do {
                        System.out.println("nhập phone number bạn muốn sửa");
                        inputPhoneNumber = sc.nextLine();
                    } while (!Regex.checkRegexTelephone(inputPhoneNumber));
                    list.get(index).setPhoneNumber(inputPhoneNumber);
                    employeeRepository.editEmployeeRepository(list);
                    break;
                case "6":
                    String inputId;
                    do {
                        System.out.println("nhập ID bạn muốn sửa");
                        inputId = sc.nextLine();
                    } while (!Regex.checkRegexId(inputId));
                    list.get(index).setId(inputId);
                    employeeRepository.editEmployeeRepository(list);
                    break;
                case "7":
                    String inputEmail;
                    do {
                        System.out.println("nhập Email bạn muốn sửa");
                        inputEmail = sc.nextLine();
                    } while (!Regex.checkRegexEmail(inputEmail));
                    list.get(index).setEmail(inputEmail);
                    employeeRepository.editEmployeeRepository(list);
                    break;
                case "8":
                    System.out.println("nhập Level bạn muốn sửa");
                    String inputLevel = choiceAdd();
                    list.get(index).setLevel(inputLevel);
                    employeeRepository.editEmployeeRepository(list);
                    break;
                case "9":
                    System.out.println("nhập position bạn muốn sửa");
                    String inputPosition = choiceAddPosition();
                    list.get(index).setPosition(inputPosition);
                    employeeRepository.editEmployeeRepository(list);
                    break;
                case "10":
                    double inputSalary;
                    boolean flag = true;
                    do {
                        System.out.println("enter your salary");
                        inputSalary = sc.nextDouble();
                        if (inputSalary > 0) {
                            flag = false;
                        }
                    } while (flag);
                    list.get(index).setSalary(inputSalary);
                    employeeRepository.editEmployeeRepository(list);
                    break;
                default:
                    System.err.println("nhap sai moi nhap lai");
            }
        }
        while (false);
        return list;
    }

    @Override
    public void addEmployeeService() {
        String inputCode;
        do {
            System.out.println("enter your Code name");
            inputCode = sc.nextLine();
        } while (!Regex.checkRegexCodeNameEmployee(inputCode));
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

        String inputLevel = choiceAdd();
        String inputPosition = choiceAddPosition();
        double inputSalary;
        boolean flag = true;
        do {
            System.out.println("enter your salary");
            inputSalary = sc.nextDouble();
            if (inputSalary > 0) {
                flag = false;
            }
        } while (flag);

        Employee employee = new Employee(inputCode, inputName, inputDateOfBirth, inputGender, inputId, inputPhone, inputGmail, inputLevel, inputPosition, inputSalary);
        employeeRepository.addEmployeeRepository(employee);
    }

    @Override
    public String choiceAdd() {
        boolean flag = true;
        String inputLevel;
        do {
            System.out.println("bạn đang trình độ nào?\n" +
                    "1. Trung cấp \n" +
                    "2. Cao đẳng \n" +
                    "3. Đại học  \n" +
                    "4. thạc sĩ \n" +
                    "5. tiến sĩ\n" +
                    "enter your choice");
            String input = sc.nextLine();
            switch (input) {
                case "1":
                    return inputLevel = "trung cấp";
                case "2":
                    return inputLevel = "cao đẳng";
                case "3":
                    return inputLevel = "đại học";
                case "4":
                    return inputLevel = "thạc sĩ";
                case "5":
                    return inputLevel = "tiến sĩ";
                default:
                    System.err.println("nhập sai. vui lòng nhập lại");
                    flag = false;
            }
        } while (flag);
        return null;
    }

    @Override
    public String choiceAddPosition() {
        boolean flag = true;
        String inputPosition;
        do {
            System.out.println("bạn đang vị trí nào?\n" +
                    "1. phục vụ \n" +
                    "2. chuyên viên \n" +
                    "3. giám sát  \n" +
                    "4. quản lý \n" +
                    "5. giám đốc\n" +
                    "enter your choice");
            String input = sc.nextLine();
            switch (input) {
                case "1":
                    return inputPosition = "phục vụ";
                case "2":
                    return inputPosition = "chuyên viên";
                case "3":
                    return inputPosition = "giám sát";
                case "4":
                    return inputPosition = "quản lý";
                case "5":
                    return inputPosition = "giám đốc";
                default:
                    System.err.println("nhập sai. vui lòng nhập lại");
                    flag = false;
            }
        } while (flag);
        return null;
    }
}
