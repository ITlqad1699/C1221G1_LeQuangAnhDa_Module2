package ss17_io_binary_and_serialization.exercises.product_maneger.view;

import ss17_io_binary_and_serialization.exercises.product_maneger.controllers.MenuControllers;

public class View {
    public static void main(String[] args) {
        MenuControllers menuControllers = new MenuControllers();
        menuControllers.displayMenu();
    }

}
