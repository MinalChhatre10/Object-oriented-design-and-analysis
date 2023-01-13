package dev;

public abstract class Accounts {
    Ac_Holder ac_holder;
    private double balance;

    public Accounts(double balance,Ac_Holder ac_holder){
        this.balance=balance;
        this.ac_holder=ac_holder;
    }

    public double getBalance() {
        return balance;
    }



    public void setBalance(double balance) {
        this.balance = balance;
    }
    //    public void deposite(double amt){
//        this.balance= this.balance+amt;
//    }

    public abstract double deposite(Accounts ac);
    public abstract void display();
}
