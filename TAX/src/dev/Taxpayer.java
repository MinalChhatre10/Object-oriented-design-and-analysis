package dev;

public class Taxpayer {
    private String name;

    private double annual_income;
    private double tax_rate;

    public Taxpayer(String name,double annual_income,double tax_rate){
        this.name=name;
        this.annual_income=annual_income;
        this.tax_rate=tax_rate;
    }

    public void setAnnual_income(double annual_income) {
        this.annual_income = annual_income;
    }

    public double getAnnual_income() {
        return annual_income;
    }

    public double cal_tax(){
        if(this.annual_income>300000){
            double tax_amt=(this.annual_income*this.tax_rate)/100;
            return tax_amt;
        }
        else{
            return 0;
        }
    }
    public double cal_netAMT(){
        double net=this.annual_income-this.cal_tax();
        return net;
    }
    public void displayT(){
        System.out.println("Annual Income: "+this.annual_income);
        System.out.println("Tax Rate: "+this.tax_rate);
        System.out.println("Net Amount: "+this.cal_netAMT());
    }
}
