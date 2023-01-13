package dev;

public class Conductor {
    private String ConductorName;

    public Conductor(String ConductorName){
        this.ConductorName=ConductorName;
    }

    public void display(){
        System.out.println("Conductor Name: " + ConductorName);
    }

    public void setConductorName(String ConductorName){
        this.ConductorName = ConductorName;
    }

    public String getConductorName(){
        return this.ConductorName;
    }
}
