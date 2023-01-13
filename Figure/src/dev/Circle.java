package dev;

public class Circle extends Shapes{

    public final double PI=3.14;
    private int radius;
    public Circle(String boundry_col, String fill_col,int radius) {
        super(boundry_col, fill_col);
        this.radius=radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public double area(){
        return PI*this.radius*this.radius;
    }
    public double peri(){
        return 2*PI*this.radius;
    }
}
