package case_study.furama_resort_maneger.services.validate;

import java.util.Scanner;

public class ValidateServiceCode {
    private static final String SERVICE_CODE_VILLA = "^SVVL-\\d{4}$";
    private static final String SERVICE_CODE_HOUSE = "^SVHO-\\d{4}$";
    private static final String SERVICE_CODE_ROOM = "^SVRO-\\d{4}$";

    public static boolean validateVilla(String regex) {

        return regex.matches(SERVICE_CODE_VILLA);
    }

    public static boolean validateHouse(String regex) {

        return regex.matches(SERVICE_CODE_HOUSE);
    }

    public static boolean validateRoom(String regex) {
        return regex.matches(SERVICE_CODE_ROOM);
    }

    public static String validateVillaMethod() {
        Scanner scanner = new Scanner(System.in);
        String serviceCode;
        do {
            System.out.println("enter service code: ");
            serviceCode = scanner.nextLine();
        }
        while (!ValidateServiceCode.validateVilla(serviceCode));
        return serviceCode;
    }
    public static String validateHouseMethod() {
        Scanner scanner = new Scanner(System.in);
        String serviceCode;
        do {
            System.out.println("enter service code: ");
            serviceCode = scanner.nextLine();
        }
        while (!ValidateServiceCode.validateHouse(serviceCode));
        return serviceCode;
    }
    public static String validateRoomMethod() {
        Scanner scanner = new Scanner(System.in);
        String serviceCode;
        do {
            System.out.println("enter service code: ");
            serviceCode = scanner.nextLine();
        }
        while (!ValidateServiceCode.validateRoom(serviceCode));
        return serviceCode;
    }
}
