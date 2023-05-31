package case_study.model.Facility;

public class Villa extends Facility {
    private String roomStandard;
    private String poolArea;
    private String numberFloor;

    public Villa() {
    }

    public Villa(String code, String nameService, String area, String money, String maxPeople, String rentalType, String roomStandard, String poolArea, String numberFloor) {
        super(code, nameService, area, money, maxPeople, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberFloor = numberFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(String poolArea) {
        this.poolArea = poolArea;
    }

    public String getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(String numberFloor) {
        this.numberFloor = numberFloor;
    }

    @Override
    public String toString() {
        return "Villa{" + super.toString() +
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea='" + poolArea + '\'' +
                ", numberFloor='" + numberFloor + '\'' +
                '}';
    }
}
