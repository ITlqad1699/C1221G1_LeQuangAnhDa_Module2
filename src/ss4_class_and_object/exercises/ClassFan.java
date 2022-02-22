package ss4_class_and_object.exercises;

import java.util.Scanner;

public class ClassFan {
    //Const can access any where, we can use const for all clas so we use public static:
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public ClassFan() {
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

    @Override
    public String toString() {
        if (this.isOn()) {
            return "fan { speed:" + this.speed + ", " + " status: " + this.on + ", " + "radius: " + this.radius + ", " + "color: " + this.color + "}";
        } else {
            return "fan { speed:" + 0 + ", " + " status: " + this.on + ", " + "radius: " + this.radius + ", " + "color: " + this.color + "}";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("<-------------------------------------------<<Constructor Has No Parameters(The Default Constructor)>>----------------------------------------------->\n");
        ClassFan fan = new ClassFan();
        System.out.print("the information of fan is: " + fan.toString() + "\n");
        System.out.print("<-------------------------------------------<<Constructor Has Parameters>>----------------------------------------------->\n");
        System.out.println("Enter information for fan1: ");
        System.out.print("Enter color for fan1: ");
        String color1 = scanner.nextLine();
        System.out.print("Enter speed for fan1: ");
        //Constraint of speed:
        int speed1;
        do {
            speed1 = scanner.nextInt();
        }
        while (speed1 > 3 || speed1 < 1);
        System.out.print("Enter radius for fan1: ");
        double radius1 = scanner.nextDouble();
        boolean mode = true;
        ClassFan fan1 = new ClassFan(speed1, mode, radius1, color1);
        System.out.print("the information of fan1 is: " + fan1.toString() + "\n");
        System.out.print("<-------------------------------------------<<Pass Parameters To Constructor>>----------------------------------------------->\n");
        ClassFan fan2 = new ClassFan(3, false, 5, "blue");
        System.out.print("the information of fan2 is: " + fan2.toString() + "\n");
    }
}
