package case_study.model.Facility;

public class House extends Facility {
    private String roomStandard;
    private int numberFloor;

    public House() {
    }

    public House(String code, String nameService, double area, Double money, int maxPeople, String rentalType, String roomStandard, int numberFloor) {
        super(code, nameService, area, money, maxPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numberFloor = numberFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    @Override
    public String toString() {
        return "House{" + super.toString() +
                "roomStandard='" + roomStandard + '\'' +
                ", numberFloor='" + numberFloor + '\'' +
                '}';
    }
}
