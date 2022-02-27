package oop_review.oop_java_1.vehicle;

import java.util.Scanner;

public class MainMenu {
    static VehicleManegement vehicleManegement = new VehicleManegement();

    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Main Menu:\n" +
                    "1. Add New\n" +
                    "2. Display\n" +
                    "3. Publish Manifest\n" +
                    "4. Exit\n"
            );
            System.out.print("Select Function: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    vehicleManegement.initializeNewVehicle();
                    break;
                case 2:
                    vehicleManegement.showListVehicle();
                    break;
                case 3:
                    vehicleManegement.publishTax();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
}

