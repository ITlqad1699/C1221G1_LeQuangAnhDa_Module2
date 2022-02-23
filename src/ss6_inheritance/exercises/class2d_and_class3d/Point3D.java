package ss6_inheritance.exercises.class2d_and_class3d;

import java.util.Arrays;

public class Point3D extends Point2D {

    public static void main(String[] args) {
        Point3D element = new Point3D(1, 2, 3);
        System.out.println(element);
        Point3D element1 = new Point3D();
        element1.setX(3);
        element1.setY(4);
        element1.setZ(5);
        System.out.println(element1);
        Point3D element2= new Point3D();
        element2.setXYZ(1,3,4);
        System.out.println(element2);
    }

    private float z;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setX(x);
        super.setY(y);
        this.z = z;
    }

    public double[] getXYZ() {
        return new double[]{super.getX(), super.getY(), this.getZ()};
    }

    @Override
    public String toString() {
        return "the object's position in 3D space: " + Arrays.toString(this.getXYZ());
    }

}
