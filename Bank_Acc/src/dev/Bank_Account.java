package dev;

abstract class Bank_Account {
    private long acc_no;
    private double balance;

    public Bank_Account(long acc_no,double balance){
        this.acc_no=acc_no;
        this.balance=balance;
    }
    public void setterBANK_ACC_Ac_NO(long acc_no){
        this.acc_no=acc_no;
    }
    public void setterBANK_ACC_Bal(double balance){
        this.balance=balance;
    }
    public long getterBANK_ACC_Ac_NO(){
        return acc_no;
    }
    public double getterBANK_ACC_Bal(){
        return balance;
    }
    abstract void withdrawl(double amount);
    abstract void transfer(Bank_Account ba,double amt);
    abstract void display();

    public double deposite(double amt){
        this.balance=this.balance+amt;
        return this.balance;
    }
}
