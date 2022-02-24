package ss7_abstract_and_interface.exercises.interface_resizeable;

//import ss7_abstract_and_interface.exercises.interface_resizeable.Resizeable;
//import ss7_abstract_and_interface.exercises.interface_resizeable.Shape;
//import ss7_abstract_and_interface.exercises.interface_resizeable.Rectangle;
//import ss7_abstract_and_interface.exercises.interface_resizeable.Circle;
//import ss7_abstract_and_interface.exercises.interface_resizeable.Square;

public class InterfaceResiableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Square(1);
        shapes[2] = new Rectangle(3, 4);
        System.out.println("<**************************************<<Before Resize>>**************************************>");
        for (Shape shape : shapes) {
            System.out.println();
            System.out.println(shape.toString());
        }
        System.out.println("<**************************************<<After Resize>>**************************************>");
        double resizeFactor = Math.random() * 100 + 1;
        System.out.println("With resize factor = " + resizeFactor);
        for (Shape shape : shapes) {
            shape.resize(resizeFactor);
            System.out.println();
            System.out.println(shape.toString());
        }
    }
}
