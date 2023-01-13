package user;
import dev.*;

import java.util.*;

public class Main {
    public static void main(String args[]){
        Saving s1 = new Saving(1100001234,6000.00);
        Saving s2 = new Saving(1100001234,7000.00);
        current c1 = new current(220000123,10000.00);
        current c2 = new current(220000123,9000.00);

        s1.deposite(3000.00);
        System.out.println("3000 is deposited to savings account");
        s1.display();//(6000+3000)=9000.0
        s1.withdrawl(5000.00);
        System.out.println("5000 is withdrawl from savings account");
        s1.display();//(9000-5000)=4000.0

        c1.deposite(4000.00);
        System.out.println("4000 is deposited to current account");
        c1.display();//(10000+4000)=14000.0
        c2.withdrawl(6000.00);
        System.out.println("6000 is withdrawl from current account");
        c2.display();//(9000-6000) adding 1.5 cummision=2910rs

        c1.transfer(s2,4000.00);
        c1.display();
        s2.display();
        //c1=14000,s2=7000 // c1=9940 //s2= 11000
        System.out.println("4000 is transferred from current account to savings account");
        s1.transfer(c2,2000.00);//s1=4000//c2=2910 // s1=2000 //c2=4910
        s1.display();
        c2.display();
        System.out.println("2000 is transferred from savings account to current account");


        System.out.println("Added Interest to savings account..");
        s1.add_Interest();//s1=2000
        s1.display();//s1=2060
        System.out.println("Added Interest to savings account..");
        s2.add_Interest();//s2=11000
        s2.display();//s2=11330

    }
}
