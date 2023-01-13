package Dev;

public abstract class Buses {
    private String rto_reg;
    public Buses(String rto_reg){
        this.rto_reg=rto_reg;
    }

    public void setRto_reg(String rto_reg) {
        this.rto_reg = rto_reg;
    }

    public String getRto_reg() {
        return rto_reg;
    }
    public abstract void display();
}
