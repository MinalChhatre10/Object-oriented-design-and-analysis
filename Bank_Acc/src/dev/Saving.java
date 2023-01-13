package dev;

public class Saving extends Bank_Account{
    public Saving(long acc_no, double balance) {
        super(acc_no, balance);
    }

    public void add_Interest(){
        double interest = (this.getterBANK_ACC_Bal()*1*3)/100;
          this.setterBANK_ACC_Bal(this.getterBANK_ACC_Bal()+interest);
        }

    @Override
    public void withdrawl(double amount) {
        if(this.getterBANK_ACC_Bal()<=0){
            System.out.println("You have not sufficient balance");

        }
        else{
            this.setterBANK_ACC_Bal(getterBANK_ACC_Bal() - amount);
        }

    }


    public void transfer(Bank_Account ab,double amt) {
        if(this.getterBANK_ACC_Bal()<=0){
            System.out.println("You have not sufficient balance\n YOur Balance : 0");
        }
        else{
            this.withdrawl(amt);
            ab.deposite(amt);
            System.out.println("Transaction is successful");

        }
    }

    @Override
    public void display() {
        System.out.println("Savings Acoount Information ... ");
        System.out.println("Account no : "+this.getterBANK_ACC_Ac_NO()+" Balance: "+this.getterBANK_ACC_Bal());
    }
}
