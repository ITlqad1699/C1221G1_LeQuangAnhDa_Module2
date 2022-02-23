package ss6_inheritance.exercises.class2d_and_class3d;

import java.util.Arrays;

public class Point2D {
    public static void main(String[] args) {

        Point2D element = new Point2D(3, 4);
        System.out.print(element);
    }

    private float x;
    private float y;

    public Point2D() {

    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public double[] getXY() {
        return new double[]{this.getX(), this.getY()};
    }

    @Override
    public String toString() {
        return "the object's position in 2D space: " + Arrays.toString(this.getXY());
    }
}
