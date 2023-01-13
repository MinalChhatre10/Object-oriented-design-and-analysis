package dev;

import java.util.ArrayList;

public class States {
    private String name;
    public States(String name){
        this.name=name;
    }
   private Taxpayer tp;
   private double state_total;

   ArrayList<Taxpayer> taxpayers=new ArrayList<Taxpayer>();

    public ArrayList<Taxpayer> getTaxpayers() {
        return taxpayers;
    }

    public void setTaxpayers(ArrayList<Taxpayer> taxpayers) {
        this.taxpayers = taxpayers;
    }

    public void addTaxPayers(Taxpayer tp){
        taxpayers.add(tp);
    }

    public double cal_State_tax(){
        for(Taxpayer tp : taxpayers){
            this.state_total=this.state_total+tp.cal_tax();
        }
        return this.state_total;
    }
    public void displayS(){
        System.out.println("Total State Tax amt: "+this.cal_State_tax());

    }
}
