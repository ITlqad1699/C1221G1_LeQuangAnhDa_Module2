package case_study.furama_resort_maneger.services.validate;

import java.util.Scanner;

public class EnterParameter {
    public static double enterUsableArea() {
        Scanner scanner = new Scanner(System.in);
        double usableArea;
        do {
            System.out.println("enter usable area: ");
            usableArea = Double.parseDouble(scanner.nextLine());
        } while (usableArea < 0);
        return usableArea;
    }

    public static double enterRentalCost() {
        Scanner scanner = new Scanner(System.in);
        double rentalCost;
        do {
            System.out.println("enter rental cost: ");
            rentalCost = Double.parseDouble(scanner.nextLine());
        }
        while (rentalCost < 0);
        return rentalCost;
    }

    public static int enterMaximumPeople() {
        Scanner scanner = new Scanner(System.in);
        int maximumPeople;
        do {
            System.out.println("enter maximum people: ");
            maximumPeople = Integer.parseInt(scanner.nextLine());
        }
        while (maximumPeople < 0 || maximumPeople > 20);
        return maximumPeople;
    }

    public static double enterSwimmingPoolArea() {
        Scanner scanner = new Scanner(System.in);
        double swimmingPoolArea;
        do {
            System.out.println("enter swimming pool area:  ");
            swimmingPoolArea = Double.parseDouble(scanner.nextLine());
        } while (swimmingPoolArea < 30);
        return swimmingPoolArea;
    }
    public static int enterFloor(){
        Scanner scanner = new Scanner(System.in);
        int floorNumber;
        do {
            System.out.println("enter floor");
            floorNumber = Integer.parseInt(scanner.nextLine());
        }
        while (floorNumber < 0);
        return floorNumber;
    }
}
