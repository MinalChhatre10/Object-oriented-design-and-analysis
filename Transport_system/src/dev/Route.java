package dev;

import java.util.ArrayList;
import java.util.List;

public class Route {
    private int route_no;
    private Stop start, end;

    private ArrayList<Stop> stops = new ArrayList<Stop>();
    private ArrayList<Bus> buses = new ArrayList<Bus>();

    public Route(int route_no){
        this.route_no=route_no;
    }
    public void setRoute_no(int route_no){
        this.route_no = route_no;
    }

    public int getRoute_no() {
        return this.route_no;
    }

    public Stop getStart(){
        return this.start;
    }
    public void setStart(Stop start){
        this.start = start;
    }

    public void setend(Stop end){
        this.end = end;
    }
    public Stop getend(){
        return this.end;
    }

    public ArrayList<Stop> getStop(){
        return this.stops;
    }

    public void setStops(ArrayList<Stop> stops){
        this.stops = stops;
    }

    public void addStops(String stopName) {
        Stop s = new Stop(stopName);
        stops.add(s);
    }

    public ArrayList<Bus> getBuses(){
        return this.buses;
    }

    public void setBuses(ArrayList<Bus> buses){
        this.buses=buses;
    }

    public void displayRoute() {
        System.out.println("Route No: " + route_no);
        System.out.println("Start: " + this.getStart().getStopName());
        System.out.println("End: " + this.getend().getStopName());
        System.out.println("Stops: ");
        for ( Stop x: stops) {
            System.out.println(x.getStopName());
        }

    }
}
