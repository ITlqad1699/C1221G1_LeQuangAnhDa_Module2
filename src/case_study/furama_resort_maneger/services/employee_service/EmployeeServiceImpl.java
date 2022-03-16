package case_study.furama_resort_maneger.services.employee_service;

import case_study.furama_resort_maneger.models.person.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    Scanner scanner = new Scanner(System.in);
    private static ArrayList<Employee> employees = new ArrayList<>();

    static {
        employees.add(new Employee());
    }
    /* initialize a new employee: */
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
        System.out.println("enter employee's level: ");
        String level = scanner.nextLine();
        System.out.println("enter employee's position: ");
        String position = scanner.nextLine();
        System.out.println("enter employee's salary: ");
        double salary = Double.parseDouble(scanner.nextLine());
        return new Employee(id, name, birthDay, gender, idCard, phoneNumber, email, level, position, salary);
    }

    @Override
    public void addNew() {
        Employee newEmployee = initializeNewEmployee();
        employees.add(newEmployee);
    }

    @Override
    public void displayList() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }


    @Override
    public void editElement() {
        System.out.println("you want update by:\n" +
                "1. name\n" +
                "2. id\n"+
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
                        employees.set(i, initializeNewEmployee());
                        flag1 = true;
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
                        employees.set(i, initializeNewEmployee());
                        flag2 = true;
                    }
                    if (!flag2) {
                        System.out.println("not exist in list");
                    }
                }
                break;
        }
    }
}
