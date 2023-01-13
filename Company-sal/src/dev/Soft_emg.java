package dev;

public class Soft_emg extends Emps{
    public double hra;
    private double total_sal_s;
    public Soft_emg(long empid, String name, double base_pay,double hra) {
        super(empid, name, base_pay);
        this.hra=hra;
    }

    public void setHra(double hra) {
        this.hra = hra;
    }

    public double getHra() {
        return hra;
    }
    public double monthly_sal(){
        this.total_sal_s = this.getBase_pay()+this.getHra();
        return this.total_sal_s;
    }
}
