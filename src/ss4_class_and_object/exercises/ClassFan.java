package ss4_class_and_object.exercises;

import java.util.Scanner;

public class ClassFan {

    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public ClassFan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public ClassFan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean isOn() {
        return this.on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public String display() {
        return "fan { speed:" + this.speed + ", " + " status: " + this.on + ", " + "radius: " + this.radius + ", " + "color: " + this.color + "}";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("<-------------------------------------------<<Constructor Has No Parameters(The Default Constructor)>>----------------------------------------------->\n");
        ClassFan fan = new ClassFan();
        System.out.print("the information of fan is: " + fan.display() + "\n");
        System.out.print("<-------------------------------------------<<Constructor Has Parameters>>----------------------------------------------->\n");
        System.out.println("Enter information for fan1: ");
        System.out.print("Enter color for fan1: ");
        String color1 = scanner.nextLine();
        System.out.print("Enter speed for fan1: ");
        int speed1 = scanner.nextInt();
        System.out.print("Enter radius for fan1: ");
        double radius1 = scanner.nextDouble();
        boolean mode = true;
        ClassFan fan1 = new ClassFan(speed1, mode, radius1, color1);
        System.out.print("the information of fan1 is: " + fan1.display() + "\n");
        System.out.print("<-------------------------------------------<<Pass Parameters To Constructor>>----------------------------------------------->\n");
        ClassFan fan2 = new ClassFan(3, false, 5, "blue");
        System.out.print("the information of fan2 is: " + fan2.display() + "\n");
    }
}
