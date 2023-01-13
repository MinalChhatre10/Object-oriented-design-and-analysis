package Dev;

public abstract class Accounts {
    private double balance;
    Account_Holder ac_h;

    public Accounts(Account_Holder ac_h,double balance){
        this.ac_h=ac_h;
        this.balance=balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void display();

}
