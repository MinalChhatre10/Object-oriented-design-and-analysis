package dev;

public class Current extends Accounts{
    private double comm_rate;
    public Current(long ac_no, Account_holder ac_name, double balance,double comm_rate) {
        super(ac_no, ac_name, balance);
        this.comm_rate=comm_rate;
    }

    public void setComm_rate(double comm_rate) {
        this.comm_rate = comm_rate;
    }

    public double getComm_rate() {
        return comm_rate;
    }

    @Override
    public void withdrawl(double amt) {
        double commision  = (amt*this.comm_rate)/100;
        if(this.getBalance()>=(amt+commision)){
            this.setBalance(this.getBalance()-(amt+commision));
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
