package user;

import dev.Country;
import dev.States;
import dev.Taxpayer;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        Country c1= new Country("India");
        States s1 = new States("Maharashtra");
        States s2 = new States("Kerala");
        c1.addState(s1);
        c1.addState(s2);

        Taxpayer t1= new Taxpayer("p1",300000,5);
        Taxpayer t2= new Taxpayer("p2",1200000.00,18);
        Taxpayer t3= new Taxpayer("p3",800000.00,15);
        Taxpayer t4= new Taxpayer("p4",1000000.00,12);

        s1.addTaxPayers(t1);
        s1.addTaxPayers(t2);

        s2.addTaxPayers(t3);
        s2.addTaxPayers(t4);

        t1.displayT();
        t2.displayT();
        t3.displayT();
        t4.displayT();

        s1.displayS();
        s2.displayS();

        c1.displayC();

    }
}