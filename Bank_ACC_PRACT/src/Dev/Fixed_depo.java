package Dev;

public class Fixed_depo extends Accounts{
    private double investment;
    private double rate;
    private double duration;
    public Fixed_depo(Account_Holder ac_h, double balance,double investment,double rate,double duration) {
        super(ac_h, balance);
        this.investment=investment;
        this.rate=rate;
        this.duration=duration;
    }
    public void cal_rate(){
          this.rate = (this.getBalance()*this.rate*this.duration)/100;
        System.out.println("Interest amount: "+this.rate);
          this.setBalance(this.getBalance()+this.rate);
    }


    @Override
    public void display() {
        System.out.println("FD account");
        System.out.println("First Name: "+ac_h.getFirst());
        System.out.println("Last Name: "+ac_h.getLast());
        System.out.println("Balance: "+this.getBalance());
    }
}
