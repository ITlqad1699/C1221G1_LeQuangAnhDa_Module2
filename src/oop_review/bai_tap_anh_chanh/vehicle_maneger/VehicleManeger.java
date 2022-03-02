package oop_review.bai_tap_anh_chanh.vehicle_maneger;

import java.util.ArrayList;
import java.util.Scanner;

public class VehicleManeger implements VehicleMethods {
    public static void main(String[] args) {
        VehicleManeger vehicleManeger = new VehicleManeger();
        vehicleManeger.add();
    }
    Scanner scanner = new Scanner(System.in);
    private static ArrayList<Motor> motors = new ArrayList<>();
    private static ArrayList<Car> cars = new ArrayList<>();
    private static ArrayList<Vans> vans = new ArrayList<>();
    private static Motor motor1 = new Motor("92-F4", "Yamaha", 1994, "Lê Quang Anh Đà", 50);
    private static Car car1 = new Car("43-C3", "Toyota", 2010, "Lê Văn Luyện", 50, "xe khách");
    private static Vans vans1 = new Vans("92-S3", "Honda", 2011, "Nguyễn Văn Thông", 5000);

    static {
        motors.add(motor1);
    }

    static {
        cars.add(car1);
    }

    static {
        vans.add(vans1);
    }

    @Override
    public void add() {
        int choice;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Main Menu:\n" +
                    "1. Add New Motor\n" +
                    "2. Add New Car\n" +
                    "3. Add New Vans\n" +
                    "4. Exit\n"
            );
            System.out.print("Select Function: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Enter license Plates: ");
                    String licensePlates1 = scanner.nextLine();
                    System.out.println("Enter producer Name: ");
                    String producerName1 = scanner.nextLine();
                    System.out.println("Enter year of manufaceture: ");
                    int yearOfManuFacTure1 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter owner: ");
                    String owner1 = scanner.nextLine();
                    System.out.println("Enter wattage: ");
                    float wattage1 = Float.parseFloat(scanner.nextLine());
                    Motor newMotor = new Motor(licensePlates1, producerName1, yearOfManuFacTure1, owner1, wattage1);
                    motors.add(newMotor);
                    break;
                case 2:
                    System.out.println("Enter license Plates: ");
                    String licensePlates2 = scanner.nextLine();
                    System.out.println("Enter producer Name: ");
                    String producerName2 = scanner.nextLine();
                    System.out.println("Enter year of manufaceture: ");
                    int yearOfManuFacTure2 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter owner: ");
                    String owner2 = scanner.nextLine();
                    System.out.println("Enter number of seats: ");
                    int numberOfSeat = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter type of car: ");
                    String typeOfCar = scanner.nextLine();
                    Car newCar = new Car(licensePlates2,producerName2,yearOfManuFacTure2,owner2,numberOfSeat,typeOfCar);
                    cars.add(newCar);
                    break;
                case 3:
                    System.out.println("Enter license Plates: ");
                    String licensePlates3 = scanner.nextLine();
                    System.out.println("Enter producer Name: ");
                    String producerName3 = scanner.nextLine();
                    System.out.println("Enter year of manufaceture: ");
                    int yearOfManuFacTure3 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter owner: ");
                    String owner3 = scanner.nextLine();
                    System.out.println("Enter tonnage ");
                    double tonnage = Double.parseDouble(scanner.nextLine());
                    Vans newVans = new Vans(licensePlates3,producerName3,yearOfManuFacTure3,owner3,tonnage);
                    vans.add(newVans);
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }

    @Override
    public void delete() {

    }

    @Override
    public void show() {

    }
}
