package case_study.service;

import case_study.model.Facility.Facility;
import case_study.model.Facility.House;
import case_study.model.Facility.Room;
import case_study.model.Facility.Villa;
import case_study.repository.FacilityRepository;
import case_study.until.regex.Regex;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FacilityService implements IFacilityService {
    //Room(String code, String nameService, String area, String money, String maxPeople, String rentalType, String freeService) {
    //House(String code, String nameService, String area, Double money, String maxPeople, String rentalType, String roomStandard, String numberFloor)
    //Villa(String code, String nameService, String area, Double money, String maxPeople, String rentalType, String roomStandard, String poolArea, String numberFloor)
    private FacilityRepository facilityRepository = new FacilityRepository();
    private Map<Facility, Integer> facilityIntegerMap = facilityRepository.getAll();
    Scanner sc = new Scanner(System.in);

    @Override
    public void addRoomService() {
        String code;
        do {
            System.out.println("nhập code vào");
            code = sc.nextLine();
        } while (!Regex.checkRegexCodeNameRoom(code));

        String name;
        do {
            System.out.println("nhập name dich vu vào");
            name = sc.nextLine();
        } while (!Regex.checkRegexName(name));


        double area;
        do {
            System.out.println("nhập diện tích phòng vào");
            area = Double.parseDouble(sc.nextLine());
        } while (area <= 30);
        double money;
        do {
            System.out.println("nhập số tiền vào");
            money = Double.parseDouble(sc.nextLine());
        } while (money <= 0);
        int people;
        do {
            System.out.println("nhập số Số lượng người tối đa vào");
            people = Integer.parseInt(sc.nextLine());
        } while (people >= 20 && people > 0);

        String rentalTypeNew = rentalType();

        System.out.println("nhập dịch vụ miễn phí vào");
        String freeServiceNew = freeService();
        Room room = new Room(code, name, area, money, people, rentalTypeNew, freeServiceNew);
        facilityRepository.addRoomRepository(room);

    }

    @Override
    public void addVillaService() {
        String code;
        do {
            System.out.println("nhập code vào vd: VL-001");
            code = sc.nextLine();
        } while (!Regex.checkRegexCodeNameVilla(code));

        String name;
        do {
            System.out.println("nhập name dich vu vào");
            name = sc.nextLine();
        } while (!Regex.checkRegexName(name));


        double area;
        do {
            System.out.println("nhập diện tích phòng vào");
            area = Double.parseDouble(sc.nextLine());
        } while (area <= 30);
        double money;
        do {
            System.out.println("nhập số tiền vào");
            money = Double.parseDouble(sc.nextLine());
        } while (money <= 0);
        int people;
        do {
            System.out.println("nhập số Số lượng người tối đa vào");
            people = Integer.parseInt(sc.nextLine());
        } while (people >= 20 && people > 0);


        String rentalTypeNew = rentalType();
        String roomStandardNew = roomStandard();

        double poolArea;
        do {
            System.out.println("nhập diện tích hồ bơi vào");
            poolArea = Double.parseDouble(sc.nextLine());
        } while (poolArea <= 30);
        int numberFloor;
        do {
            System.out.println("nhập số tầng vào");
            numberFloor = Integer.parseInt(sc.nextLine());
        } while (numberFloor <= 0);
        Villa villa = new Villa(code, name, area, money, people, rentalTypeNew, roomStandardNew, poolArea, numberFloor);
        facilityRepository.addVillaRepository(villa);
    }

    @Override
    public void addHouseService() {
        String code;
        do {
            System.out.println("nhập code vào");
            code = sc.nextLine();
        } while (!Regex.checkRegexCodeNameHouse(code));

        String name;
        do {
            System.out.println("nhập name dich vu vào");
            name = sc.nextLine();
        } while (!Regex.checkRegexName(name));


        double area;
        do {
            System.out.println("nhập diện tích phòng vào");
            area = Double.parseDouble(sc.nextLine());
        } while (area <= 30);
        double money;
        do {
            System.out.println("nhập số tiền vào");
            money = Double.parseDouble(sc.nextLine());
        } while (money <= 0);

        int people;
        do {
            System.out.println("nhập số Số lượng người tối đa vào");
            people = Integer.parseInt(sc.nextLine());
        } while (people >= 20 && people > 0);

        String rentalTypeNew = rentalType();

        String roomStandardNew = roomStandard();

        int numberFloor;
        do {
            System.out.println("nhập số tầng vào");
            numberFloor = Integer.parseInt(sc.nextLine());
        } while (numberFloor <= 0);

        House house = new House(code, name, area, money, people, rentalTypeNew, roomStandardNew, numberFloor);
        facilityRepository.addHouseRepository(house);
    }

    @Override
    public void displayFacility() {
        Set<Facility> facilitySet = facilityIntegerMap.keySet();
        for (Facility facility : facilitySet) {
            System.out.println(facility);
        }
    }

    @Override
    public String rentalType() {
        String rentalType = "";
        boolean flag = true;
        do {
            System.out.println("nhập loại cho thuê \n" +
                    "1. thuê theo tháng  \n" +
                    "2. thuê theo tuần\n" +
                    "3. thuê theo ngày");
            String input = sc.nextLine();
            switch (input) {
                case "1":
                    return rentalType = "thuê theo thang";
                case "2":
                    return rentalType = "thuê theo tuần";
                case "3":
                    return rentalType = "thuê theo ngày";
                case "4":
                    flag = false;
                    break;
                default:
                    System.err.println("nhập sai. mời nhập lại");
            }
        } while (flag);
        return rentalType;
    }

    @Override
    public String roomStandard() {
        String roomStandard = "";
        boolean flag = true;
        do {
            System.out.println("nhập loại tiêu chuẩn phòng \n" +
                    "1. phòng tổng thống 5 em tây \n" +
                    "2. phòng tù giam and 2 em tây\n" +
                    "3. phòng cầu trượt 2 em tây");
            String input = sc.nextLine();
            switch (input) {
                case "1":
                    return roomStandard = "phòng tổng thống 5 em tây";
                case "2":
                    return roomStandard = " phòng tù giam and 2 em tây";
                case "3":
                    return roomStandard = " phòng cầu trượt 2 em tây";
                case "4":
                    flag = false;
                    break;
                default:
                    System.err.println("nhập sai. mời nhập lại");
            }
        } while (flag);
        return roomStandard;
    }

    @Override
    public String freeService() {
        String freeService = "";
        boolean flag = true;
        do {
            System.out.println("nhập đồ miễn phí vào \n" +
                    "1. bao cao su \n" +
                    "2. ăn trưa\n" +
                    "3. ăn sáng");
            String input = sc.nextLine();
            switch (input) {
                case "1":
                    return freeService = "bao cao su";
                case "2":
                    return freeService = " ăn trưa";
                case "3":
                    return freeService = " ăn sáng";
                case "4":
                    flag = false;
                    break;
                default:
                    System.err.println("nhập sai. mời nhập lại");
            }
        } while (flag);
        return freeService;
    }


}
