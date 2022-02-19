package ss4_class_and_object.practices;

import java.util.Scanner;

public class Rectangle1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();
        Rectangle1 rectangle1 = new Rectangle1(width, height);
        System.out.print(rectangle1.display() + "\n");
        System.out.print("Area of the Rectangle: " + rectangle1.getArea() + "\n");
        System.out.print("Perimeter of the Rectangle: " + rectangle1.getParimeter() + "\n");
    }

    double width;
    double height;

    public Rectangle1() {

    }

    public Rectangle1(double height, double width) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getParimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle { width = " + width + "height = +" + height + "}";
    }
}
