package dev;

public class Loan extends Accounts{
    private double lone_amt_L;
    private double interest_rate_L;
    private int duration_L;
    private double total_repay;
    private double emi;
    public Loan(double balance,Ac_Holder ac_holder,double lone_amt_L,double interest_rate_L,int duration_L) {
        super(balance,ac_holder);
        this.duration_L=duration_L*12;
        this.interest_rate_L=interest_rate_L/(12*100);
        //rate/(12*100)
        this.lone_amt_L=lone_amt_L;
        this.total_repay=lone_amt_L;
    }

    public void setDuration_L(int duration_L) {
        this.duration_L = duration_L;
    }

    public void setInterest_rate_L(double interest_rate_L) {
        this.interest_rate_L = interest_rate_L;
    }

    public void setLone_amt_L(double lone_amt_L) {
        this.lone_amt_L = lone_amt_L;
    }

    public double getInterest_rate_L() {
        return interest_rate_L;
    }

    public double getTotal_repay() {
        return total_repay;
    }

    public double getLone_amt_L() {
        return lone_amt_L;
    }

    public int getDuration_L() {
        return duration_L;
    }

    public void pay_emi(double emi_amt){
        //this.emi= (lone_amt_L*interest_rate_L*Math.pow(1+interest_rate_L,duration_L))/(Math.pow(1+interest_rate_L,duration_L)-1);
       double t_repay=this.total_repay;
       t_repay=t_repay-emi_amt;
       this.total_repay=this.total_repay-t_repay;
       this.setBalance(this.getBalance()-emi_amt);
       System.out.println("Emi Paid");
        System.out.println("Total amount to be replay: "+this.total_repay);
    }
    public double total_repay(){
        double interest_L=(this.lone_amt_L*this.interest_rate_L*this.duration_L)/100;
        this.total_repay=total_repay+interest_L;
        return this.total_repay*12;
    }

    @Override
    public double deposite(Accounts ac) {
        ac.setBalance(ac.getBalance()+this.getLone_amt_L());
        return ac.getBalance();
    }

    @Override
    public void display() {
        System.out.println("Account type : Loan Account");
        System.out.println(this.ac_holder.getF_name());
        System.out.println(this.ac_holder.getL_name());
        System.out.println("Loan amt : "+this.getLone_amt_L());
        System.out.println("Balance : "+this.deposite(this));
        System.out.println("Total amount to repay : "+this.getTotal_repay());
    }
}
