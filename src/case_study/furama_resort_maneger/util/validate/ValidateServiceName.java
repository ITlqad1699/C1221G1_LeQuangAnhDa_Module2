package case_study.furama_resort_maneger.util.validate;

import java.util.Scanner;

public class ValidateServiceName {
    private static final String VALIDATE_SERVICE_NAME = "^[A-Z][a-z]*(\\s[a-z]*)*$";

    public static String getValidateServiceName() {
        Scanner scanner = new Scanner(System.in);
        String nameService;
        do {
            System.out.println("enter faciliy service name: ");
            nameService = scanner.nextLine();
        } while (!nameService.matches(VALIDATE_SERVICE_NAME));
        return nameService;
    }
}
