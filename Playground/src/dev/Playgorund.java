package dev;

public class Playgorund {
    private int length;
    private int width;
    private int area;

    public Playgorund(int length,int width){
        this.length=length;
        this.width=width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int calArea(){
        area= this.length *this.width;
        return area;
    }
    public void diplay(){
        System.out.println("Area of playground: "+this.calArea());
    }
}
