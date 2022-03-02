package oop_review.bai_tap_anh_chanh.vehicle_maneger;

public class Vans extends Vehicle  implements VehicleMethods {
    private double tonnage;

    public Vans(double tonnage) {
        this.tonnage = tonnage;
    }

    public Vans(String licensePlates, String producerName, int yearOfManuFacTure, String owner, double tonnage) {
        super(licensePlates, producerName, yearOfManuFacTure, owner);
        this.tonnage = tonnage;
    }

    public double getTonnage() {
        return tonnage;
    }

    public void setTonnage(double tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return "Vans{" +
                "licensePlates='" + this.getLicensePlates() + '\'' +
                ", ProducerName='" + this.getProducerName() + '\'' +
                ", yearOfManuFacTure=" + this.getYearOfManuFacTure() +
                ", owner='" + this.getOwner()+ '\'' +
                "tonnage=" + tonnage +
                '}';
    }

    @Override
    public void add() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void show() {

    }
}
