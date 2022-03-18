package case_study.furama_resort_maneger.models.facility;

import case_study.furama_resort_maneger.models.GetInFoToCSV;

public class House extends Facility implements GetInFoToCSV {
    private String roomStandard;
    private int floorNumber;

    public House() {
    }

    public House(String roomStandard, int floorNumber) {
        this.roomStandard = roomStandard;
        this.floorNumber = floorNumber;
    }

    public House(String nameService, double usableArea, double rentalCosts, int maximumPeople, String rentalType, String serviceCode, String roomStandard, int floorNumber) {
        super(nameService, usableArea, rentalCosts, maximumPeople, rentalType, serviceCode);
        this.roomStandard = roomStandard;
        this.floorNumber = floorNumber;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public String toString() {
        return "House{" +
                "nameService='" + getNameService() + '\'' +
                ", usableArea=" + getUsableArea() +
                ", rentalCosts=" + getRentalCosts() +
                ", maximumPeople=" + getMaximumPeople() +
                ", rentalType='" + getRentalType() + '\'' +
                ", serviceCode='" + getServiceCode() + '\'' +
                "roomStandard='" + roomStandard + '\'' +
                ", floorNumber=" + floorNumber +
                '}';
    }

    @Override
    public String getInFoToCSV() {
        return this.getNameService() + "," + this.getUsableArea() + "," + this.getRentalCosts() + "," + this.getMaximumPeople() + "," + this.getRentalType() + "," + this.getServiceCode() + "," + roomStandard + "," + floorNumber;
    }
}
