package user;

import dev.*;

public class Main {
    public static void main(String[] args) {
        Bank b1= new Bank();
        Account_holder s1n = new Account_holder("Minal");
        Account_holder s2n = new Account_holder("Suman");
        Account_holder s3n = new Account_holder("Sham");
        Accounts s1= new Saving(1111,s1n,10000.5,3);
        s1.deposite(4000);
        s1.display();
        s1.deposite(3700);
        s1.display();
        s1.withdrawl(17000.00);
        s1.display();
        Accounts s2= new Saving(2222,s2n,5000.00,3);
        s2.deposite(6000.00);
        s2.display();
        s2.withdrawl(2000.00);
        s2.display();
        s2.withdrawl(2000.00);
        s2.display();
        Accounts s3= new Saving(33333,s3n,2000.00,3);
        s3.deposite(5000.00);
        s3.display();
        s3.withdrawl(4000.00);
        s3.display();
        s3.transfer(s1,1000);
        s3.display();
        s1.display();
        Account_holder c1n = new Account_holder("Kishor");
        Accounts c1=new Current(4444,c1n,25000.00,1.5);
        c1.deposite(10000.00);
        c1.display();
        c1.withdrawl(30000.00);
        c1.display();
        c1.withdrawl(10000.00);
        c1.display();

        b1.display_Acc();
    }
}