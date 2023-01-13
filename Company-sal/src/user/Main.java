package user;

import dev.*;

public class Main {
    public static void main(String[] args){
        Company c1= new Company();
        Emps t1= new Trainee(1,"abs",2000,122,25);
        Emps s1= new Soft_emg(1,"abs",2000,122);
        Emps tl1= new Team_lead(1,"abs",2000,122,25);
        Emps p1= new Project_lead(1,"abs",2000,122,3456,3333);

        c1.addemp(t1);
        c1.addemp(s1);
        c1.addemp(tl1);
        c1.addemp(p1);

        c1.pay_amt();
    }
}
