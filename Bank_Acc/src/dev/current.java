package dev;

public class current extends Bank_Account{

    public current(long acc_no, double balance) {
        super(acc_no, balance);
    }

    @Override
    public void withdrawl(double amount) {
        if(this.getterBANK_ACC_Bal()<=0){
            System.out.println("You have not sufficient balance");
        }else {
            double comm = (amount * 1.5) / 100;
            this.setterBANK_ACC_Bal(getterBANK_ACC_Bal() - (amount + comm));
        }
    }

   public void transfer(Bank_Account ab, double amt) {
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
        System.out.println("Current Acoount Information ... ");
        System.out.println("Account no : "+this.getterBANK_ACC_Ac_NO()+" Balance: "+this.getterBANK_ACC_Bal());
    }
}
