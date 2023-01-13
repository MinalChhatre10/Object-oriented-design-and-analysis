package dev;

public class Point {
    private int x_coordinate;
    private int y_coordinate;
    private int x1,y1;

    public Point(int x_coordinate,int y_coordinate){
        this.x_coordinate=x_coordinate;
        this.y_coordinate=y_coordinate;
        this.x1=x_coordinate;
        this.y1=y_coordinate;
    }

    public void setX_coordinate(int x_coordinate) {
        this.x_coordinate = x_coordinate;
    }

    public void setY_coordinate(int y_coordinate) {
        this.y_coordinate = y_coordinate;
    }

    public int translation_x(int xOffset){
        this.x1 = this.x_coordinate+xOffset;
        return this.x1;
    }

    public int translation_y(int yOffset){
        this.y1 = this.y_coordinate+yOffset;
        return this.y1;
    }

    public int scaling_x(int xFactor){
        this.x1 = this.x_coordinate*xFactor;
        return this.x1;
    }

    public int scaling_y(int yFactor){
        this.y1 = this.y_coordinate*yFactor;
        return this.y1;
    }

    public void rotation_O(double angle){
        int x= (int) (this.x_coordinate*Math.cos(angle)+this.y_coordinate*Math.sin(angle));
        int y= (int) (-this.x_coordinate*Math.sin(angle)+this.y_coordinate*Math.cos(angle));
        System.out.println("rotation_O by angle "+angle+" : P( " + x + ", " + y+ " )");
    }

    public void display(){
        System.out.println("x: "+this.x1+" y: "+this.y1);
    }


}
