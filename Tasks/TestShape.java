public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        System.out.println(s1.toString());

        Shape s2 = new Shape("blue", false);
        System.out.println(s2.toString());

        s2.setColor("yellow");
        s2.setFilled(true);
        System.out.println("Color = " + s2.getColor());
        System.out.println("Filled? " + s2.isFilled());
        System.out.println(s2.toString());
    }
}
