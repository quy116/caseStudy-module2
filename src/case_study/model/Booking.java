package case_study.model;

import java.util.Comparator;

public class Booking implements Comparable<Booking>{
    private String CodeBooking;
    private String dayBooking;
    private String startDay;
    private String endDay;
    private String CodeCustomer;
    private String CodeService;

    public Booking() {
    }

    public Booking(String codeBooking, String dayBooking, String startDay, String endDay, String codeCustomer, String codeService) {
        CodeBooking = codeBooking;
        this.dayBooking = dayBooking;
        this.startDay = startDay;
        this.endDay = endDay;
        CodeCustomer = codeCustomer;
        CodeService = codeService;
    }

    public String getCodeBooking() {
        return CodeBooking;
    }

    public void setCodeBooking(String codeBooking) {
        CodeBooking = codeBooking;
    }

    public String getDayBooking() {
        return dayBooking;
    }

    public void setDayBooking(String dayBooking) {
        this.dayBooking = dayBooking;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public String getCodeCustomer() {
        return CodeCustomer;
    }

    public void setCodeCustomer(String codeCustomer) {
        CodeCustomer = codeCustomer;
    }

    public String getCodeService() {
        return CodeService;
    }

    public void setCodeService(String codeService) {
        CodeService = codeService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "CodeBooking='" + CodeBooking + '\'' +
                ", dayBooking='" + dayBooking + '\'' +
                ", startDay='" + startDay + '\'' +
                ", endDay='" + endDay + '\'' +
                ", CodeCustomer='" + CodeCustomer + '\'' +
                ", CodeService='" + CodeService + '\'' +
                '}';
    }

    @Override
    public int compareTo(Booking o) {
        if (this.startDay.equals(o.startDay)){
            return this.endDay.compareTo(o.endDay);
        }
        return this.startDay.compareTo(o.startDay);
    }
}
