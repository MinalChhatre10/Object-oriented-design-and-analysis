package dev;

import java.util.ArrayList;

public class Terms {
   private double coef;
   private int power;

   public Terms(double coef , int power){
       this.coef = coef;
       this.power = power;
   }

   public void setterTermC(double coef){
       this.coef= coef;
   }
    public void setterTermP(int power){
        this.power= power;
    }
  public double getterTermC(){
       return coef;
  }
    public int getterTermP(){
        return power;
    }
    public void display(){
       System.out.println(coef+"X^"+power);
    }



}
