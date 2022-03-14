package case_study.furama_resort_maneger.models.facility;

public class Room extends Facility {
    private String freeServiceincluded;

    public Room() {
    }

    public Room(String freeServiceincluded) {
        this.freeServiceincluded = freeServiceincluded;
    }

    public Room(String nameService, double usableArea, double rentalCosts, int maximumPeople, String rentalType, String freeServiceincluded) {
        super(nameService, usableArea, rentalCosts, maximumPeople, rentalType);
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
                "freeServiceincluded='" + freeServiceincluded + '\'' +
                '}';
    }
}
