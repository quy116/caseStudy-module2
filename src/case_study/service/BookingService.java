package case_study.service;

import case_study.model.Booking;
import case_study.model.Facility.Facility;
import case_study.model.person.Customer;
import case_study.repository.BookingRepository;
import case_study.repository.CustomerRepository;
import case_study.repository.FacilityRepository;

import java.util.*;

public class BookingService implements IBookingService {
    private Scanner sc = new Scanner(System.in);
    private BookingRepository bookingRepository = new BookingRepository();
    private CustomerService customerService = new CustomerService();
    private FacilityService facilityService = new FacilityService();
    private FacilityRepository facilityRepository = new FacilityRepository();

    @Override
    public void displayBookingService() {
        TreeSet<Booking> bookingTreeSet = bookingRepository.displayBooking();
        for (Booking e : bookingTreeSet) {
            System.out.println(e);
        }
    }

    @Override
    public void addBookingService() {
// public Booking(String codeBooking, String dayBooking, String startDay, String endDay, String codeCustomer, String codeService)

        System.out.println("nhap ma booking");
        String inputCode = sc.nextLine();

        System.out.println("nha ngay booking");
        String inputDayBooking = sc.nextLine();

        System.out.println("nhap ngay bat dau");
        String inputStart = sc.nextLine();

        System.out.println("nhap ngay ket thuc");
        String inputEnd = sc.nextLine();
        customerService.displayCustomerService();
        System.out.println("nhap code khach hang");
        String inputCodeCustomer = sc.nextLine();
        facilityService.displayFacility();
        System.out.println("nhap code service");
        String inputCodeService = sc.nextLine();
        facilityRepository.countKey(inputCodeService);


        Booking booking = new Booking(inputCode, inputDayBooking, inputStart, inputEnd, inputCodeCustomer, inputCodeService);
        bookingRepository.addBooking(booking);
    }
}

