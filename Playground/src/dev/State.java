package dev;

import java.util.ArrayList;

public class State {

    Playgorund pp;
    private String sname;
    private int sArea;
    public State(String sname){
        this.sname=sname;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    ArrayList<Playgorund> playgorunds= new ArrayList<Playgorund>();

    public void setPlaygorunds(ArrayList<Playgorund> playgorunds) {
        this.playgorunds = playgorunds;
    }

    public ArrayList<Playgorund> getPlaygorunds() {
        return playgorunds;
    }

    public void addPlaygrund(Playgorund pp){
        playgorunds.add(pp);
    }
    public int calStatePlay(){
        for(Playgorund p : playgorunds){
            sArea += p.calArea();
        }
        return sArea;
    }

    public int getsArea() {
        return sArea;
    }

    public void display(){
        System.out.println(getSname()+" area : "+this.calStatePlay());
    }
}
