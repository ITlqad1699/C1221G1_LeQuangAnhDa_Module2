package ss8_cleancode_and_refactoring.practices;

import java.util.Scanner;

public class CylinderTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius of cylinder: ");
        int radius = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter height of cylinder: ");
        int height = Integer.parseInt(scanner.nextLine());
        System.out.print("Volumn of cylinder is: " + Cylinder.getVolume(radius, height));
    }
}
