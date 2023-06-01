package case_study.model.Facility;

public class Villa extends Facility {
    private String roomStandard;
    private double poolArea;
    private int numberFloor;

    public Villa() {
    }

    public Villa(String code, String nameService, double area, Double money, int maxPeople, String rentalType, String roomStandard, double poolArea, int numberFloor) {
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

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
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
