package dev;

public class Saving extends Accounts{
    private double interest_rate;
    private final int MINIMUM_BAL=1000;
    public Saving(long ac_no, Account_holder ac_name, double balance,double interest_rate) {
        super(ac_no, ac_name, balance);
        this.interest_rate=interest_rate;
    }

    public void add_interest(){
        double interest = (this.getBalance()*this.interest_rate*1)/100;
        this.setBalance(this.getBalance()+interest);
    }

    public void setInterest_rate(double interest_rate) {
        this.interest_rate = interest_rate;
    }

    public double getInterest_rate() {
        return interest_rate;
    }

    @Override
    public void withdrawl(double amt) {
        if(this.getBalance()>=(this.MINIMUM_BAL+amt)){
            this.setBalance(this.getBalance()-amt);
        }
        else{
           System.out.println("You have insufficient balance");
        }

    }

    @Override
    public void transfer(Accounts ac, double amt) {
        this.withdrawl(amt);
        ac.deposite(amt);
    }

    @Override
    public void display() {
        System.out.println("Account type: Current acount");
        System.out.println(this.getAc_name().getName());
        System.out.println(this.getAc_no());
        System.out.println(this.getBalance());
    }
}
