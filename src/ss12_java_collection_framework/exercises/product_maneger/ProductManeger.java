package ss12_java_collection_framework.exercises.product_maneger;

import java.util.*;

public class ProductManeger extends Product {

    Scanner scanner = new Scanner(System.in);

    private static ArrayList<Product> products = new ArrayList<>();
    private static Product product1 = new Product(1, "Milk", 10, 4000);
    private static Product product2 = new Product(2, "Beer", 15, 5000);
    private static Product product3 = new Product(3, "Pepsi", 20, 3000);

    static {
        products.add(product1);
        products.add(product2);
        products.add(product3);
    }

    public void showListProduct() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void edit() {
        System.out.print("Enter Product's ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                System.out.print("Enter Product's new ID: ");
                int newId = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter Product's new name: ");
                String newName = scanner.nextLine();
                System.out.print("Enter Product's new amount: ");
                int newAmount = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter Product's new price: ");
                double newPrice = Double.parseDouble(scanner.nextLine());
                products.get(i).setId(newId);
                products.get(i).setName(newName);
                products.get(i).setAmount(newAmount);
                products.get(i).setPrice(newPrice);
                break;
            } else {
                count += 1;
            }
        }
        if (count >= products.size()) {
            System.out.println("Couldn't Find Product's ID");
        }
    }

    public void delete() {
        System.out.println("Enter Product's ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(i);
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Couldn't Find Product's ID");
        }
    }

    public void search() {
        System.out.print("Enter Product's Name: ");
        String name = scanner.nextLine();
        boolean flag = false;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(name)) {
                System.out.println(products.get(i));
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.print("Couldn't Find Product's Name");
        }
    }

    public void add() {
        System.out.print("Enter New Product's ID: ");
        int newId = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter New Product's Name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter New Product's Amount: ");
        int newAmount = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter New Product's Price: ");
        double newPrice = Double.parseDouble(scanner.nextLine());
        Product newProduct = new Product(newId, newName, newAmount, newPrice);
        products.add(newProduct);
    }

    public void sort() {
        ProductComparator sortUp = new ProductComparator();
        products.sort(sortUp);
    }
}
