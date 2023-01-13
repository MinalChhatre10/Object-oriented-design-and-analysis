package dev;

public class Trainee extends Emps{
    private double canteen_all;
    private double total_sal_t;
    private int no_of_days;
    public Trainee(long empid, String name, double base_pay,double canteen_all,int no_of_days) {
        super(empid, name, base_pay);
        this.canteen_all=canteen_all;
        this.no_of_days=no_of_days;
    }

    public void setCanteen_all(double canteen_all) {
        this.canteen_all = canteen_all;
    }

    public double getCanteen_all() {
        return canteen_all;
    }

    public void setNo_of_days(int no_of_days) {
        this.no_of_days = no_of_days;
    }

    public int getNo_of_days() {
        return no_of_days;
    }
    public double monthly_sal(){
        this.total_sal_t = this.getBase_pay()+(this.getCanteen_all()*this.getNo_of_days());
        return this.total_sal_t;
    }

}
