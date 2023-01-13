package dev;

public class Fixed_deposite extends Accounts{
    private double investment;
    private double interest_rate;
    private int duration;
    public Fixed_deposite(double balance,Ac_Holder ac_holder,double investment,double interest_rate,int duration) {
        super(balance,ac_holder);
        this.interest_rate=interest_rate/(12*100);
        this.investment=investment;
        this.duration=duration*12;
    }


    public double getInterest_rate() {
        return interest_rate;
    }

    public int getDuration() {
        return duration;
    }

    public double getInvestment() {
        return investment;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setInterest_rate(double interest_rate) {
        this.interest_rate = interest_rate;
    }

    public void setInvestment(double investment) {
        this.investment = investment;
    }

    public double cal_interest(){
        double interest = (this.investment*this.interest_rate*this.duration)/100;
        return interest;
    }
    public void add_interest(Accounts ac){
         ac.setBalance(this.deposite(ac)+this.cal_interest());
        System.out.println("After adding interest: "+this.getBalance());
    }

    @Override
    public double deposite(Accounts ac) {
        ac.setBalance(ac.getBalance()+this.getInvestment());
        return ac.getBalance();
    }

    @Override
    public void display() {
        System.out.println("Account type : Fixed deposite");
        System.out.println(this.ac_holder.getF_name());
        System.out.println(this.ac_holder.getL_name());
        System.out.println("Investment : "+this.getInvestment());
        System.out.println("Balance : "+this.deposite(this));
        System.out.println("Interest per month : "+this.cal_interest());
    }


}
