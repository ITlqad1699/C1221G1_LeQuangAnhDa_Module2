package ss4_class_and_object.exercises;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("<-------------------------------------------<<Enter 3 Parameters>>----------------------------------------------->\n");
        System.out.print("Enter Params1: ");
        double param1 = scanner.nextDouble();
        System.out.print("Enter Params2: ");
        double param2 = scanner.nextDouble();
        System.out.print("Enter Params3: ");
        double param3 = scanner.nextDouble();
        QuadraticEquation newEquation1 = new QuadraticEquation(param1, param2, param3);
        System.out.print("The New Quadratic Equation With 3 Parameters You've Just Entered: " + newEquation1.display() + "\n");
        System.out.print("<-------------------------------------------<<Solve The Quadratic Equation>>----------------------------------------------->\n");
        if (newEquation1.getDiscriminant() > 0) {
            System.out.print("Quadratic Equation Has 2 Solutions(Roots):\n" + "x1 = " + newEquation1.getRoot1() + "\nx2 = " + newEquation1.getRoot2());
        } else if (newEquation1.getDiscriminant() == 0) {
            System.out.print("Quadratic Equation Has 1 Solution(Root): " + newEquation1.getRoot1());
        } else {
            System.out.print("Quadratic Equation Has No Solution(Root)");
        }
    }

    //Datas Field:
    private double a;
    private double b;
    private double c;
    double delta;
    double x1;
    double x2;

    //Constructor:
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //Methods(Behaviors):
    public double getCoefficientA() {
        return this.a;
    }

    public double getCoefficientB() {
        return this.b;
    }

    public double getCoefficientC() {
        return this.c;
    }

    public double getDiscriminant() {
        return this.delta = Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    public double getRoot1() {
        return this.x1 = -(this.b + Math.pow(this.delta, 0.5)) / (2 * this.a);
    }

    public double getRoot2() {
        return this.x2 = -(this.b - Math.pow(this.delta, 0.5)) / (2 * this.a);
    }

    public String display() {
        return "Quadratic Equation:" + this.a + "x^2 +" + this.b + "x +" + this.c + "";
    }
}
