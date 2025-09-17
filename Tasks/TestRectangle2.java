public class TestRectangle2 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println(r1.toString());

        Rectangle r2 = new Rectangle(2.0, 5.0);
        System.out.println(r2.toString());
        System.out.println("Area = " + r2.getArea());
        System.out.println("Perimeter = " + r2.getPerimeter());

        Rectangle r3 = new Rectangle(3.0, 4.0, "purple", false);
        System.out.println(r3.toString());
    }
}
