package oop_review.bai_tap_anh_chanh.vehicle_maneger;

import java.util.Scanner;

public class MenuOfVehicleManeger {
    static VehicleManeger vehicleManegers = new VehicleManeger();

    public static void main(String[] args) {

        int choice;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Main Menu:\n" +
                    "1. Add New\n" +
                    "2. Display\n" +
                    "3. Delete\n" +
                    "4. Exit\n"
            );
            System.out.print("Select Function: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    vehicleManegers.add();
                    break;
                case 2:
                    vehicleManegers.show();
                    break;
                case 3:
                    vehicleManegers.delete();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
