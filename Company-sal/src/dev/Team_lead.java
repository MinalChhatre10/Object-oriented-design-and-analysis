package dev;

public class Team_lead extends Emps{
    private double bonus;
    private double total_sal_tl;
    private double tarveling_all;
    public Team_lead(long empid, String name, double base_pay,double bonus,double tarveling_all) {
        super(empid, name, base_pay);
        this.bonus=bonus;
        this.tarveling_all=tarveling_all;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setTarveling_all(double tarveling_all) {
        this.tarveling_all = tarveling_all;
    }

    public double getBonus() {
        return bonus;
    }

    public double getTarveling_all() {
        return tarveling_all;
    }
    public double monthly_sal(){
        this.total_sal_tl = this.getBase_pay()+this.getBonus()+this.getTarveling_all();
        return this.total_sal_tl;
    }
}
