package Developer;

import Developer.Circle;

public class Cylinder {
    private int height;
    private double surfaceArea, perimeterOfCylinder;
    private Circle base;

//    Surface area = (2 * PI * r * h) + (2 * PI * r * r)
//    Perimeter of cylinder  = (4 * r) + (2 * h)

    public Cylinder(int height, int radius) {
        this.height = height;
        base = new Circle(radius);
       // System.out.println("Radius = " + base.getRadius());
    }

    public double getSurfaceArea() {
        surfaceArea =  (base.getPerimeterOfBase() * height) + (2 * base.getAreaOfBase());
        
        return surfaceArea;
    }

    public double getPerimeterOfCylinder() {
        perimeterOfCylinder = (4 * base.getRadius()) + (2 * height);
        return perimeterOfCylinder;
    }
}
