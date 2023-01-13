package dev;

import java.util.ArrayList;

public class Bank {
    Accounts ac;
    ArrayList<Accounts> aclist= new ArrayList<Accounts>();

    public void setAclist(ArrayList<Accounts> aclist) {
        this.aclist = aclist;
    }

    public ArrayList<Accounts> getAclist() {
        return aclist;
    }

    public void addAc(Accounts ac){
        aclist.add(ac);
    }

    public void display(){
        for(Accounts a : aclist){
            a.display();
        }
    }
}
