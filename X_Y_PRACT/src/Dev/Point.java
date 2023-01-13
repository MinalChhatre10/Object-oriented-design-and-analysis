package Dev;

import java.util.*;
import java.math.*;

public class Point {
    private int xCordinate;
    private int yCordinate;

    private int x1;
    private int y1;

    public Point(int xCordinate,int yCordinate){
        this.xCordinate=xCordinate;
        this.yCordinate=yCordinate;
    }

    public int getxCordinate() {
        return xCordinate;
    }

    public int getyCordinate() {
        return yCordinate;
    }

    public void setxCordinate(int xCordinate) {
        this.xCordinate = xCordinate;
    }

    public void setyCordinate(int yCordinate) {
        this.yCordinate = yCordinate;
    }
    public int translation_x(int xOffset){
        return this.xCordinate+xOffset;
    }
    public int translation_y(int yOffset){
        return this.yCordinate+yOffset;
    }
    public int scaling_x(int xFactor){
        return this.xCordinate*xFactor;
    }
    public int scaling_y(int yFactor){
        return this.yCordinate*yFactor;
    }
    public void rotation_o(double angle){
        double x= this.xCordinate*Math.cos(angle)+this.yCordinate*Math.sin(angle) ;
        double y= (-this.xCordinate*Math.sin(angle))+this.yCordinate*Math.cos(angle) ;

        System.out.println("x: "+x+" y: "+y);
    }


}
