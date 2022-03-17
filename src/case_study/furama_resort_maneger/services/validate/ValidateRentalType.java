package case_study.furama_resort_maneger.services.validate;

import java.util.Scanner;

public class ValidateRentalType {
    private static final String RENTAL_TYPE = "^[A-Z][a-z]*(\\s[a-z]*)*$";

    public static String validateRentalType() {
        Scanner scanner = new Scanner(System.in);
        String rentalType;
        do {
            System.out.println("enter renal type: ");
            rentalType = scanner.nextLine();
        } while (!rentalType.matches(RENTAL_TYPE));
        return rentalType;
    }
}
