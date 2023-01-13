package dev;

public class Project_lead extends Emps{
    private double total_sal_p;
    public double da,cta,special_all;
    public Project_lead(long empid, String name, double base_pay,double da,double cta,double special_all) {
        super(empid, name, base_pay);
        this.da=da;
        this.cta=cta;
        this.special_all=special_all;
    }

    public void setCta(double cta) {
        this.cta = cta;
    }

    public void setDa(double da) {
        this.da = da;
    }

    public void setSpecial_all(double special_all) {
        this.special_all = special_all;
    }

    public double getCta() {
        return cta;
    }

    public double getDa() {
        return da;
    }

    public double getSpecial_all() {
        return special_all;
    }
    public double monthly_sal(){
        this.total_sal_p =this.getBase_pay()+this.getDa()+this.getCta()+this.getSpecial_all();
        return this.total_sal_p;
    }
}
