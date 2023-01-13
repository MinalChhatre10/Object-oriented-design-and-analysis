package dev;

import java.util.ArrayList;

public abstract class Bus {
    private int regNo;
    private Driver DName;
    private ArrayList<Route> routes = new ArrayList<Route>();

    public Bus(int regNo) {
        this.regNo = regNo;
    }

    public void setRegNo(int regNo){
        this.regNo = regNo;
    }

    public int getRegNo(){
        return this.regNo;
    }

    public void setDriver(Driver DName) {
        this.DName=DName;

    }

    public ArrayList<Route> getRoutesList() {
        return routes;
    }

    public void displayBus(){
        System.out.println("Registration no: " + regNo);
        System.out.println("Driver Name: " + DName.getDName());
    }

    public void addRoute(Route route) {
        routes.add(route);
    }

    public void deleteRoute(Route route) {
        routes.remove(route);
    }

    abstract void running();
}
