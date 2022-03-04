package oop_review.bai_tap_anh_chanh.vehicle_maneger;

public class Car extends Vehicle implements VehicleMethods {
    private int numberOfSeat;
    private String typeOfCar;

    public Car(int numberOfSeat, String typeOfCar) {
        this.numberOfSeat = numberOfSeat;
        this.typeOfCar = typeOfCar;
    }

    public Car(String licensePlates, String producerName, int yearOfManuFacTure, String owner, int numberOfSeat, String typeOfCar) {
        super(licensePlates, producerName, yearOfManuFacTure, owner);
        this.numberOfSeat = numberOfSeat;
        this.typeOfCar = typeOfCar;
    }

    public int getNumberOfSeat() {
        return numberOfSeat;
    }

    public void setNumberOfSeat(int numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }

    public String getTypeOfCar() {
        return typeOfCar;
    }

    public void setTypeOfCar(String typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "licensePlates='" + this.getLicensePlates() + '\'' +
                ", ProducerName='" + this.getProducerName() + '\'' +
                ", yearOfManuFacTure=" + this.getYearOfManuFacTure() +
                ", owner='" + this.getOwner()+ '\'' +
                ", numberOfSeat=" + numberOfSeat +
                ", typeOfCar='" + typeOfCar + '\'' +
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
