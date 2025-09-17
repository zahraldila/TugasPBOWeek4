public class Square extends Rectangle {

    public Square() {
        super(1.0, 1.0); // default side = 1.0
    }

    public Square(double side) {
        super(side, side); // panggil Rectangle(width, length)
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();  // karena width == length
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    // override biar Square tetap sisi sama
    @Override
    public void setWidth(double side) {
        setSide(side);
    }

    @Override
    public void setLength(double side) {
        setSide(side);
    }

    @Override
    public String toString() {
        return "A Square with side=" + getSide()
             + ", which is a subclass of " + super.toString();
    }
}
