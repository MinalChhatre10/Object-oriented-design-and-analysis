package dev;

public class Stop {
    private String stopName;

    public Stop(String stopName){
        this.stopName=stopName;
    }
    public void setStopName(String stopName){
        this.stopName=stopName;
    }
    public String getStopName(){
        return this.stopName;
    }
    public void display(){
        System.out.println("Stop name: "+stopName);
    }
}
