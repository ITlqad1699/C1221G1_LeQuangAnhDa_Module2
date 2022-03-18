package case_study.furama_resort_maneger.models.facility;

import case_study.furama_resort_maneger.models.GetInFoToCSV;

public class Villa extends Facility implements GetInFoToCSV {
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

    public Villa(String nameService, double usableArea, double rentalCosts, int maximumPeople, String rentalType, String serviceCode, String roomStandard, double swimmingPoolArea, int floorNumber) {
        super(nameService, usableArea, rentalCosts, maximumPeople, rentalType, serviceCode);
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
                ", serviceCode='" + getServiceCode() + '\'' +
                ", roomStandard='" + getRoomStandard() + '\'' +
                ", swimmingPoolArea=" + swimmingPoolArea +
                ", floorNumber=" + floorNumber +
                '}';
    }

    @Override
    public String getInFoToCSV() {
        return this.getNameService() + "," + this.getUsableArea() + "," + this.getRentalCosts() + "," + this.getMaximumPeople() + "," + this.getRentalType() + "," + this.getServiceCode() + ","+this.getRoomStandard()+"," + swimmingPoolArea + "," + floorNumber;
    }
}
