package case_study.model.Facility;

public abstract class Facility {
    private String code;
    private String nameService;
    private String area;
    private String money;
    private String maxPeople;
    private String rentalType;

    public Facility() {
    }

    public Facility(String code, String nameService, String area, String money, String maxPeople, String rentalType) {
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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(String maxPeople) {
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
