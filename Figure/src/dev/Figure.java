package dev;

import java.util.ArrayList;

public class Figure {
    private Shapes s ;

    ArrayList<Shapes> ss= new ArrayList<Shapes>();

    public void setSs(ArrayList<Shapes> ss) {
        this.ss = ss;
    }

    public Shapes getS() {
        return s;
    }

    public void addShapes(Shapes sp){
        ss.add(sp);
    }

    public void area(Shapes ss){
        System.out.println(ss.area());
        System.out.println(ss.peri());
    }
}
