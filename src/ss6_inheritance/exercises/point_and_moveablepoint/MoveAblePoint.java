package ss6_inheritance.exercises.point_and_moveablepoint;

import java.util.Arrays;

public class MoveAblePoint extends Point {
    public static void main(String[] args) {
        MoveAblePoint element = new MoveAblePoint(1, 1, 3, 3);
        System.out.println("element before move: " + element);
        element.move();
        System.out.println("element after move: " + element);
    }

    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    MoveAblePoint() {
    }

    MoveAblePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    MoveAblePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public double[] getSpeed() {
        return new double[]{this.xSpeed, this.ySpeed};
    }

    public MoveAblePoint move() {
        this.setX(this.getX() + xSpeed);
        this.setY(this.getY() + xSpeed);
        return this;
    }

    @Override
    public String toString() {
        return "the object's position in 2D space = " + Arrays.toString(this.getXY()) + " and have speed =  " + Arrays.toString(this.getSpeed());
    }
}
