package case_study.furama_resort_maneger.controllers;

import case_study.furama_resort_maneger.services.customer_service.CustomerService;
import case_study.furama_resort_maneger.services.customer_service.CustomerServiceImpl;
import case_study.furama_resort_maneger.services.employee_service.EmployeeService;
import case_study.furama_resort_maneger.services.employee_service.EmployeeServiceImpl;
import case_study.furama_resort_maneger.services.facility_service.FacilityService;
import case_study.furama_resort_maneger.services.facility_service.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaControllers {
    static EmployeeService employeeServiceImpl = new EmployeeServiceImpl();
    static CustomerService customerServiceImpl = new CustomerServiceImpl();
    static FacilityService facilityServiceImpl = new FacilityServiceImpl();

    public static void displayMainMenu() {
        int choiceFunction = 0;
        int choiceEmployeeFunction = 0;
        int choiceCustomerFunction = 0;
        int choiceFacilityFunction = 0;
        int choiceBookingFunction = 0;
        int choicePromotionFunction = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("" +
                    "<===========================>\n" +
                    "|1.\tEmployee Management    |\n" +
                    "|2.\tCustomer Management    |\n" +
                    "|3.\tFacility Management    |\n" +
                    "|4.\tBooking Management     |\n" +
                    "|5.\tPromotion Management   |\n" +
                    "|6.\tExit                   |\n" +
                    "<===========================>\n");
            System.out.print("Select Function: ");
            try {
                choiceFunction = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Enter number from 1 to 6:  ");
            }
            switch (choiceFunction) {
                case 1:
                    System.out.println("" +
                            "1.\tDisplay list employees\n" +
                            "2.\tAdd new employee\n" +
                            "3.\tEdit employee\n" +
                            "4.\tReturn main menu\n");
                    System.out.print("Select Function: ");
                    try {
                        choiceEmployeeFunction = Integer.parseInt(scanner.nextLine());

                    } catch (Exception e) {
                        System.out.println("this function doesn't exist,choose another function: ");
                    }
                    switch (choiceEmployeeFunction) {
                        case 1:
                            employeeServiceImpl.displayList();
                            break;
                        case 2:
                            employeeServiceImpl.addNew();
                            break;
                        case 3:
                            employeeServiceImpl.editElement();
                            break;
                        case 4:
                            //return menu
                            break;
                    }
                    break;
                case 2:
                    System.out.println("1.\tDisplay list customers\n" +
                            "2.\tAdd new customer\n" +
                            "3.\tEdit customer\n" +
                            "4.\tReturn main menu\n");
                    System.out.print("Select Function: ");
                    try {
                        choiceCustomerFunction = Integer.parseInt(scanner.nextLine());

                    } catch (Exception e) {
                        System.out.println("this function doesn't exist, choose another function: ");
                    }
                    switch (choiceCustomerFunction) {
                        case 1:
                            customerServiceImpl.displayList();
                            break;
                        case 2:
                            customerServiceImpl.addNew();
                            break;
                        case 3:
                            customerServiceImpl.editElement();
                            break;
                        case 4:
                            //return menu
                            break;
                    }
                    break;
                case 3:
                    System.out.println("1.\tDisplay list facility\n" +
                            "2.\tAdd new facility\n" +
                            "3.\tDisplay list facility maintenance\n" +
                            "4.\tReturn main menu\n");
                    System.out.print("Select Function: ");
                    try {
                        choiceFacilityFunction = Integer.parseInt(scanner.nextLine());
                    } catch (Exception e) {
                        System.out.println("this function doesn't exist, choose another function: ");
                    }
                    switch (choiceFacilityFunction) {
                        case 1:
                            facilityServiceImpl.displayList();
                            break;
                        case 2:
                            facilityServiceImpl.addNew();
                            break;
                        case 3:
                            facilityServiceImpl.displayFacilityMaintenance();
                            break;
                        case 4:
                            //return menu
                            break;
                    }
                    break;
                case 4:
                    System.out.println("1.\tAdd new booking\n" +
                            "2.\tDisplay list booking\n" +
                            "3.\tCreate new constracts\n" +
                            "4.\tDisplay list contracts\n" +
                            "5.\tEdit contracts\n" +
                            "6.\tReturn main menu\n");
                    System.out.print("Select Function: ");
                    try {
                        choiceBookingFunction = Integer.parseInt(scanner.nextLine());
                    } catch (Exception e) {
                        System.out.println("this function doesn't exist, choose another function: ");
                    }
                    switch (choiceBookingFunction) {
                        case 1:
                            //addnew
                            break;
                        case 2:
                            //display list booking
                            break;
                        case 3:
                            //create news contracts
                            break;
                        case 4:
                            //display list contracts
                            break;
                        case 5:
                            //Edit contracts
                            break;
                        case 6:
                            //return
                            break;
                    }
                    break;
                case 5:
                    System.out.println("1.\tDisplay list customers use service\n" +
                            "2.\tDisplay list customers get voucher\n" +
                            "3.\tReturn main menu\n");
                    System.out.print("Select Function: ");
                    try {
                        choicePromotionFunction = Integer.parseInt(scanner.nextLine());
                    } catch (Exception e) {
                        System.out.println("this function doesn't exist, choose another function: ");
                    }
                    switch (choicePromotionFunction) {
                        case 1:
                            //display list customers use service
                            break;
                        case 2:
                            //display list customers get voucher
                            break;
                        case 3:
                            //return menu
                            break;
                    }
                    break;
                case 6:
                    System.exit(6);
                    break;
            }
        }
    }
}
