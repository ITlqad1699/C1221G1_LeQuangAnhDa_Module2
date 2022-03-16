package case_study.furama_resort_maneger.services.customer_service;

import case_study.furama_resort_maneger.models.person.Customer;
import case_study.furama_resort_maneger.models.person.Employee;

import java.util.LinkedList;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerServiceImpl();
        customerService.editElement();
        customerService.displayList();
    }
    Scanner scanner = new Scanner(System.in);
    private static LinkedList<Customer> customers = new LinkedList<>();

    static {
        customers.add(new Customer(1,"vu","15/3","nam",12,"093433445","tienvu@gmail.com","vip","nghĩa đàn"));
    }

    /* initialize a new employee: */
    private static Customer initializeNewCustomer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter customer's ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("enter customer's name: ");
        String name = scanner.nextLine();
        System.out.println("enter customer's birth day: ");
        String birthDay = scanner.nextLine();
        System.out.println("enter customer's gender: ");
        String gender = scanner.nextLine();
        System.out.println("enter customer's ID card ");
        int idCard = Integer.parseInt(scanner.nextLine());
        System.out.println("enter customer's phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("enter customer's email: ");
        String email = scanner.nextLine();
        System.out.println("enter customer's type: ");
        String customerType = scanner.nextLine();
        System.out.println("enter customer's address: ");
        String address = scanner.nextLine();
        return new Customer(id, name, birthDay, gender, idCard, phoneNumber, email, customerType, address);
    }

    @Override
    public void addNew() {
        Customer newCustomer = initializeNewCustomer();
        customers.add(newCustomer);
    }

    @Override
    public void displayList() {
        for(Customer customer: customers){
            System.out.println(customer);
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
                for (int i = 0; i < customers.size(); i++) {
                    if (customers.get(i).getName().toLowerCase().contains(editName)) {
                        Customer updateCustomer = initializeNewCustomer();
                        customers.set(i, initializeNewCustomer());
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
                for (int i = 0; i < customers.size(); i++) {
                    if (customers.get(i).getId() == editID) {
                        Customer updateCustomer = initializeNewCustomer();
                        customers.set(i, initializeNewCustomer());
                        flag2 = true;
                    }
                    if (!flag2) {
                        System.out.println("not exist in list");
                    }
                }
                break;
        }
    }

    @Override
    public void displayListCustomersUseService() {

    }

    @Override
    public void displayListCustomersGetVoucher() {

    }

}
