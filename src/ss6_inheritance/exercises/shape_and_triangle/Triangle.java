package ss6_inheritance.exercises.shape_and_triangle;

public class Triangle extends Shape {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);
        System.out.print("<-------------------------------------------------------------------------------------------------------------------------------------->\n");
        Triangle triangle1 = new Triangle(3,4,5,"red",true);
        System.out.print(triangle1);
    }
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    Triangle() {
    }

    Triangle(double side1, double side2, double side3, String color, boolean filled) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getParimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    public double getArea() {
        return Math.sqrt((this.getParimeter() / 2) * (this.getParimeter() / 2 - this.side1) * (this.getParimeter() / 2 - this.side2) * (this.getParimeter() / 2 - this.side3));
    }

    @Override
    public String toString() {
        return "Triangle has 3 side:  \n" +
                +this.side1 + "," + this.side2 + "," + this.side3 + "\n" +
                "color: " +this.getColor() + "\n" +
                (isFilled() ? "filled" : "not filled") + "\n" +
                "Area: " + this.getArea() + "\n" +
                "Parimeter: " + this.getParimeter();
    }
}
