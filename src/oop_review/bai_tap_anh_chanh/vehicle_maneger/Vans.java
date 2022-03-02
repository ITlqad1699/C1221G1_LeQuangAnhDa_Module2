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
                "tonnage=" + tonnage +
                '}';
    }

    @Override
    public void add(Vans vans1) {

    }

    @Override
    public void delete() {

    }

    @Override
    public void show() {

    }
}
