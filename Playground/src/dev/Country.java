package dev;

import java.util.ArrayList;

public class Country {
    State ss;
    private int cArea;

   private String cname;
    ArrayList<State> states= new ArrayList<State>();
    public Country(String cname){
        this.cname=cname;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }


    public void setStates(ArrayList<State> states) {
        this.states = states;
    }

    public ArrayList<State> getStates() {
        return states;
    }

    public void addSTATE(State SS){
        states.add(SS);
    }
    public int calCOUNTRYPlay(){
        for(State ss : states){
            cArea += ss.getsArea();
        }
        return cArea;
    }

    public int getcArea() {
        return cArea;
    }

    public void display(){
        System.out.println(getCname()+" area : "+this.calCOUNTRYPlay());
    }


}
