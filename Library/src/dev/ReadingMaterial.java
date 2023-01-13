package dev;
import dev.Library;

import java.util.ArrayList;

public abstract class ReadingMaterial {
    private String Title;
    private double price;


    public ReadingMaterial(String Title,double price){
        this.Title = Title;
        this.price = price;
    }


    public void setTitle(String Title){
        this.Title = Title;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public String getTitle() {
        return this.Title;
    }

    public abstract void display();
}
