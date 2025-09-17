public class TestSquare2 {
    public static void main(String[] args) {
        Square s1 = new Square();
        System.out.println(s1.toString());

        Square s2 = new Square(5.0);
        System.out.println(s2.toString());
        System.out.println("Area = " + s2.getArea());
        System.out.println("Perimeter = " + s2.getPerimeter());

        Square s3 = new Square(4.0, "pink", true);
        System.out.println(s3.toString());

        // cek setSide
        s3.setSide(10.0);
        System.out.println("After setSide: " + s3.toString());
    }
}
