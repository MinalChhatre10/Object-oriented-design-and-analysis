package dev;

public abstract class Accounts {
    Account_holder ac_name;
    private long ac_no;
    private double balance;
    public Accounts(long ac_no,Account_holder ac_name,double balance){
        this.ac_name= ac_name;
        this.ac_no=ac_no;
        this.balance=balance;
    }
    public double deposite(double amt){
        this.balance=this.balance+amt;
        return this.balance;
    }
    public abstract void withdrawl(double amt);
    public abstract void transfer(Accounts ac,double amt);

    //setter,getter
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAc_name(Account_holder ac_name) {
        this.ac_name = ac_name;
    }

    public void setAc_no(long ac_no) {
        this.ac_no = ac_no;
    }

    public double getBalance() {
        return balance;
    }

    public Account_holder getAc_name() {
        return ac_name;
    }

    public long getAc_no() {
        return ac_no;
    }

    public abstract void display();
}
