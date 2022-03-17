package case_study.furama_resort_maneger.services.facility_service;

import case_study.furama_resort_maneger.models.facility.Facility;
import case_study.furama_resort_maneger.models.facility.House;
import case_study.furama_resort_maneger.models.facility.Room;
import case_study.furama_resort_maneger.models.facility.Villa;
import case_study.furama_resort_maneger.services.validate.EnterParameter;
import case_study.furama_resort_maneger.services.validate.ValidateRentalType;
import case_study.furama_resort_maneger.services.validate.ValidateServiceCode;
import case_study.furama_resort_maneger.services.validate.ValidateServiceName;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    //test thử:
    public static void main(String[] args) {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        facilityService.addNew();
        facilityService.displayList();
    }

    Scanner scanner = new Scanner(System.in);
    Map<Facility, Integer> facilitySerice = new LinkedHashMap<>();
    /*Villa*/
    private static Facility initializeVilla() {
        Scanner scanner = new Scanner(System.in);
        //service name:
        String nameService = ValidateServiceName.getValidateServiceName();
        //usable area:
        double usableArea = EnterParameter.enterUsableArea();
        //rental cost:
        double rentalCost = EnterParameter.enterRentalCost();
        //maximum people
        int maximumPeople = EnterParameter.enterMaximumPeople();
        //rental type:
        String rentalType = ValidateRentalType.validateRentalType();
        //service code
        String serviceCode = ValidateServiceCode.validateVillaMethod();
        //Room standard
        System.out.println("enter room standard : ");
        String roomStandard = scanner.nextLine();
        //swimming pool area
        double swimmingPoolArea = EnterParameter.enterSwimmingPoolArea();
        //floornumber:
        int floorNumber = EnterParameter.enterFloor();
        return new Villa(nameService, usableArea, rentalCost, maximumPeople, rentalType, serviceCode, roomStandard, swimmingPoolArea, floorNumber);
    }
    /*House*/
    private static Facility initializeHouse() {
        Scanner scanner = new Scanner(System.in);
        //service name:
        String nameService = ValidateServiceName.getValidateServiceName();
        //usable area:
        double usableArea = EnterParameter.enterUsableArea();
        //rental cost:
        double rentalCost = EnterParameter.enterRentalCost();
        //maximum people:
        int maximumPeople = EnterParameter.enterMaximumPeople();
        //rental type:
        String rentalType = ValidateRentalType.validateRentalType();
        //serviceCode
        String serviceCode = ValidateServiceCode.validateHouseMethod();
        //roomstandard:
        System.out.println("enter room standard : ");
        String roomStandard = scanner.nextLine();
        //floornumber:
        int floorNumber = EnterParameter.enterFloor();
        return new House(nameService, usableArea, rentalCost, maximumPeople, rentalType, serviceCode, roomStandard, floorNumber);
    }
    /*Room*/
    private static Facility initizalizeRoom() {
        Scanner scanner = new Scanner(System.in);
        //service name:
        String nameService = ValidateServiceName.getValidateServiceName();
        //usable area:
        double usableArea = EnterParameter.enterUsableArea();
        //rental cost:
        double rentalCost = EnterParameter.enterRentalCost();
        //maximum people:
        int maximumPeople = EnterParameter.enterMaximumPeople();
        //rental type:
        String rentalType = ValidateRentalType.validateRentalType();
        //service code:
        String serviceCode = ValidateServiceCode.validateRoomMethod();
        //free service included:
        System.out.println("enter free service included: ");
        String freeServiceincluded = scanner.nextLine();
        return new Room(nameService, usableArea, rentalCost, maximumPeople, rentalType, serviceCode, freeServiceincluded);
    }

    @Override
    public void addNew() {
        System.out.println("1. Add new villa\n" +
                "2. Add new house\n" +
                "3. Add new room\n" +
                "4. Back to menu\n" +
                "select function: ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                Facility newVilla = initializeVilla();
                facilitySerice.put(newVilla, 0);
                break;
            case 2:
                Facility newHouse = initializeHouse();
                facilitySerice.put(newHouse, 0);
                break;
            case 3:
                Facility newRoom = initizalizeRoom();
                facilitySerice.put(newRoom, 0);
                break;
            case 4:
                //Back to menu
                break;
        }
    }

    @Override
    public void displayList() {
        for (Map.Entry<Facility, Integer> entry : facilitySerice.entrySet()) {
            System.out.println("service: " + entry.getKey() +
                    "\nbooking: " + entry.getValue());
        }
    }

    @Override
    public void displayFacilityMaintenance() {

    }
}
