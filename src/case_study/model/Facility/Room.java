package case_study.model.Facility;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String code, String nameService, double area, Double money, int maxPeople, String rentalType, String freeService) {
        super(code, nameService, area, money, maxPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString() +
                "freeService='" + freeService + '\'' +
                '}';
    }
}
