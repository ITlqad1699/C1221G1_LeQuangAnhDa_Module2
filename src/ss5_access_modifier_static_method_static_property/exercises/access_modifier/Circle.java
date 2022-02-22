package ss5_access_modifier_static_method_static_property.exercises.access_modifier;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("<-------------------------------------------<<Circle With Input Radius>>----------------------------------------------->\n");
        System.out.print("Enter Radius: ");
        double radius = scanner.nextDouble();
        Circle circle1 = new Circle(radius);
        System.out.print("We have area of the circle which has radisus = " + radius + " is " + circle1.getArea() + "\n");
        System.out.print("<-------------------------------------------<<The Default Circle>>----------------------------------------------->\n");
        Circle circle = new Circle();
        System.out.print("we have area of the default circle is " + circle.getArea());
    }

    private double radius;
    private String color;

    public Circle() {
        this.radius = 1;
        this.color = "blue";
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    //Methods with access modifier is public:
    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    //Methods with access modifier is private:
//    private double getRadius() {
//        return radius;
//    }
//
//    private double getArea() {
//        return this.radius * this.radius * Math.PI;
//    }
    //Methods with access modifier is protected:
//    protected double getRadius() {
//        return radius;
//    }
//
//    protected double getArea() {
//        return this.radius * this.radius * Math.PI;
//    }
    //Methods with access modifier is default:
//    double getRadius() {
//        return radius;
//    }
//
//    double getArea() {
//        return this.radius * this.radius * Math.PI;
//    }
}
