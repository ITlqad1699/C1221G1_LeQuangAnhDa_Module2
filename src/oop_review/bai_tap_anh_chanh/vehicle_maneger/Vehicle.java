package oop_review.bai_tap_anh_chanh.vehicle_maneger;

public abstract class Vehicle implements VehicleMethods {
    private String licensePlates;
    private String ProducerName;
    private int yearOfManuFacTure;
    private String owner;
    public Vehicle(){
    }
    public Vehicle(String licensePlates, String producerName, int yearOfManuFacTure, String owner) {
        this.licensePlates = licensePlates;
        ProducerName = producerName;
        this.yearOfManuFacTure = yearOfManuFacTure;
        this.owner = owner;
    }

    public String getLicensePlates() {
        return licensePlates;
    }

    public void setLicensePlates(String licensePlates) {
        this.licensePlates = licensePlates;
    }

    public String getProducerName() {
        return ProducerName;
    }

    public void setProducerName(String producerName) {
        ProducerName = producerName;
    }

    public int getYearOfManuFacTure() {
        return yearOfManuFacTure;
    }

    public void setYearOfManuFacTure(int yearOfManuFacTure) {
        this.yearOfManuFacTure = yearOfManuFacTure;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "licensePlates='" + licensePlates + '\'' +
                ", ProducerName='" + ProducerName + '\'' +
                ", yearOfManuFacTure=" + yearOfManuFacTure +
                ", owner='" + owner + '\'' +
                '}';
    }

}
