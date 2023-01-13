package Dev;

import java.util.ArrayList;

public class Bank {
    Accounts ac;
    ArrayList<Accounts> accounts = new ArrayList<Accounts>();

    public ArrayList<Accounts> getAccounts() {
        return accounts;
    }

    public Accounts getAc() {
        return ac;
    }

    public void addAcocunt(Accounts ac){
        accounts.add(ac);
    }

    public void display(){
        for(Accounts a : accounts){
            a.display();
            System.out.println("\n");
        }
    }
}
