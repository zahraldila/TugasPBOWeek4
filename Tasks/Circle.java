public class Circle {
    private double radius;
    private String color;

    // 1st constructor (default)
    public Circle() {
       radius = 1.0;
       color  = "red";
    }

    // 2nd constructor
    public Circle(double r) {
       radius = r;
       color  = "red";
    }

    // 3rd constructor (Task 1.1)
    public Circle(double r, String c) {
       radius = r;
       color  = c;
    }

    public double getRadius() { return radius; }
    public double getArea() { return radius * radius * Math.PI; }

    public String getColor() { return color; }
    public void setColor(String c) { this.color = c; }

    @Override
    public String toString() {
       return "Circle[radius=" + radius + " color=" + color + "]";
    }
}
