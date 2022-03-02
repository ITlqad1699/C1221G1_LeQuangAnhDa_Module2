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
    private static Motor motor2 = new Motor("92-F5", "Yamaha", 1995, "Trần Phương Linh", 100);
    private static Car car1 = new Car("43-C3", "Toyota", 2010, "Lê Văn Luyện", 40, "xe khách");
    private static Car car2 = new Car("43-X7", "Audi", 2010, "Lê Hương", 7, "oto");
    private static Vans vans1 = new Vans("92-S3", "Honda", 2011, "Nguyễn Văn Thông", 5000);
    private static Vans vans2 = new Vans("92-B5", "Suzuki", 2020, "Bình Giảng", 7000);

    static {
        motors.add(motor1);
        motors.add(motor2);
    }

    static {
        cars.add(car1);
        cars.add(car2);
    }

    static {
        vans.add(vans1);
        vans.add(vans2);
    }

    @Override
    public void add() {
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Main Menu:\n" +
                "1. Add New Motor\n" +
                "2. Add New Car\n" +
                "3. Add New Vans\n" +
                "4. Back\n"
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
                Car newCar = new Car(licensePlates2, producerName2, yearOfManuFacTure2, owner2, numberOfSeat, typeOfCar);
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
                Vans newVans = new Vans(licensePlates3, producerName3, yearOfManuFacTure3, owner3, tonnage);
                vans.add(newVans);
                break;
        }
    }

    @Override
    public void delete() {
        System.out.println("Enter license Plates You Want To Delete: ");
        String licensePlates = scanner.nextLine();
        for (Motor motor : motors) {
            if (licensePlates.equals(motor.getLicensePlates())) {
                System.out.println("Do you want to delete this vehicle?\n" +
                        "1. Yes\n" +
                        "2. No\n");
                int choice;
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        motors.remove(motor);
                        break;
                    case 2:
                        break;
                }
                break;
            }
        }
        for (Car car : cars) {
            if (licensePlates.equals(car.getLicensePlates())) {
                System.out.println("Do you want to delete this vehicle?\n" +
                        "1. Yes\n" +
                        "2. No\n");
                int choice;
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        cars.remove(car);
                        break;
                    case 2:
                        break;
                }
                break;
            }
        }
        for (Vans vans1 : vans) {
            if (licensePlates.equals(vans1.getLicensePlates())) {
                System.out.println("Do you want to delete this vehicle?\n" +
                        "1. Yes\n" +
                        "2. No\n");
                int choice;
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        vans.remove(vans1);
                        break;
                    case 2:
                        break;
                }
                break;
            }
        }
    }

    @Override
    public void show() {
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Main Menu:\n" +
                "1. Show List Motors\n" +
                "2. Show List Cars\n" +
                "3. Show List Vans\n"
        );
        System.out.print("Select Function: ");
        choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                for (Motor motor : motors) {
                    System.out.println(motor);
                }
                break;
            case 2:
                for (Car car : cars) {
                    System.out.println(car);
                }
                break;
            case 3:
                for (Vans vans : vans) {
                    System.out.println(vans);
                }
                break;
        }
    }
}
