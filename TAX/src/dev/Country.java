package dev;

import java.util.ArrayList;

public class Country {
    private String name;
    public Country(String name){
        this.name=name;
    }
    private States st;
    private double tot_country;
    ArrayList<States>states= new ArrayList<States>();

    public void setStates(ArrayList<States> states) {
        this.states = states;
    }

    public ArrayList<States> getStates() {
        return states;
    }
    public void addState(States st){
        states.add(st);
    }
    public double cal_Country_tax(){
        for(States stt : states){
            this.tot_country=this.tot_country+stt.cal_State_tax();
        }
        return this.tot_country;
    }
    public void displayC(){
        System.out.println("Total State Tax amt: "+this.cal_Country_tax());

    }
}
