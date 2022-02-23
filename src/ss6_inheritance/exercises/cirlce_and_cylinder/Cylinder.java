package ss6_inheritance.exercises.cirlce_and_cylinder;

public class Cylinder extends Circle {
    private double height = 5;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius, String color, boolean filled) {
        super(radius, color, filled);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }

    public double getArea() {
        return 2 * Math.PI * height + 2 * super.getArea();
    }

    @Override
    public String toString() {
        return "Cylinder has area is: " + this.getArea() + "and volumne is: " + this.getVolume();
    }
}
