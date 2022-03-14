package ss17_io_binary_and_serialization.exercises.product_maneger.services;

import ss17_io_binary_and_serialization.exercises.product_maneger.models.Product;
import ss17_io_binary_and_serialization.exercises.product_maneger.util.ReaderAndWriter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductServiceImpl extends ReaderAndWriter implements IServices{
    Scanner scanner = new Scanner(System.in);
    private static List<ss17_io_binary_and_serialization.exercises.product_maneger.models.Product> products = new ArrayList<>();
    private static List<ss17_io_binary_and_serialization.exercises.product_maneger.models.Product> productsSearch = new ArrayList<>();
    static {
        products.add(new Product(1, "Beer",10,3000));
    }
    public static final String PRODUCT_FILE_DAT = "D:\\codegym\\module2_codegym\\src\\ss17_io_binary_and_serialization\\exercises\\product_maneger\\data\\Product.txt";
    public static final String SEARCHING_PRODUCT = "D:\\codegym\\module2_codegym\\src\\ss17_io_binary_and_serialization\\exercises\\product_maneger\\data\\SearchingProduct.txt";
    @Override
    public void addNew() {
        System.out.print("Enter New Product's ID: ");
        int newId = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter New Product's Name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter New Product's Amount: ");
        int newAmount = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter New Product's Price: ");
        double newPrice = Double.parseDouble(scanner.nextLine());
        ss17_io_binary_and_serialization.exercises.product_maneger.models.Product newProduct = new Product(newId, newName, newAmount, newPrice);
        products.add(newProduct);
        writeToFile(PRODUCT_FILE_DAT,products);
    }

    @Override
    public void searchProduct() {
        System.out.print("Enter Product's Name: ");
        String name = scanner.nextLine();
        boolean flag = false;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(name)) {
                System.out.println(products.get(i));
                writeToFile(SEARCHING_PRODUCT,productsSearch);
                flag = true;
            }
        }
        if (!flag) {
            System.out.print("Couldn't Find Product's Name");
        }
    }

    @Override
    public void displayProduct() {
        readDataFromFile(PRODUCT_FILE_DAT);
    }
}
