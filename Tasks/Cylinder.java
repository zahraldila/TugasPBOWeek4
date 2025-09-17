public class Cylinder extends Circle {
   private double height;

   // default constructor
   public Cylinder() {
       super();
       this.height = 1.0;
   }

   public Cylinder(double radius) {
       super(radius);
       this.height = 1.0;
   }

   public Cylinder(double radius, double height) {
       super(radius);
       this.height = height;
   }

   public Cylinder(double radius, double height, String color) {
       super(radius, color);
       this.height = height;
   }

   public double getHeight() { return height; }

   @Override
   public double getArea() {
       double r = getRadius();
       return 2 * Math.PI * r * height + 2 * super.getArea();
   }

   public double getVolume() {
       return super.getArea() * height;
   }

   // 🔹 Task 1.3: override toString
   @Override
   public String toString() {
       return "Cylinder: subclass of " + super.toString()
            + " height=" + height;
   }
}
