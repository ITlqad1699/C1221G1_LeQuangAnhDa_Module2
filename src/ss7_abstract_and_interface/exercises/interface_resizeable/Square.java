package ss7_abstract_and_interface.exercises.interface_resizeable;

import ss7_abstract_and_interface.exercises.interface_resizeable.Resizeable;

public class Square extends Rectangle implements Resizeable {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        // can use super or not, it's up to you because Access Modifier is public:
        setWidth(getWidth() * percent);
        setLength(getLength() * percent);
    }
}
