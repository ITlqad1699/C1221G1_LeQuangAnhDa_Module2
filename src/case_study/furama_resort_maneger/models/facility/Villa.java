package case_study.furama_resort_maneger.models.facility;

public class Villa extends Facility {
    private String roomStandard;
    private double swimmingPoolArea;
    private int floorNumber;

    public Villa() {
    }

    public Villa(String roomStandard, double swimmingPoolArea, int floorNumber) {
        this.roomStandard = roomStandard;
        this.swimmingPoolArea = swimmingPoolArea;
        this.floorNumber = floorNumber;
    }

    public Villa(String nameService, double usableArea, double rentalCosts, int maximumPeople, String rentalType, String roomStandard, double swimmingPoolArea, int floorNumber) {
        super(nameService, usableArea, rentalCosts, maximumPeople, rentalType);
        this.roomStandard = roomStandard;
        this.swimmingPoolArea = swimmingPoolArea;
        this.floorNumber = floorNumber;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(double swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "nameService='" + getNameService() + '\'' +
                ", usableArea=" + getUsableArea() +
                ", rentalCosts=" + getRentalCosts() +
                ", maximumPeople=" + getMaximumPeople() +
                ", rentalType='" + getRentalType() + '\'' +
                "roomStandard='" + getRoomStandard() + '\'' +
                ", swimmingPoolArea=" + swimmingPoolArea +
                ", floorNumber=" + floorNumber +
                '}';
    }
}
