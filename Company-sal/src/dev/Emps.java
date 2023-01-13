package dev;

public abstract class Emps {
    private long empid;
    private String name;
    private double base_pay;

    public Emps(long empid,String name,double base_pay){
        this.empid= empid;
        this.name=name;
        this.base_pay=base_pay;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBase_pay(double base_pay) {
        this.base_pay = base_pay;
    }

    public void setEmpid(long empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public double getBase_pay() {
        return base_pay;
    }

    public long getEmpid() {
        return empid;
    }
    public abstract double monthly_sal();
}
