package case_study.model.Facility;

public class House extends Facility {
    private String roomStandard;
    private String numberFloor;

    public House() {
    }

    public House(String code, String nameService, String area, String money, String maxPeople, String rentalType, String roomStandard, String numberFloor) {
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

    public String getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(String numberFloor) {
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
