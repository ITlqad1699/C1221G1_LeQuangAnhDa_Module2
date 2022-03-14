package ss17_io_binary_and_serialization.exercises.product_maneger.controllers;

import ss17_io_binary_and_serialization.exercises.product_maneger.services.ProductServiceImpl;

import java.util.Scanner;

public class MenuControllers {
    private static ProductServiceImpl productService = new ProductServiceImpl();
    public static void  displayMenu() {
        int choice;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("******************Product Maneger******************");
            System.out.print("* Main Menu:                                      *\n" +
                    "* 1. Add New                                      *\n" +
                    "* 2. Display                                      *\n" +
                    "* 3. Search                                       *\n" +
                    "* 4. Exit                                         *\n"
            );
            System.out.println("***************************************************");
            System.out.print("Select Function: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productService.addNew();
                    break;
                case 2:
                    productService.displayProduct();
                    break;
                case 3:
                    productService.searchProduct();
                    break;
                case 4:
                    System.exit(4);
                    break;
            }
        }
    }
}
