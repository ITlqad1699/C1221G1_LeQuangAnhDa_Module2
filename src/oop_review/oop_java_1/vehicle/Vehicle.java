package oop_review.oop_java_1.vehicle;

public class Vehicle {

    private int engineDisplacement;
    private double price;
    private String name;

    public Vehicle() {
    }

    public Vehicle(String name, int engineDisplacement, double price) {
        this.name = name;
        this.engineDisplacement = engineDisplacement;
        this.price = price;
    }

    public int getEngineDisplacement() {
        return engineDisplacement;
    }

    public void setEngineDisplacement(int engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTax() {
        if (this.getEngineDisplacement() <= 100) {
            return 0.01 * this.getPrice();
        } else if (this.getEngineDisplacement() <= 200) {
            return 0.03 * this.getPrice();
        } else {
            return 0.05 * this.getPrice();
        }
    }

    @Override
    public String toString() {
        return "Vehicle Name: " + this.name + "," + "engine displacement: " + this.engineDisplacement + "cc ," + "price: " + this.price + " vnd";
    }

}
