package oop_review.oop_java_1.vehicle;

import java.util.Scanner;

public class VehicleManegement extends Vehicle {
    private static Vehicle[] vehicles = new Vehicle[100];
    Scanner scanner = new Scanner(System.in);

    static {
        vehicles[0] = new Vehicle("mercedes", 125, 300000000);
        vehicles[1] = new Vehicle("porches", 70, 300000000);
        vehicles[2] = new Vehicle("toyota", 210, 400000000);
    }

    public void showListVehicle() {
        int count = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle != null) {
                System.out.println(vehicle);
                count += 1;
            } else {
                break;
            }
        }
        System.out.println("We have " + count + " vehicle on the list");
    }

    public void initializeNewVehicle() {
        System.out.print("Enter new vehicle's name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter engine displacement: ");
        int engineDis = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter price of vehicle: ");
        double price = Float.parseFloat(scanner.nextLine());
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] == null) {
                vehicles[i] = new Vehicle(newName, engineDis, price);
                break;
            }
        }
        showListVehicle();
    }

    public void publishTax() {
        System.out.print("Enter index of vehicle: ");
        int index = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < vehicles.length; i++) {
            if (i == index - 1) {
                System.out.println("Publication of vehicle tax returns: " + vehicles[i].getTax() + " vnd");
            }
            if (vehicles[index - 1] == null) {
                System.out.println("You entered wrong, please choose another function: ");
                break;
            }
        }
    }
}
