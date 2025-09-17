public class TestCircle {
    public static void main(String[] args) {
       // pakai constructor 1 (default)
       Circle c1 = new Circle();
       System.out.println(c1.toString());
 
       // pakai constructor 2 (radius saja)
       Circle c2 = new Circle(3.0);
       System.out.println(c2.toString());
 
       // pakai constructor 3 (radius + color) → hasil modifikasi Task 1.1
       Circle c3 = new Circle(5.0, "blue");
       System.out.println(c3.toString());
 
       // coba getter & setter color
       c3.setColor("green");
       System.out.println("Radius c3 = " + c3.getRadius());
       System.out.println("Color c3 = " + c3.getColor());
       System.out.println("Area c3 = " + c3.getArea());
       System.out.println(c3.toString());
    }
 }
 