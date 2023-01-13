package user;
import dev.*;
public class MAin {
    public static void main(String[] args){
        Country c1= new Country("India");
        Playgorund p1= new Playgorund(40,30);
        p1.diplay();
        Playgorund p2= new Playgorund(46,32);
        p2.diplay();
        Playgorund p3= new Playgorund(20,40);
        p3.diplay();
        Playgorund p4= new Playgorund(30,30);
        p4.diplay();
        Playgorund p5= new Playgorund(10,50);
        p5.diplay();
        State s1 = new State("Rajastan");
        s1.addPlaygrund(p1);
        s1.addPlaygrund(p2);
        s1.addPlaygrund(p3);
        s1.addPlaygrund(p4);
        s1.addPlaygrund(p5);
        s1.display();

        Playgorund p6= new Playgorund(23,34);
        p6.diplay();
        Playgorund p7= new Playgorund(48,39);
        p7.diplay();
        Playgorund p8= new Playgorund(12,23);
        p8.diplay();
        Playgorund p9= new Playgorund(20,45);
        p9.diplay();
        State s2 = new State("Gujrat");
        s2.addPlaygrund(p6);
        s2.addPlaygrund(p7);
        s2.addPlaygrund(p8);
        s2.addPlaygrund(p9);
        s2.display();

        c1.addSTATE(s1);
        c1.addSTATE(s2);
        c1.display();


    }
}
