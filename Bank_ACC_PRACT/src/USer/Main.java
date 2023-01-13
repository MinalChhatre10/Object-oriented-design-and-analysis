package USer;

import Dev.Account_Holder;
import Dev.Bank;
import Dev.Fixed_depo;
import Dev.Loan;

public class Main {
    public static void main(String[] args){
        Bank b1 = new Bank();
        Account_Holder fd1 = new Account_Holder("Mina","Chh");
        Account_Holder fd2 = new Account_Holder("Minal","Chhatre");
        Account_Holder fd3 = new Account_Holder("Suman","Chh");

        Account_Holder lo1 = new Account_Holder("Suman","Chhatre");
        Account_Holder lo2 = new Account_Holder("Sham","Chhatre");
        Account_Holder lo3 = new Account_Holder("Shamrao","Chhatre");

        Fixed_depo fa1 = new Fixed_depo(fd1,500,50000,5.5,2);
        Fixed_depo fa2 = new Fixed_depo(fd2,500,150000.00,5.5,3);
        Fixed_depo fa3 = new Fixed_depo(fd3,500,30000.00,5.5,1);

        Loan la1 = new Loan(lo1,500,500000.00,8,5);
        Loan la2 = new Loan(lo2,500,800000.00,8,10);
        Loan la3 = new Loan(lo3,500,300000.00,8,7);

        fa1.cal_rate();
        fa1.display();

        fa2.cal_rate();
        fa2.display();

        fa3.cal_rate();
        fa3.display();
        System.out.println("Loan account 1");
        la1.cal_interest_rate();
        double emi= la1.cal_emi();
        la1.pay_emi(emi);
        la1.display();
        System.out.println("Loan account 2");
        la2.cal_interest_rate();
         emi= la2.cal_emi();
        la2.pay_emi(emi);
        la2.display();

        System.out.println("Loan account 3");

        la3.cal_interest_rate();
         emi= la3.cal_emi();
        la3.pay_emi(emi);
        la3.display();
        b1.display();
    }
}
