package Developer;

public class Circle {

    private int base;
    private int radius;
    private double area;
    private double perimeter;



//    area of circle = PI * r * r
//    perimeter = 2 * PI * r

    public Circle(int radius) {
        this.radius = radius;
        area = Math.PI * (radius * radius);
        perimeter = 2 * Math.PI * radius;
    }

    public double getAreaOfBase() {
        return area;
    }

    public double getPerimeterOfBase() {
        return perimeter;
    }

    public int getRadius() {
        return radius;
    }
}
