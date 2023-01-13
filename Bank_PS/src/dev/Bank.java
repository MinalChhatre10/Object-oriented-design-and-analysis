package dev;

import java.util.ArrayList;

public class Bank {
    Accounts ac;
    ArrayList<Accounts> accounts = new ArrayList<Accounts>();

    public void setAccounts(ArrayList<Accounts> accounts) {
        this.accounts = accounts;
    }

    public ArrayList<Accounts> getAccounts() {
        return accounts;
    }
    public void add_account(Accounts ac){
        accounts.add(ac);
    }
    public void display_Acc(){
        for(Accounts ac : accounts){
            ac.display();
        }
    }
}
