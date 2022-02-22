package ss5_access_modifier_static_method_static_property.exercises.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        System.out.print("<-------------------------------------------<<Initialize A New Object(Circle) On Another Class>>----------------------------------------------->\n");
        Circle newCircle = new Circle(15);
        System.out.print("Radius of the new circle is: " + newCircle.getRadius() + "\n");
        System.out.print("We have area of the circle which has radisus = " + newCircle.getRadius() + " is " + newCircle.getArea() + "\n");
        System.out.print("<-------------------------------------------<<Initialize A New Object(Circle) With Default Set Up>>----------------------------------------------->\n");
        Circle newDefaultCircle = new Circle();
        System.out.print("Radius of the new circle is: " + newDefaultCircle.getRadius() + "\n");
        System.out.print("We have area of the circle which has radisus = " + newDefaultCircle.getRadius() + " is " + newDefaultCircle.getArea() + "\n");
    }
}
