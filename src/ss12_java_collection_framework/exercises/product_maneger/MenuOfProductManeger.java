package ss12_java_collection_framework.exercises.product_maneger;

import java.util.Scanner;

public class MenuOfProductManeger {
    static ProductManeger newProduct = new ProductManeger();

    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Main Menu:\n" +
                    "1. Add New\n" +
                    "2. Edit\n" +
                    "3. Display\n" +
                    "4. Delete\n" +
                    "5. Search\n" +
                    "6. Sort\n" +
                    "7. Exit\n"
            );
            System.out.print("Select Function: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    newProduct.add();
                    break;
                case 2:
                    newProduct.edit();
                    break;
                case 3:
                    newProduct.showListProduct();
                    break;
                case 4:
                    newProduct.delete();
                    break;
                case 5:
                    newProduct.search();
                    break;
                case 6:
                    newProduct.sort();
                    break;
                case 7:
                    System.exit(0);
            }
        }
    }
}
