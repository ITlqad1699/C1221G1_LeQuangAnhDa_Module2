package oop_review.bai_tap_anh_chanh.vehicle_maneger;



public class Motor extends Vehicle implements VehicleMethods{
    private float wattage;

    public Motor(float wattage) {
        this.wattage = wattage;
    }

    public Motor(String licensePlates, String producerName, int yearOfManuFacTure, String owner, float wattage) {
        super(licensePlates, producerName, yearOfManuFacTure, owner);
        this.wattage = wattage;
    }

    public float getWattage() {
        return wattage;
    }

    public void setWattage(float wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "wattage=" + wattage +
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
