package case_study.model.Facility;

public abstract class Facility {
    private String code;
    private String nameService;
    private double area;
    private double money;
    private int maxPeople;
    private String rentalType;

    public Facility() {
    }

    public Facility(String code, String nameService, double area, Double money, int maxPeople, String rentalType) {
        this.code = code;
        this.nameService = nameService;
        this.area = area;
        this.money = money;
        this.maxPeople = maxPeople;
        this.rentalType = rentalType;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "code='" + code + '\'' +
                ", nameService='" + nameService + '\'' +
                ", area='" + area + '\'' +
                ", money='" + money + '\'' +
                ", maxPeople='" + maxPeople + '\'' +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
