package user;

import dev.*;

public class Main {
    public static void main(String[] args){
        Bank b1=new Bank();
        Ac_Holder fdac1 = new Ac_Holder("Ram","Jha");
        Ac_Holder fdac2 = new Ac_Holder("Lakhan","Kale");
        Ac_Holder fdac3 = new Ac_Holder("Tina","Kamble");
        Fixed_deposite fd1= new Fixed_deposite(500,fdac1,50000,5.5,2);
        Fixed_deposite fd2= new Fixed_deposite(500,fdac2,150000,5.5,3);
        Fixed_deposite fd3= new Fixed_deposite(500,fdac3,30000,5.5,1);

        Ac_Holder lac1 = new Ac_Holder("Rakhi","Pardesi");
        Ac_Holder lac2 = new Ac_Holder("Minal","Chhatre");
        Ac_Holder lac3 = new Ac_Holder("Kiran","Mane");
        Loan l1 = new Loan(500,lac1,50000,8,5);
        Loan l2 = new Loan(500,lac2,80000,8,10);
        Loan l3 = new Loan(500,lac3,30000,8,7);

        b1.addAc(fd1);
        b1.addAc(fd2);
        b1.addAc(fd3);
        b1.addAc(l1);
        b1.addAc(l2);
        b1.addAc(l3);

        b1.display();
    }
}
