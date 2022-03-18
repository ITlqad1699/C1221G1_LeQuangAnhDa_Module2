package case_study.furama_resort_maneger.util.reader_and_writer;

import case_study.furama_resort_maneger.models.booking.Booking;
import case_study.furama_resort_maneger.models.contract.Contract;
import case_study.furama_resort_maneger.models.facility.Facility;
import case_study.furama_resort_maneger.models.facility.House;
import case_study.furama_resort_maneger.models.facility.Room;
import case_study.furama_resort_maneger.models.facility.Villa;
import case_study.furama_resort_maneger.models.person.Customer;
import case_study.furama_resort_maneger.models.person.Employee;

import java.io.File;
import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class ReaderAndWriter {
    private static final String EMPLOYEES_FILE = "D:\\codegym\\module2_codegym\\src\\case_study\\furama_resort_maneger\\data\\employee_data\\employee.csv";
    private static final String CUSTOMERS_FILE = "D:\\codegym\\module2_codegym\\src\\case_study\\furama_resort_maneger\\data\\customer_data\\customer.csv";
    private static final String HOUSE_FILE = "D:\\codegym\\module2_codegym\\src\\case_study\\furama_resort_maneger\\data\\facility_data\\house.csv";
    private static final String VILLA_FILE = "D:\\codegym\\module2_codegym\\src\\case_study\\furama_resort_maneger\\data\\facility_data\\villa.csv";
    private static final String ROOM_FILE = "D:\\codegym\\module2_codegym\\src\\case_study\\furama_resort_maneger\\data\\facility_data\\room.csv";
    private static final String BOOKING_FILE = "D:\\codegym\\module2_codegym\\src\\case_study\\furama_resort_maneger\\data\\customer_data\\customer.csv";
    private static final String CONTRACT_FILE = "D:\\codegym\\module2_codegym\\src\\case_study\\furama_resort_maneger\\data\\contract_data\\contract.csv";

    /*
     * writer method:
     */
    private static void writeListStringToCSV(String filePath, List<String> stringList, boolean append) {
        File file = new File(filePath);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String string : stringList) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
     * write employee to csv:
     */
    public static void writeEmployeeToCSV(List<Employee> employeeList, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Employee employee : employeeList) {
            stringList.add(employee.getInFoToCSV());
        }
        writeListStringToCSV(EMPLOYEES_FILE, stringList, append);
    }

    /*
     * write customer to csv:
     */
    public static void writeCustomerToCSV(List<Customer> customerList, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Customer customer : customerList) {
            stringList.add(customer.getInFoToCSV());
        }
        writeListStringToCSV(CUSTOMERS_FILE, stringList, append);
    }

    /*
     * write villa to csv:
     */
    public static void writeVillaToCSV(List<Facility> villaList, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Facility villa : villaList) {
            stringList.add(villa.getInFoToCSV());
        }
        writeListStringToCSV(VILLA_FILE, stringList, append);
    }

    /*
     * write house to csv:
     */
    public static void writeHouseToCSV(List<Facility> houseList, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Facility house : houseList) {
            stringList.add(house.getInFoToCSV());
        }
        writeListStringToCSV(HOUSE_FILE, stringList, append);
    }

    /*
     * write room to csv:
     */
    public static void writeRoomToCSV(List<Facility> roomList, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Facility room : roomList) {
            stringList.add(room.getInFoToCSV());
        }
        writeListStringToCSV(ROOM_FILE, stringList, append);
    }

    /*
     * write booking to csv:
     */
    public static void writeBookingToCSV(List<Booking> bookingList, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Booking booking : bookingList) {
            stringList.add(booking.toString());
        }
        writeListStringToCSV(BOOKING_FILE, stringList, append);
    }

    /*
     * write booking to csv:
     */
    public static void writeContractToCSV(List<Contract> contractList, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Contract contract : contractList) {
            stringList.add(contract.toString());
        }
        writeListStringToCSV(CONTRACT_FILE, stringList, append);
    }

    /*
     * reader method:
     */
    private static List<String> readListStringFromCSV(String pathFile) {
        List<String> stringList = new ArrayList<>();
        File file = new File(pathFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    /*
     *read file customer.csv
     */
    public static List<Customer> readCustomerListFromCSV() {
        List<Customer> customerList = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(CUSTOMERS_FILE);
        String[] arr = null;
        for (int i = 0; i < stringList.size(); i++) {
            if (!stringList.get(i).isEmpty()) {
                arr = stringList.get(i).split(",");
                Customer customer = new Customer(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3], Integer.parseInt(arr[4]), arr[5], arr[6], arr[7], arr[8]);
                customerList.add(customer);
            }
        }
        return customerList;
    }

    /*
     *read file employee.csv
     */
    public static List<Employee> readEmployeeListFromCSV() {
        List<Employee> employeeList = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(EMPLOYEES_FILE);
        String[] arr = null;
        for (int i = 0; i < stringList.size(); i++) {
            if (!stringList.get(i).isEmpty()) {
                arr = stringList.get(i).split(",");
                Employee employee = new Employee(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3], Integer.parseInt(arr[4]), arr[5], arr[6], arr[7], arr[8], Double.parseDouble(arr[9]));
                employeeList.add(employee);
            }
        }
        return employeeList;
    }

    /*
     *read file villa.csv
     */
    public static List<Facility> readVillaListFromCSV() {
        List<Facility> villas = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(VILLA_FILE);
        String[] arr = null;
        for (int i = 0; i < stringList.size(); i++) {
            if (!stringList.get(i).isEmpty()) {
                arr = stringList.get(i).split(",");
                Facility villa = new Villa(arr[0], Double.parseDouble(arr[1]), Double.parseDouble(arr[2]), Integer.parseInt(arr[3]), arr[4], arr[5], arr[6], Double.parseDouble(arr[7]), Integer.parseInt(arr[8]));
                villas.add(villa);
            }
        }
        return villas;
    }

    /*
     *read file house.csv
     */
    public static List<Facility> readHouseListFromCSV() {
        List<Facility> houses = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(HOUSE_FILE);
        String[] arr = null;
        for (int i = 0; i < stringList.size(); i++) {
            if (!stringList.get(i).isEmpty()) {
                arr = stringList.get(i).split(",");
                Facility house = new House(arr[0], Double.parseDouble(arr[1]), Double.parseDouble(arr[2]), Integer.parseInt(arr[3]), arr[4], arr[5], arr[6], Integer.parseInt(arr[7]));
                houses.add(house);
            }
        }
        return houses;
    }

    /*
     *read file room.csv
     */
    public static List<Facility> readRoomListFromCSV() {
        List<Facility> rooms = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(ROOM_FILE);
        String[] arr = null;
        for (int i = 0; i < stringList.size(); i++) {
            if (!stringList.get(i).isEmpty()) {
                arr = stringList.get(i).split(",");
                Facility room = new Room(arr[0], Double.parseDouble(arr[1]), Double.parseDouble(arr[2]), Integer.parseInt(arr[3]), arr[4], arr[5], arr[6]);
                rooms.add(room);
            }
        }
        return rooms;
    }

    /*
     *read file booking.csv
     */
    public static List<Booking> readBookingListFromCSV() {
        List<Booking> bookings = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(BOOKING_FILE);
        String[] arr = null;
        for (int i = 0; i < stringList.size(); i++) {
            if (!stringList.get(i).isEmpty()) {
                arr = stringList.get(i).split(",");
                Booking booking = new Booking(Integer.parseInt(arr[0]), arr[1], arr[2], Integer.parseInt(arr[3]), arr[4], arr[5]);
                bookings.add(booking);
            }
        }
        return bookings;
    }

    /*
     *read file contract.csv
     */
    public static List<Contract> readContractListFromCSV() {
        List<Contract> contracts = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(CONTRACT_FILE);
        String[] arr = null;
        for (String string : stringList) {
            arr = string.split(",");
            Contract contract = new Contract(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Double.parseDouble(arr[2]), Double.parseDouble(arr[3]), Integer.parseInt(arr[4]));
            contracts.add(contract);
        }
        return contracts;
    }
}
