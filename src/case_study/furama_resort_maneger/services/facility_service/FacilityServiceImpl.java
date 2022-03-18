package case_study.furama_resort_maneger.services.facility_service;

import case_study.furama_resort_maneger.models.facility.Facility;
import case_study.furama_resort_maneger.models.facility.House;
import case_study.furama_resort_maneger.models.facility.Room;
import case_study.furama_resort_maneger.models.facility.Villa;
import case_study.furama_resort_maneger.util.validate.EnterParameter;
import case_study.furama_resort_maneger.util.validate.ValidateRentalType;
import case_study.furama_resort_maneger.util.validate.ValidateServiceCode;
import case_study.furama_resort_maneger.util.validate.ValidateServiceName;
import case_study.furama_resort_maneger.util.reader_and_writer.ReaderAndWriter;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    //test thử:
    public static void main(String[] args) {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
//        facilityService.addNew();
        facilityService.displayList();
    }

    Scanner scanner = new Scanner(System.in);
    private static Map<Facility, Integer> facilitySerice = new LinkedHashMap<>();
    private static List<Facility> villaList = ReaderAndWriter.readVillaListFromCSV();
    private static List<Facility> houseList = ReaderAndWriter.readHouseListFromCSV();
    private static List<Facility> roomList = ReaderAndWriter.readRoomListFromCSV();
    private static final boolean COUNTINUE = true; //countinue write csv
    private static final boolean NOT_COUNTINUE = false; //override file csv

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
                villaList.add(newVilla);
                facilitySerice.put(newVilla, 0);
                ReaderAndWriter.writeVillaToCSV(villaList, COUNTINUE);
                break;
            case 2:
                Facility newHouse = initializeHouse();
                houseList.add(newHouse);
                facilitySerice.put(newHouse, 0);
                ReaderAndWriter.writeHouseToCSV(houseList, COUNTINUE);
                break;
            case 3:
                Facility newRoom = initizalizeRoom();
                roomList.add(newRoom);
                facilitySerice.put(newRoom, 0);
                ReaderAndWriter.writeRoomToCSV(roomList, COUNTINUE);
                break;
            case 4:
                //Back to menu
                break;
        }
    }

    @Override
    public void displayList() {
        for (Facility villa : villaList) {
            facilitySerice.put(villa, 0);
        }
        for (Facility house : houseList) {
            facilitySerice.put(house, 0);
        }
        for (Facility room : roomList) {
            facilitySerice.put(room, 0);
        }
        for (Map.Entry<Facility, Integer> entry : facilitySerice.entrySet()) {
            System.out.println("service: " + entry.getKey() +
                    "\nbooking: " + entry.getValue());
        }
    }

    @Override
    public void displayFacilityMaintenance() {
        List<Facility> facilities = new ArrayList<>();
        System.out.println("Facility needs maintenace: ");
        for (Map.Entry<Facility, Integer> entry : facilitySerice.entrySet()) {
            if (entry.getValue() > 5) {
                facilities.add(entry.getKey());
            }
        }
    }
}
