package case_study.furama_resort_maneger.services.employee_service;

import case_study.furama_resort_maneger.models.person.Employee;
import case_study.furama_resort_maneger.util.reader_and_writer.ReaderAndWriter;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeServiceImpl();
        employeeService.displayList();
//        employeeService.addNew();
    }

    Scanner scanner = new Scanner(System.in);
    private static List<Employee> employees = ReaderAndWriter.readEmployeeListFromCSV();
//
//    static {
//        employees.add(new Employee(1, "đà", "12/2", "nam", 123, "0934443123", "lqad1640engineer@gmail.com", "intermediate", "director", 3000));
//        employees.add(new Employee(2, "Việt", "12/2", "nam", 123, "33123123123", "lqad1640engineer@gmail.com", "university", "director", 3000));
//    }

    private static final boolean COUNTINUE = true; //countinue write csv
    private static final boolean NOT_COUNTINUE = false; //override file csv

    private static Employee initializeNewEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter employee's ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("enter employee's name: ");
        String name = scanner.nextLine();
        System.out.println("enter employee's birth day: ");
        String birthDay = scanner.nextLine();
        System.out.println("enter employee's gender: ");
        String gender = scanner.nextLine();
        System.out.println("enter employee's ID card ");
        int idCard = Integer.parseInt(scanner.nextLine());
        System.out.println("enter employee's phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("enter employee's email: ");
        String email = scanner.nextLine();
        String level = null;
        System.out.println("choose employee's level:\n" +
                "1. intermediate\n" +
                "2. colleges\n" +
                "3. university\n" +
                "4. graduate level");
        String[] levelEducation = {"intermediate", "colleges", "university", "graduate level"};
        int choiceLevel = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < levelEducation.length; i++) {
            if (choiceLevel - 1 == i) {
                level = levelEducation[i];
            }
        }
        String position = "";
        System.out.println("choose employee's position\n" +
                "1. recetionist\n" +
                "2. service\n" +
                "3. expert\n" +
                "4. monitoring\n" +
                "5. maneger\n" +
                "6. director");
        String[] positionEployee = {"recetionist", "service", "expert", "monitoring", "maneger", "director"};
        int choicePosition = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < positionEployee.length; i++) {
            if (choicePosition - 1 == i) {
                position = positionEployee[i];
            }
        }
        System.out.println("enter employee's salary: ");
        double salary = Double.parseDouble(scanner.nextLine());
        return new Employee(id, name, birthDay, gender, idCard, phoneNumber, email, level, position, salary);
    }

    @Override
    public void addNew() {
        Employee newEmployee = initializeNewEmployee();
        employees.add(newEmployee);
        ReaderAndWriter.writeEmployeeToCSV(employees,COUNTINUE);
    }

    @Override
    public void displayList() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }


    @Override
    public void editElement() {
        System.out.print("you want update by:\n" +
                "1. name\n" +
                "2. id\n" +
                "select function: ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                System.out.println("enter name you want to update: ");
                String editName = scanner.nextLine().toLowerCase();
                boolean flag1 = false;
                for (int i = 0; i < employees.size(); i++) {
                    if (employees.get(i).getName().toLowerCase().contains(editName)) {
                        Employee updateEmployee = initializeNewEmployee();
                        employees.set(i, updateEmployee);
                        flag1 = true;
                        ReaderAndWriter.writeEmployeeToCSV(employees, NOT_COUNTINUE);
                        break;
                    }
                }

                if (!flag1) {
                    System.out.println("not exist in list");
                }
                break;
            case 2:
                System.out.println("enter id you want to update ");
                int editID = Integer.parseInt(scanner.nextLine());
                boolean flag2 = false;
                for (int i = 0; i < employees.size(); i++) {
                    if (employees.get(i).getId() == editID) {
                        Employee updateEmployee = initializeNewEmployee();
                        employees.set(i, updateEmployee);
                        flag2 = true;
                        ReaderAndWriter.writeEmployeeToCSV(employees, NOT_COUNTINUE);
                        break;
                    }
                }
                if (!flag2) {
                    System.out.println("not exist in list");
                }
                break;
        }
    }
}
