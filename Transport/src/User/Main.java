package User;

import Dev.*;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        Transport t1= new Transport();

        Employees d1= new Driver("CHH","Suresh");
        Employees d2= new Driver("sHH","Ramesh");
        Employees d3= new Driver("rHH","Ram");
        Employees d4= new Driver("qHH","Sahane");
        Employees d5= new Driver("yHH","Pankaj");

        Employees c1= new Conductor("uHH","Radhe");
        Employees c2= new Conductor("hHH","Akash");
        Employees c3= new Conductor("vHH","Sagar");
        Employees c4= new Conductor("oHH","Ratan");
        Employees c5= new Conductor("pHH","Rohan");

        Ticket_mach tm1 = new Ticket_mach(37652738);
        Ticket_mach tm2 = new Ticket_mach(999952738);

        t1.addemp(d1);
        t1.addemp(d2);
        t1.addemp(d3);
        t1.addemp(d4);
        t1.addemp(d5);
        t1.addemp(c1);
        t1.addemp(c2);
        t1.addemp(c3);
        t1.addemp(c4);
        t1.addemp(c5);

        Buses m1 = new Manual("RTO1111", (Driver) d1, (Conductor) c1);
        Buses m2 = new Manual("RTO333", (Driver) d2, (Conductor) c2);
        Buses m3 = new Manual("RTO321", (Driver) d3, (Conductor) c3);

        Buses a1 = new Automatic("RTO5551", (Driver) d4, tm1);
        Buses a2 = new Automatic("RTO6771", (Driver) d5, tm2);

        t1.addBus(m1);
        t1.addBus(m2);
        t1.addBus(m3);
        t1.addBus(a1);
        t1.addBus(a2);

        t1.displayBus();
        t1.displayemp();


    }
}