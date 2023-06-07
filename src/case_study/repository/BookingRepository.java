package case_study.repository;

import case_study.model.Booking;

import java.util.TreeSet;

public class BookingRepository implements IBookingRepository {
    private static  TreeSet<Booking> bookingTreeSet = new TreeSet<>();

    @Override
    public TreeSet<Booking> displayBooking() {
        return bookingTreeSet;
    }

    @Override
    public void addBooking(Booking booking) {
        bookingTreeSet.add(booking);
    }



}
