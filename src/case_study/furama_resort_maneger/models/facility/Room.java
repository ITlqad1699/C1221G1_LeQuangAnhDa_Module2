package case_study.furama_resort_maneger.models.facility;

import case_study.furama_resort_maneger.models.GetInFoToCSV;

public class Room extends Facility implements GetInFoToCSV {
    private String freeServiceincluded;

    public Room() {
    }

    public Room(String freeServiceincluded) {
        this.freeServiceincluded = freeServiceincluded;
    }

    public Room(String nameService, double usableArea, double rentalCosts, int maximumPeople, String rentalType, String serviceCode, String freeServiceincluded) {
        super(nameService, usableArea, rentalCosts, maximumPeople, rentalType, serviceCode);
        this.freeServiceincluded = freeServiceincluded;
    }

    public String getFreeServiceincluded() {
        return freeServiceincluded;
    }

    public void setFreeServiceincluded(String freeServiceincluded) {
        this.freeServiceincluded = freeServiceincluded;
    }

    @Override
    public String toString() {
        return "Room{" +
                "nameService='" + getNameService() + '\'' +
                ", usableArea=" + getUsableArea() +
                ", rentalCosts=" + getRentalCosts() +
                ", maximumPeople=" + getMaximumPeople() +
                ", rentalType='" + getRentalType() + '\'' +
                ", serviceCode='" + getServiceCode() + '\'' +
                "freeServiceincluded='" + freeServiceincluded + '\'' +
                '}';
    }

    @Override
    public String getInFoToCSV() {
        return this.getNameService() + "," + this.getUsableArea() + "," + this.getRentalCosts() + "," + this.getMaximumPeople() + "," + this.getRentalType() + "," + this.getServiceCode() + "," +  freeServiceincluded;
    }
}
