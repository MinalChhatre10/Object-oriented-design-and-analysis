package dev;

import java.util.ArrayList;

public class Company {
    private  double pay_amt;
    Emps emp;
    ArrayList<Emps> amp = new ArrayList<Emps>();

    public Emps getEmp() {
        return emp;
    }

    public ArrayList<Emps> getAmp() {
        return amp;
    }

    public void addemp(Emps em){
        amp.add(em);
    }

    public void pay_amt(){
        for(Emps e: amp){
            this.pay_amt = this.pay_amt+e.monthly_sal();
        }
        System.out.println("Total amount which the company needs to pay as a salary of all the employees in a\n" +
                "month: "+this.pay_amt);
    }
}
