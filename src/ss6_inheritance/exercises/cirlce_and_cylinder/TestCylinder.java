package ss6_inheritance.exercises.cirlce_and_cylinder;
import java.util.Scanner;
public class TestCylinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cylinder cylinder = new Cylinder();
        Cylinder cylinder1 = new Cylinder(5,5,"blue",true);
        System.out.println(cylinder);
        System.out.println(cylinder1);
    }
}
