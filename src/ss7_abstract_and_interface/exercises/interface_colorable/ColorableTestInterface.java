package ss7_abstract_and_interface.exercises.interface_colorable;

public class ColorableTestInterface {
    public static void main(String[] args) {
        Shape[] squares = new Shape[3];
        squares[0] = new Square(4, "no color", false);
        squares[1] = new Square(7, "no color", true);
        squares[2] = new Square(3, "no color", true);
        System.out.println("<**************************************<<Before Color>>**************************************>");
        for (Shape square : squares) {
            System.out.println(square.getColor());
        }
        System.out.println("<**************************************<<After Color>>**************************************>");
        for (Shape square : squares) {
            System.out.println(square + "\nater color");
            square.howToColor();
            System.out.println(square.getColor() + "\n");
        }
    }
}
