package case_study.furama_resort_maneger.services.booking_service;

import case_study.furama_resort_maneger.models.booking.Booking;

import java.util.Scanner;

public class BookingServiceImpl implements BookingService {

    private static Booking initializeBooking() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter booking's ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("enter the starting day: ");
        String dayStart = scanner.nextLine();
        System.out.println("enter the ending day: ");
        String dayEnd = scanner.nextLine();
        System.out.println("enter customer ID: ");
        int customerID = Integer.parseInt(scanner.nextLine());
        System.out.println("enter service name: ");
        String serviceName = scanner.nextLine();
        System.out.println("enter service type: ");
        String serviceType = scanner.nextLine();
        return new Booking(id, dayStart, dayEnd, customerID, serviceName, serviceType);
    }

    @Override
    public void addNew() {

    }

    @Override
    public void displayList() {

    }
}
