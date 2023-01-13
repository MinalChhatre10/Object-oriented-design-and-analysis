package Dev;

public class Loan extends Accounts{
    private double loan_amount;
    private double interest_rate;
    private int duration;
    private double repay;
    private double emi;
    public Loan(Account_Holder ac_h, double balance,double loan_amount, double interest_rate,int duration) {
        super(ac_h, balance);
        this.setBalance(getBalance()+loan_amount);
        this.loan_amount=loan_amount;
        this.interest_rate=interest_rate;
        this.duration=duration;
        this.repay=loan_amount;
    }

    public double getInterest_rate() {
        return interest_rate;
    }

    public int getDuration() {
        return duration;
    }

    public double getEmi() {
        return emi;
    }

    public double getLoan_amount() {
        return loan_amount;
    }

    public double getRepay() {
        return repay;
    }

    public void cal_interest_rate(){
        double p = this.loan_amount;
        double r= this.interest_rate/(12*100);
        int t= this.duration*12;
        double interest = (p*r*t)/100;
        System.out.println("Interest amount: "+interest);
        this.repay=this.repay+interest;
    }
    public double cal_emi(){
        double p = this.loan_amount;
        double r= this.interest_rate/(12*100);
        int t= this.duration*12;
        this.emi= (p*r*Math.pow(1+r,t))/(Math.pow(1+r,t)-1);
        System.out.println("Emi to pay: "+this.emi);
        return this.emi;
    }

    public void pay_emi(double emi){
        this.repay=this.repay-this.emi;
        System.out.println("remaining amount to pay: "+this.repay);
        setBalance(this.getBalance()-this.emi);
    }
    @Override
    public void display() {
        System.out.println("Loan account");
        System.out.println("First Name: "+ac_h.getFirst());
        System.out.println("Last Name: "+ac_h.getLast());
        System.out.println("Loan amt: "+this.getLoan_amount());
        System.out.println("Balance: "+this.getBalance());
        System.out.println("interest rate: "+this.getInterest_rate());
        System.out.println("emi: "+this.getEmi());
        System.out.println("repay amt: "+this.getRepay());
        System.out.println("Balance: "+this.getBalance());
    }
}
