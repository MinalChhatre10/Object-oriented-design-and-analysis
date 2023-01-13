package Dev;

public class Manual extends Buses{
    private Driver d;
    private Conductor c;
    public Manual(String rto_reg, Driver d, Conductor c) {
        super(rto_reg);
        this.c=c;
        this.d=d;
    }

    @Override
    public void display() {
        System.out.println("Manual");
        System.out.println("Bus RTO Registration no: "+this.getRto_reg());
        System.out.println("Driver name : "+this.d.getName());
        System.out.println("Conductor name : "+this.c.getName());
    }
}
